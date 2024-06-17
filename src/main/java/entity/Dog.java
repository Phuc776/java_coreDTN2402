package entity;

public class Dog {
    public String name;
    protected int age;
    String color;
    private int id;
    //Mặc định nếu chưa định nghĩa constructor, nó sẽ có sẵn 1 constructor không tham số(),
    // khi đc định nghĩa constructor mới, Constructor ko tham số tự biến mất
    public Dog() {

    }
    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "entity.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
