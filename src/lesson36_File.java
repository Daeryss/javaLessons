/*
*  класс File - используется для управления файлами
*  (создание, удаление, доступ к свойствам чтение, запись из них и тд)
*  Объекты File класса неизменны; то есть, после создания абстрактный путь,
*  представленный объектом, никогда не изменится.
*
* абсолютный путь к файлу - полный путь, например "C:\\Users\\User\\IdeaProjects\\lessons\\test.pdf"
* Относительный путь - путь от текущего каталога, начинается с ".", например "./images/picture.jpg"
*/
import java.io.File;
import java.io.IOException;

public class lesson36_File {
    public static void main(String[] args) throws IOException {
        File fileOnWin = new File("C:\\Users\\User\\IdeaProjects\\lessons", "newFile");
        System.out.println(File.separator); // выведет разделитель для актуальной ОС
        File fileOnWin2 = new File ("./images/picture.jpg"); // == ""images/picture.jpg";
                                                    // "../picture.jpg" файл из родительского каталога
                                            //Относительный путь images\..\picture.jpg означает подкаталог images
                                            // в рабочем каталоге, а затем файл picture.jpg
        fileOnWin.getPath(); // выводит путь к файлу
        fileOnWin.getName(); // выведет имя файла без пути
        fileOnWin.isDirectory(); // true - если каталог существует
        fileOnWin.isFile(); // true - если файл существует
        /*getAbsolutePath() - абсолютный путь файла, начиная с корня системы. В Android корневым элементом является символ слеша (/)
        canRead() - доступно для чтения
        canWrite() - доступно для записи
        exists() - файл существует или нет
        getName() - возвращает имя файла
        getParent() - возвращает имя родительского каталога
        lastModified() - дата последнего изменения
        isAbsolute() - возвращает true, если файл имеет абсолютный путь
        renameTo(File newPath) - переименовывает файл. В параметре указывается имя нового имени файла. Если переименование прошло неудачно, то возвращается false
        delete() - удаляет файл. Также можно удалить пустой каталог  */
        File file = new File("temp"); // файл создан в буфере памяти
        file.mkdir(); // создаст папку "temp"
        file.delete(); // удалит папку "temp"
        file = new File("temp.txt");
        file.createNewFile(); // создаст "temp.txt"
        file.delete();
    }
}
