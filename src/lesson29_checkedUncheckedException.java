// checked (compile time exception) - проверенные исключения, возникают во время компиляции
// без обработки checked exception программа не скомпилируется

// unchecked (runtime exception) - появляются во время выполнения программ
// программа с этими ошибками скомпилируется и поломается только на строке кода, где допущена ошибка,
// например << int x = 1 / 0; >>


import javax.naming.NamingException;
import javax.xml.crypto.MarshalException;
import java.io.IOException;

public class lesson29_checkedUncheckedException {
    public static void main(String[] args) {
        try{                    // попробуй выполнить этот код
            run();
        } catch (IOException | NamingException e) { // поймает и обработает эти два вида ошибок

        } catch (Exception e) { // поймает и обработает любую ошибку

        }
    }
    public static void run() throws IOException, NamingException {

    }
}


