public class SinhVienIT extends SinhVienTechMaster{
    private double java;
    private double html;
    private double css;

    public SinhVienIT(String name, String major, double java, double html, double css) {
        super(name, major);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getDiem() {
        return (2*java+html+css)/4;
    }

    @Override
    public void printInfo() {
        System.out.println("Tên sinh viên là: "+getName());
        System.out.println("Ngành sinh viên là: "+getMajor());
        System.out.println("Điểm của sinh viên: "+getDiem());
        System.out.println("Học lực của sinh viên: "+getHocLuc());
    }
}
