import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lesson27_readFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in); // чтение из строки
        String separator = File.separator; // универсальный сеператор для вин и юникс \ или /
        String path = separator + "Users" + separator + "User"
                + separator + "IdeaProjects" +  separator + "lessons" + separator + "src";
        File file  = new File("lesson27"); // если файл лежит в корневой папке (lessons в данном случае)
                            //  до него не надо указывать путь, Java сама его подгрузит, в остальных случаях надо
        Scanner fromFile = new Scanner(file); // читаем даные через сканнер, но в скобках указали источник данных
        String str = fromFile.nextLine();
        System.out.println(str);
    }
}
