public class lesson20_AccessModifier { // публичный класс в ява файле может быть только один
    public int id; // public разрешает доступ к полю везеде на протяжении всего проекта и в любом пакете
    private int age; //private дает доступ к полю или методу только в пределах того класса, где он объявлен
    protected int id2; // доступен для всеъ классов в папке src


    public static void main(String[] args) {
        // в ява есть несколько модификаторов доступа:
        // private, public, default, protected
        // default - модификатор доступа оп умолчанию, устанавливается по умолчани, если ничего не доступно
        // все что default доступно в пределах пакета
        // protected - жоступны в пределах одного пакета, доступны всем подклассам, даже если эти подклассы вне пакета,
        // при условии, что этот класс наследуется (extends)
    }

    private void privatePrint(){ // можно использовать лишь в перделах класса lesson20_AccessModifier
        System.out.println("it is private string");
    }
}
