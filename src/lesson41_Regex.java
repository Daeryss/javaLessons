/*
    regex (regular expression) - регулярные выражения.
    Устоявшиеся и принятые сокращения в языках программирования.
    так "." - соответствует любому символу,кроме пробела
    "?" - соответствует любому символу, и пробелу тоже

 */

public class lesson41_Regex {
    public static void main(String[] args) {
        // можно создать свое регулярное выражение
        String aleRegex = "ale";
        "ale".matches(aleRegex); // true
        "ALE".matches(aleRegex); // false
        "pale".matches(aleRegex); //

        String learnRegex = "Learn.Regex";

        "Learn Regex".matches(learnRegex); // true
        "Learn.Regex".matches(learnRegex); // true
        "LearnRegex".matches(learnRegex); // false
        "Learn, Regex".matches(learnRegex); // false

        String pattern = "behaviou?r";

        "behaviour".matches(pattern); // true
        "behavior".matches(pattern);  // true

        pattern = "..?"; // любые 1 или 2 символа

        "I".matches(pattern);  // true
        "am".matches(pattern); // true
        "".matches(pattern);   // false

        pattern = ".?"; // любой символ или пустая строка
        "I".matches(pattern);  // true
        "am".matches(pattern); // false
        "".matches(pattern);   // true

        // для экранировани я . и ? используется \\. и \\?

        // также можно использовать константную часть и переменную, состояющую из нескольких символов,
        //один из которых подходит на выбор
        pattern = "ab[def]";
        "abe".matches(pattern); // true e представлен в []
        "abc".matches(pattern); // false с не представлен в []

        // можно обойтись без перечисления большого количества символов, таким образом [1-0]
        // или [a-z], [a-zA-Z](одна любая буква)
        pattern = "[a-zA-Z]";
        "e".matches(pattern); // true
        "S".matches(pattern); // true
        "eS".matches(pattern); // false

        // если мы хотим исключить какой-либо из символов, то пишем [^]
        pattern = "[^abc]";
        "e".matches(pattern); // true
        "a".matches(pattern); // false

        // чередование
        pattern = "(abc|def|xyz)"; // либо "abc", либо "def", либо "xyz", но не "adz" или "bey"

        /* список сокращений:
        \\d любая цифра, сокращение [0-9];
        \\D это не цифра, сокращение от [^0-9];
        \\s символ пробела (включая табуляцию и символ новой строки), сокращенно [ \\t\\n\\x0B\\f\\r].
        \\S является непробельным символом, сокращенно [^\\s];
        \\w буквенно-цифровой символ (слово), сокращение от [a-zA-Z_0-9];
        \\W это не буквенно-цифровой символ, сокращенно [^\\w].
        \\b это граница слова, сокращение от  (^\w|\w$|\W\w|\w\W).
        \\B это граница без слов, сокращение от [^\\b].
         */

        String regex = "\\s\\w\\d\\s"; // ["любой пробел", "любая буква/цифра", "любая цифра", "любой пробел"]

        " A5 ".matches(regex); // true
        " 33 ".matches(regex); // true
        "\tA4\t".matches(regex); // true, because it matches tabs as well

        "q18q".matches(regex); // false, 'q' is not a space
        " AB ".matches(regex); // false, 'B' is not a digit
        " -1 ".matches(regex); // false, '-' is not an alphanumeric character, but '_' is OK.

        String startRegex = "\\bcat"; // Matches the part of the word that starts with "cat"
        "cat".matches(startRegex);
        String endRegex = "cat\\b"; // Matches the part of the word that ends with "cat"
        String wholeRegex = "\\bcat\\b"; // Matches the whole word "cat"


        // квантификаторы (quantities) - опеделяют, как часто будет входить указанный символ
        /*
        + соответствует одному или нескольким повторениям предыдущего символа;
        * соответствует нулю или более повторений предыдущего символа;
        {n}точно соответствует n повторениям предыдущего символа;
        {n,m}соответствует по крайней мере, nно не больше, чем mповторы предыдущего символа;
        {n,}соответствует как минимум n повторениям предыдущего символа;
         */

        regex = "ca+b";

        "cab".matches(regex); // true
        "caaaaab".matches(regex); // true
        "cb".matches(regex); //

        regex = "A[0-3]*";

        "A".matches(regex);  // true, because it matches zero or more repetitions
        "A0".matches(regex); // true
        "A000111222333".matches(regex); // true

        regex = "[0-9]{4}"; // four digits

        "6342".matches(regex);  // true
        "9034".matches(regex);  // true
        "182".matches(regex);   // false
        "54312".matches(regex); // false

        regex = "1{2,3}";

        "1".matches(regex);    // false
        "11".matches(regex);   // true
        "111".matches(regex);  // true
        "1111".matches(regex); // false

    }
}
