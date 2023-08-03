public abstract class SinhVienTechMaster {
    private String name;
    private String major;


    public SinhVienTechMaster(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public abstract double getDiem();
    public  String getHocLuc(){
        if (getDiem()<5) return "Yếu";
        else if (getDiem()<6.5&&this.getDiem()>=5) {
            return "Trung bình";
        } else if (getDiem()<7.5&&this.getDiem()>=6.5) {
            return "Khá";
        } else if (getDiem()<=10&&this.getDiem()>=7.5) {
            return "Giỏi";
        } else return "";
    };
    public abstract void printInfo();
}
