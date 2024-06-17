public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Not old enough!!");
            }else {
                System.out.println("Chào bạn");
            }
        }catch (InvalidAgeException ill) {
            System.out.println(ill.getMessage());
        }
    }
}
