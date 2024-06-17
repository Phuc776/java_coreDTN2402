public class ThrowDemo {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new IllegalStateException("Not old enough!!");
            }else {
                System.out.println("Chào bạn");
            }
        }catch (IllegalStateException ill) {
            System.out.println(ill.getMessage());
        }


    }
}
