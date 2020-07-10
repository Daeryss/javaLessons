import java.sql.*;

public class lesson44_dataBase {
    public static void main(String[] args) {
        DataBase app = new DataBase();
        app.setConn("less44.db");
        app.insertNewValues("greg", "234", 2342);
        app.insertNewValues("billy", "234", 321234);
        app.show();
        app.deleteAll();
        app.close();
    }
}

class DataBase {
    private Connection conn = null;

    public void setConn(String fileName) {
        String url = "jdbc:sqlite:" + fileName;
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }
        this.conn = con;
        createDataBase(fileName);
        createNewTable(fileName);
    }

    public static void createDataBase (String fileName) {
        String url = "jdbc:sqlite:" + fileName;

        try (Connection con = DriverManager.getConnection(url)) {
            if (con != null) {
                DatabaseMetaData meta = con.getMetaData();
                //System.out.println("The driver name is " + meta.getDriverName());
                //System.out.println("Successfully create new database");
            }
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Create database error");
        }
    }

    public static void createNewTable(String fileName){
        String url = "jdbc:sqlite:" + fileName;

        String sql = "CREATE TABLE IF NOT EXISTS card (\n"
                + "     id INTEGER PRIMARY KEY,\n"
                + "     number TEXT NOT NULL, \n"
                + "     pin TEXT, \n"
                + "     balance INTEGER DEFAULT 0"
                +");";

        try (Connection con = DriverManager.getConnection(url);
             Statement stm = con.createStatement()){
            stm.execute(sql);
            //System.out.println("Successfully create new table in " + fileName);
        }
        catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error with table creator");
        }
    }

    public void insertNewValues(String number, String pin, int balance) {
        String sql = "INSERT INTO card (number, pin, balance) VALUES (?,?,?)";


        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, number);
            pstmt.setString(2, pin);
            pstmt.setInt(3, balance);
            pstmt.executeUpdate();
            //System.out.printf("%s and %s successfully added in table\n", number, pin);
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in INSERT");
        }
    }

    public void show() {
        String sql = "SELECT id, number, pin, balance FROM card";
        int i = 0;

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("%-3s %-15s %-6s %-6s\n", rs.getInt("id"), rs.getString("number"), rs.getString("pin"), rs.getInt("balance"));
            }
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in SELECT");
        }
    }

    public void update (String number, int balance, boolean plus) {
        String sql = null;
        if (plus) {
            sql = "UPDATE card SET balance = balance + ? "
                    + " WHERE number = ?";
        } else {
            sql = "UPDATE card SET balance = balance - ? "
                    + " WHERE number = ?";
        }

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, balance);
            pstmt.setString(2, number);

            pstmt.executeUpdate();
            //System.out.println("Complete successfully update");
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error int update");
        }
    }

    public void delete (String number) {
        String sql = "DELETE FROM card WHERE number = ?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, number);
            pstmt.executeUpdate();
            //System.out.println("Successfully delete data");
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in delete");
        }
    }

    public void deleteAll () {
        String sql = "DELETE FROM card WHERE id > ?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, 0);

            pstmt.executeUpdate();
            System.out.println("Successfully delete data");
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in deleteAll");
        }
    }

    public int selectBalance (String str) {
        String sql = "SELECT id, number, pin, balance FROM card";
        int x = 0;

        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                if (str.equals(rs.getString("number"))){
                    x = rs.getInt("balance");
                }
            }
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in selectBalance");
        }
        return x;
    }

    public String selectPin (String str) {
        String sql = "SELECT id, number, pin, balance FROM card";
        String x = null;

        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                if (str.equals(rs.getString("number"))){
                    x = rs.getString("pin");
                }
            }
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in selectPin");
        }
        return x;
    }

    public boolean selectNum (String str) {
        String sql = "SELECT id, number, pin, balance FROM card";
        str = str.trim();
        boolean ans = false;

        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                if (str.equals(rs.getString("number"))){
                    ans = true;
                }
            }
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in selectNum");
        }

        if (!ans) {
            System.out.println("you check this " + str);
        } else {
            System.out.println(str + " this card exist");
        }
        return ans;
    }

    public void close () {
        try {
            conn.close();
            System.out.println("Succesfully close connect session");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error in connection close");
        }
    }
}
