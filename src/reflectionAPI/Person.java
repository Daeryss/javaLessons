package reflectionAPI;

@Author(name = "Ilias", dateOfCreation = 2022)
public class Person {
    private int id;
    private String name;

    public Person() {
        this.id = - 1;
        this.name = "no name";
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Person with id: " + id + " and name: " + name + " said hello.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void hiddenPrivateMethod(String x){
        System.out.println("this is hidden message");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
