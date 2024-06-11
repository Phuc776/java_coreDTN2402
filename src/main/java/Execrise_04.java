import java.util.Scanner;

public class Execrise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Question 1
        System.out.printf("Question 1: Nhập  chuỗi:");
        String input1 = scanner.nextLine();
        String[] words = input1.trim().split(" ");
        System.out.println("Số lượng từ: " + words.length);

        // Question 2
        System.out.print("\nQuestion 2: Nhập hai xâu ký tự:");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("Xâu ký tự nối: " + s1 + s2);

        // Question 3
        System.out.println("\nQuestion 3: Nhập tên:");
        String name = scanner.nextLine();
        if (Character.isUpperCase(name.charAt(0))) {
            System.out.println("Tên viết hoa: " + name.toUpperCase());
        } else {
            System.out.println("Tên với chữ cái đầu viết hoa: " + name.substring(0, 1).toUpperCase() + name.substring(1));
        }

        // Question 4
        System.out.println("\nQuestion 4: Nhập tên:");
        String name2 = scanner.nextLine();
        for (int i = 0; i < name2.length(); i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + name2.charAt(i));
        }

        // Question 5
        System.out.println("\nQuestion 5: Nhập họ:");
        String lastName = scanner.nextLine();
        System.out.println("Nhập tên:");
        String firstName = scanner.nextLine();
        System.out.println("Họ và tên đầy đủ: " + lastName + " " + firstName);

        // Question 6
        System.out.println("\nQuestion 6: Nhập họ và tên đầy đủ:");
        String fullName = scanner.nextLine();
        String[] parts = fullName.split(" ");
        if (parts.length >= 3) {
            System.out.println("Họ là: " + parts[0]);
            System.out.println("Tên đệm là: " + parts[1]);
            System.out.println("Tên là: " + parts[2]);
        } else if (parts.length == 2) {
            System.out.println("Họ là: " + parts[0]);
            System.out.println("Tên là: " + parts[1]);
        } else {
            System.out.println("Họ và tên không hợp lệ");
        }

        // Question 7
        System.out.println("\nQuestion 7: Nhập họ và tên đầy đủ:");
        String fullName7 = scanner.nextLine().trim();
        String[] parts7 = fullName7.split(" ");
        StringBuilder normalized = new StringBuilder();
        for (String part : parts7) {
            normalized.append(part.substring(0, 1).toUpperCase()).append(part.substring(1).toLowerCase()).append(" ");
        }
        System.out.println("Họ và tên chuẩn hóa: " + normalized.toString().trim());

        // Question 8
        System.out.println("\nQuestion 8: Nhập một xâu ký tự:");
        String groupStr = scanner.nextLine();
        if (groupStr.contains("Java")) {
            System.out.println("Group có chứa Java");
        } else {
            System.out.println("Group không chứa Java");
        }

        // Question 9
        System.out.println("\nQuestion 9: Nhập một xâu ký tự:");
        String groupStr9 = scanner.nextLine();
        if (groupStr9.equals("Java")) {
            System.out.println("Group là Java");
        } else {
            System.out.println("Group không phải là Java");
        }

        // Question 10
        System.out.println("\nQuestion 10: Nhập hai xâu ký tự:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (new StringBuilder(str1).reverse().toString().equals(str2)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }

        // Question 11
        System.out.println("\nQuestion 11: Nhập một xâu ký tự:");
        String str11 = scanner.nextLine();
        long count = str11.chars().filter(ch -> ch == 'a').count();
        System.out.println("Số lần xuất hiện ký tự 'a': " + count);

        // Question 12
        System.out.println("\nQuestion 12: Nhập một xâu ký tự:");
        String str12 = scanner.nextLine();
        String reversed = new StringBuilder(str12).reverse().toString();
        System.out.println("Xâu ký tự đảo ngược: " + reversed);

        // Question 13
        System.out.println("\nQuestion 13: Nhập một xâu ký tự:");
        String str13 = scanner.nextLine();
        boolean containsDigit = str13.chars().anyMatch(Character::isDigit);
        System.out.println("Xâu ký tự không chứa chữ số: " + !containsDigit);

        // Question 14
        System.out.println("\nQuestion 14: Nhập một xâu ký tự:");
        String str14 = scanner.nextLine();
        System.out.println("Nhập ký tự cần thay thế:");
        char oldChar = scanner.next().charAt(0);
        System.out.println("Nhập ký tự mới:");
        char newChar = scanner.next().charAt(0);
        String replaced = str14.replace(oldChar, newChar);
        System.out.println("Xâu ký tự sau khi thay thế: " + replaced);

        // Question 15
        scanner.nextLine(); // Nhận newline thừa
        System.out.println("\nQuestion 15: Nhập một xâu ký tự:");
        String str15 = scanner.nextLine().trim();
        String[] words15 = str15.split("\\s+");
        StringBuilder reversedWords = new StringBuilder();
        for (int i = words15.length - 1; i >= 0; i--) {
            reversedWords.append(words15[i]).append(" ");
        }
        System.out.println("Đảo ngược xâu ký tự theo từ: " + reversedWords.toString().trim());

        // Question 16
        System.out.println("\nQuestion 16: Nhập một xâu ký tự:");
        String str16 = scanner.nextLine();
        System.out.println("Nhập số ký tự mỗi phần:");
        int n = scanner.nextInt();
        if (str16.length() % n == 0) {
            for (int i = 0; i < str16.length(); i += n) {
                System.out.println(str16.substring(i, i + n));
            }
        } else {
            System.out.println("KO");
        }

        scanner.close();
    }

}
