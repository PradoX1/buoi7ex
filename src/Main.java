import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin sinh viên: ");
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngành: ");
        String major = sc.nextLine().toLowerCase(Locale.ROOT);
        if (major.equals("it")){
            System.out.println("Mời bạn nhâp điểm java: ");
            double java= Double.parseDouble(sc.nextLine());
            System.out.println("Mời bạn nhâp điểm html: ");
            double html= Double.parseDouble(sc.nextLine());
            System.out.println("Mời bạn nhâp điểm css: ");
            double css= Double.parseDouble(sc.nextLine());
            SinhVienIT sinhVienIT = new SinhVienIT(name,major,java,html,css);
            sinhVienIT.printInfo();
        } else if (major.equals("biz")) {
            System.out.println("Mời bạn nhâp điểm marketing: ");
            double marketing= Double.parseDouble(sc.nextLine());
            System.out.println("Mời bạn nhâp điểm sale: ");
            double sale= Double.parseDouble(sc.nextLine());
            SinhVienBiz sinhVienBiz = new SinhVienBiz(name,major,marketing,sale);
           sinhVienBiz.printInfo();
        }
    }
}