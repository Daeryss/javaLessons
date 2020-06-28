public class lesson02_String {
    public static void main(String[] args) {
        String str1 = "hello"; // ссылочный тип данных, является классом.
                            // неизменяемый тип
        String str2 = " Jack!";
        String str3 = str1 + str2;
        System.out.println(str3);
        String str = " hello dear      friend  ";
        str = str.trim(); // "hello dear      friend"
        String[] arr1 = str.split(" +"); // ["hello", "dear", "friend"]
        String[] arr = str.split(" "); // ["hello", "dear     ", "friend"]
        String[] arr3 = str1.split(""); // {"h", "e", "l", "l", "o"}
        for (String j : arr){
            System.out.print(j + " ");
        }
        str2.toUpperCase(); // "JACK!"
        str2.toLowerCase(); // "jack!"
        char[] c = str1.toCharArray(); // {"h", "e", "l", "l", "o"}
        String fromCharArray = String.valueOf(c); // "hello"
        str.isEmpty(); // false
        str1.concat(str2).concat(str1); // str1 + str2 + str1
        String grt = String.join(" < ", "Four", "Five"); // "Four < Five"
        int x = 534;
        String f = String.valueOf(x); // "534"
        System.out.println();
        int var1 = "a".compareTo("c"); // -2, сравнивает лексиграфически, char a - char b
        "hello".equals("HELLO"); // false - сравнение
        "hello".equalsIgnoreCase("HeLLo"); // true
        "hello friend".regionMatches(0, "hello", 0, 5); // true (индекс вхождения, строка которую ищет, индекс смещения, длина участка поиска)
        "hello".replace("l", "s"); // "hesso"
        "hello Jack".replaceAll("Jack", "Bob"); // "hello Bob"
        "Hello dear friend".substring(6, 10); // "dear"
        "Hello dear friend".substring(6); // "dear friend"
        "Hello dear friend".matches("(.*)dear(.*)"); // true

        // StringBuffer
        StringBuffer str12 = new StringBuffer("hello");
        str12.reverse(); // "olleh"
        str12.delete(0, 3); // "eh"
        str12.insert(1, "of"); // "eofh" - вставляет подстроку начиная с указанного индекса
        System.out.println(str12.replace(1, 2, "NEW")); // eNEWfh - заменяет построку на строку в выделенном интервале

    }
}
