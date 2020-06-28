import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class lesson38_writingFile {
    public static void main(String[] args) throws IOException {

        File file = new File("lesson38.txt");
        FileWriter writer = new FileWriter(file); // если файла не было, он создасться и в него запишется текст
        Scanner s = new Scanner(file);

        writer.write("Hello");
        writer.write("Java\n");

        writer.close();
        FileWriter writer1 = new FileWriter(file, true); // (file, true) - добавить, (file, false) - переписать
        writer1.write("hello word");
        writer1.close();    // обязательно следует закрывать writer, дабы избежать утечек

        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
        // обойтись без .close можно, используя try/catch

        try (FileWriter writer2 = new FileWriter(file, false)){
            writer2.write("\nnew string");
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        // класс PrintWriter может выводить строки, примитивные типы и даже массив символов
        File file1 = new File("less38.3.txt");
        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.print("hello ");
            printWriter.println("Java!");
            printWriter.println(123);
            printWriter.printf("this is number %d", 23);

        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName());
        }
        Scanner scanner = new Scanner(file1);
        while (scanner.hasNext()){
            System.out.println("it is from less38.3.txt " + scanner.nextLine());
        }
        file1.delete();
        File file2 = new File("lesson38.2.txt");
        file2.delete();

    }
}
