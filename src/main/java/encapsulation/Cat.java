package encapsulation;

import java.io.IOException;

public class Cat {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (age > 0) {
                this.age = age;
            } else
                throw new IOException("Tuổi lớn hơn 0, nên tôi ko set, tôi quăng lỗi");
        }catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
    }
}
