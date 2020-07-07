/*
 SQL - structured query language (язык структурированных запросов).
 SQL работает с базами данных .db (database), которые хранят информацию в таблицах
 в одной базе данных может быть несколько таблиц.
 PostgreSQL - система управления базами данных (СУБД)
 основные выраения:
 CREATE DATABASE name;  - сохжает базу данных name.db
 CREATE TABLE winners ( - создает таблицу "winners" в базе данных "name.db"
    year INTEGER NOT NULL,          - столбец "year" числовой, не может быть пустым
    field VARCHAR(20) NOT NULL,     - столбец "field" ,буквенный, не может быть пустым
    winner_birth_year INTEGER);     - столбец "winner_birth_year" числовой, может быть пустым

SELECT
    year as "date",             -  выведет значения из столбца "year" в "date"
    field
FROM
    winners                     - из какой таблицы данные
;

WHERE - указание условий (where yaer > 1961 or winner_birth >1965;)
INSERT INTO customers (name, surname, zip_code, city) VALUES ('Bobby', 'Ray', 60601, 'Chicago'); - для внесения данных в таблицу
INSERT INTO customers VALUES ('Mary', 'West', 75201, 'Dallas'), ('Steve', 'Palmer', 33107, 'Miami')
DROP DATABASE database_name; - удалить базу данных
DROP TABLE table_name; - удалить таблицу
*/

import java.sql.*;

public class lesson44_SQL {


    public static void main(String[] args) {
        String fileName = "newDataBase.db";
        //connect(); // подключение к имеющейся базе данных
        createDataBase(fileName); // создание новой базы данных
        createNewTable(fileName); // создает таблицу в имеющейся базе данных


        lesson44_SQL app = new lesson44_SQL();
        app.insertNewValues("Raw Materials", 3000); // добавить значения см метод
        app.insertNewValues("Semifinished Goods", 4000);
        app.insertNewValues("Finished Goods", 5000);

        app.update(3, "update values", 1221); // меняет выбранные значения

        app.selectAll(); // выводит все значения таблицы
        app.delete(2); // удалить данные
        System.out.println();
        app.selectAll();

    }

    public static void connect() {
        // перед первым запуском необходимо добавить sqlite-jdbc-3.27.2.1.jar
        Connection con = null;
        try {
            String url = "jdbc:sqlite:c:\\SQLite\\test.db";
            con = DriverManager.getConnection(url);
            System.out.println("Successfully connect");
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println((e.getMessage()));
                System.out.println("error in connection");
            }
        }
    }

    public static void createDataBase (String fileName) {
        String url = "jdbc:sqlite:" + fileName;

        try (Connection con = DriverManager.getConnection(url)) {
            if (con != null) {
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("Successfully create new database");
            }
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Create database error");
        }
    }

    public static void createNewTable(String fileName){
        String url = "jdbc:sqlite:" + fileName;

        String sql = "CREATE TABLE IF NOT EXISTS justTable (\n"
                + "     id INTEGER PRIMARY KEY,\n"
                + "     name VARCHAR(50) NOT NULL, \n"
                + "     capacity REAL\n"
                +");";

        try (Connection con = DriverManager.getConnection(url);
            Statement stm = con.createStatement()){
                stm.execute(sql);
            System.out.println("Successfully create new table in " + fileName);
        }
         catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error with table creator");
        }
    }

    private Connection connection() {
        String url = "jdbc:sqlite:newDataBase.db";

        Connection con = null;

        try {
            con = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }
        return con;
    }

    public void insertNewValues(String name, double capacity) {
        String sql = "INSERT INTO justTable (name, capacity) VALUES (?,?)";


        try (Connection con = this.connection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
                 pstmt.setString(1, name);
                 pstmt.setDouble(2, capacity);
                 pstmt.executeUpdate();
            System.out.printf("%s and %s successfully added in table\n", name, capacity);
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in INSERT");
        }
    }

    public void selectAll() {
        String sql = "SELECT id, name, capacity FROM justTable";

        try (Connection con = this.connection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("%-3s %-15s %-6s\n", rs.getInt("id"), rs.getString("name"), rs.getDouble("capacity"));
            }
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in SELECT");
        }
    }

    public void update (int id, String name, double capacity) {
        String sql = "UPDATE justTable SET name = ? , "
                + "capacity = ? "
                + " WHERE id = ?";

        try (Connection con = this.connection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, capacity);
            pstmt.setInt(3, id);

            pstmt.executeUpdate();
            System.out.println("Complete successfully update");
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error int update");
        }
    }

    public void delete (int id) {
        String sql = "DELETE FROM justTable WHERE id > ?";

        try (Connection con = this.connection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);

            pstmt.executeUpdate();
            System.out.println("Successfully delete data");
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("Error in delete");
        }
    }


}