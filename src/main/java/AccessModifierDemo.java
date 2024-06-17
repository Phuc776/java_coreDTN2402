import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        //Phạm vi truy cập
        // public: mọi nơi
        Dog dog1 = new Dog("Long");
        System.out.println("dog1.name = " + dog1.name);
        // protected: cùng package hoặc class con
        Dog dog2 = new Dog("Phương", 5);
//        System.out.println("dog2.age = " + dog2.age);
        // default:cùng package
        Dog dog3 = new Dog();
        //System.out.println(dog3.color);
        // private: nội bộ 1 class
        Dog dog4 = new Dog();
        // System.out.println(dog4.id);
    }
}
