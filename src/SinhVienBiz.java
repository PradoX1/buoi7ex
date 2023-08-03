public class SinhVienBiz extends SinhVienTechMaster{
    private double marketing;
    private double sales;

    public SinhVienBiz(String name, String major, double marketing, double sales) {
        super(name, major);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (2*marketing+sales)/3;
    }

    @Override
    public void printInfo() {
        System.out.println("Tên sinh viên là: "+getName());
        System.out.println("Ngành sinh viên là: "+getMajor());
        System.out.println("Điểm của sinh viên: "+getDiem());
        System.out.println("Học lực của sinh viên: "+getHocLuc());
    }
}
