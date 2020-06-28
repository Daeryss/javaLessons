import java.io.File;
import java.nio.file.Files; // класс состоит из методов , которые работают с файлами
import java.nio.file.Paths; //класс содержит набор методов , которые возвращают специальный объект, представляющий путь к файлу
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class lesson37_readingFile {
    public static void main(String[] args) throws IOException {
        String pathToFile = "lesson37.txt";
        File file = new File(pathToFile);
        try (Scanner s = new Scanner(file)){ // чтение через Scanner возможно, если при создании file указан путь до него
            // для чтения из файла сканер работает аналогично чтению из консоли
            while (s.hasNext()) {
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found" + pathToFile);
        }
        System.out.println(readFileAsString(file.getAbsolutePath()));
    }

    public static String readFileAsString (String fileName) throws IOException{
        return new String(Files.readAllBytes(Paths.get(fileName))); // читает файл одной строкой
    }
}
