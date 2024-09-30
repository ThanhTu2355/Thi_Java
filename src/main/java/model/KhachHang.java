package model;

public class KhachHang {
    private String maso;
    private String hoten;
    private int sonhankhau;
    private double chisocu;
    private double chisomoi;            

    //constructor
    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int sonhankhau, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.sonhankhau = sonhankhau;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    //setter và getter

     
    
    //phương thức tính toán    

    public double getTieuThu()
    {
      return 0;
    }
    
    public double getDinhMuc()
    {
       return 0;
    }
    
    
    public double tinhTienTra()
    {
       return 0;
    }         
}
