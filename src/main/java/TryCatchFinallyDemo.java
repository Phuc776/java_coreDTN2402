public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try{
//            //ArithmeticException
//            int a = 1;
//            int b = 0;
//            System.out.println(a/b);
//
//            //NullPointerException
//            String s = null;
//            System.out.println(s.length());
//
//            //ArrayIndexOutOfBoundsException
//            int[] arr = {1,2,3};
//            System.out.println(arr[100]);

            // Exception
            throw new Exception("Lỗi lạ/ ngoại lệ không xác định");

        }catch(ArithmeticException arth) {
            System.out.println("Loi toan hoc");
        }catch(NullPointerException | ArrayIndexOutOfBoundsException nullex) {
            System.out.println("Lỗi null pointer hoặc lỗi tràn index array");
        }catch (Exception ex) {
            System.out.println("Dùng throw để chủ động tạo lỗi: "+ ex.toString());
        }finally {
            System.out.println("Tôi luôn đc gọi, bất kể lỗi");
        }
    }


}
