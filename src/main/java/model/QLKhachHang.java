package model;

import java.util.ArrayList;
import util.FileHelper;

/**
 *
 * Họ tên sinh viên: 
 */
public class QLKhachHang {

    private ArrayList<KhachHang> dsKhachHang;

    public QLKhachHang() {
        dsKhachHang = new ArrayList<>();
    }

    public QLKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

    public ArrayList<KhachHang> getDsKhachHang() {
        return dsKhachHang;
    }

    public void setDsKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

   
    public void DocKhachHang(String filename) {
        //sinh viên viết code 
      
    }

    public boolean GhiHoaDon(String filename) {
        //sinh viên viết code 
        return true;
    }

   
    public void sapXepTheoMucTieuThu() {
        //sinh viên viết code           
    }
    
    public double getTieuThuCaoNhat()
    {
      double max=0;
      return max;
    }
    
    public double getTieuThuThapNhat()
    {
       double min=0;
       return min;       
    }
    
    public double getTieuThuTrungBinh()
    {
       return 0;     
    }
}
