package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Tính kế thừa
        // Mục đích: tái sử dụng code
        // từ khóa: extends
        Duck duck = new Duck("Long", 1);
        duck.eat();

        // @Override
        duck.eat();

        // từ khóa: super
        System.out.println("duck = " + duck);

        //Đơn kế thừa: 1 cha có nhiều con nhưng 1 con ko thể có nhiều cha
    }
}
