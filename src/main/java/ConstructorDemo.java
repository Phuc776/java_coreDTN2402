import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        //Constructor
        // 1. Tên constructor ko trùng tên file
        // 2. Nó ko trả về giá trị

        Dog dog = new Dog("Chó đẹp trai", 1);
        System.out.println("entity.Dog: " + dog);

        Dog dog2 = new Dog();
        System.out.println("entity.Dog 2: " + dog2);
    }
}
