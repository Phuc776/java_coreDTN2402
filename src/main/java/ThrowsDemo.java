import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            String content = ReadFile();
            System.out.println(content);
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String ReadFile() throws IOException {
        //Check Exceptions: bắt buộc xử lý ngoại lệ
        //Uncheck Exceptions: không cần bắt(bắt thì tốt)

        //throws đc định nghĩa bên trên function đc xem như là lan truyền ngoài lệ, tức nếu trong function có lỗi thì
        // lập tức ném lỗi ra, đây là cách bắt lỗi thứ 2 ngoài try catch
        throw new IOException("File không tồn tại");
    }
}
