package model;

/**
 *
 * Họ tên sinh viên: Nguyễn Thanh Tú
 */
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
    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getSonhankhau() {
        return sonhankhau;
    }

    public void setSonhankhau(int sonhankhau) {
        this.sonhankhau = sonhankhau;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

    //phương thức tính toán    
    public double getTieuThu() {
        double soKhoiNuocSuDung = chisomoi - chisocu; 
        return soKhoiNuocSuDung;
    }

    public double getDinhMuc() {
        return  sonhankhau * 4;
    }

    public double tinhTienTra() {
        if(getTieuThu()-getDinhMuc() <= 4){
            return  getDinhMuc()* 6700;
        }else if(getTieuThu()-getDinhMuc() <= 6){
            return getDinhMuc()* 6700 + (getTieuThu()-getDinhMuc())*12900;
        }else{
            return getDinhMuc()* 6700 + (getTieuThu()-getDinhMuc())* 14400;
        } 
        //double tienNuoc = getDinhMuc() + getDinhMuc()*0.05 + getDinhMuc()*0.25 + getDinhMuc()*0.25*0.08;
        //return tienNuoc;
    }
}
