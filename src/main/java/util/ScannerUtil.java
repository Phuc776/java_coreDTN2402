package util;

import java.io.IOException;
import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int InputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch(NumberFormatException ex) {
                System.err.println("Yêu cầu nhập lại số nguyên.");
                System.err.println("Nhập lại");
            }
        }
    }
    public static float InputFloat() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch(NumberFormatException ex) {
                System.err.println("Yêu cầu nhập lại số nguyên.");
                System.err.println("Nhập lại");
            }
        }
    }
    public static double InputDouble() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch(NumberFormatException ex) {
                System.err.println("Yêu cầu nhập lại số nguyên.");
                System.err.println("Nhập lại");
            }
        }
    }

    public static int InputPositiveInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                int c = Integer.parseInt(input);
                if (c > 0) {
                    return Integer.parseInt(input);
                } else {
                    throw new IOException("Yêu cầu nhập số nguyên dương");
                }
            }catch (NumberFormatException formatException) {
                System.out.println("Chưa đúng cú pháp số nguyên");
                System.out.print("Nhập lại:");
            }catch (IOException IOex) {
                System.out.println("Yêu cầu số nguyên dương");
                System.out.print("Nhập lại:");
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static String inputEmail() {
        while (true) {
            String input = scanner.nextLine();
            if (input.contains("@")) {
                return input;

            } else {
                System.err.println("Chưa đúng format Email");
                System.err.println("Nhập lại");
            }
        }
    }
    public static String inputPassword() {

        while (true) {
            String input = scanner.nextLine();
            int lengthString = input.length();
            if (lengthString >= 6 && lengthString <= 12) {
                for(int i = 0; i < lengthString; i++) {
                    char c = input.charAt(i);
                    if(Character.isUpperCase(c)) {
                        return input;
                    }
                }
                System.err.println("Chuỗi không chứa ký tự in hoa");
                System.err.println("Nhập lại");
            }else {
                System.err.println("Độ dài chưa hợp lý");
                System.err.println("Nhập lại");
            }
        }
    }

    public static String inputFullName() {
        //Yêu cầu chỉ chứa chữ cái (ko số, ko ký tự)
        while (true) {
            String input = scanner.nextLine();
            if (hasAllAlphabetic(input)) {
                return input;
            }else {
                System.err.println("Chuỗi chỉ nên có kí tự in hoa.");
                System.err.println("Nhập lại");
            }
        }
    }
    private static boolean hasAllAlphabetic(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(Character.isWhitespace(c)) continue;
            if(!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }
}
