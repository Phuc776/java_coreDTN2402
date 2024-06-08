public class ObjectMethod {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Smith";
        dog1.age = 2;
        Dog dog2 = new Dog();
        dog2.name = "Smith";
        dog2.age = 2;
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
    }
}
