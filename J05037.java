import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class danhSach  implements Comparable<danhSach> {
    
    public static int cnt = 1;
    public String id;
    public String ten,donViTinh;
    public long soLuong,donGiaNhap;
    public Long phiVanChuyen,thanhTien,giaBan;

    public danhSach(String ten, String donViTinh, long donGiaNhap, long soLuong) {
        this.id = "MH" + String.format("%02d",cnt++);
        this.ten = ten;
        this.donViTinh = donViTinh;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;
        
        long t = donGiaNhap * soLuong;
        this.phiVanChuyen = (long)Math.round(t/20);
        this.thanhTien = t + this.phiVanChuyen;
        this.giaBan = (long)Math.ceil((this.thanhTien * 1.02 / soLuong / 100)) * 100;
    }
    
    @Override
    public int compareTo(danhSach o){
        return -this.giaBan.compareTo(o.giaBan);
    }

    @Override
    public String toString() {
        return  id + " " + ten + " " + donViTinh + " " + phiVanChuyen + " " + thanhTien + " " + giaBan;
    }
    
    
}

public class J05037 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<danhSach> list = new ArrayList<>();
        while (t-- > 0) {
            String ten = sc.nextLine();
            String donViTinh = sc.nextLine();
            long donGiaNhap = Long.parseLong(sc.nextLine());
            long soLuong = Long.parseLong(sc.nextLine());
            list.add(new danhSach(ten,donViTinh,donGiaNhap,soLuong));
        }
        Collections.sort(list);
        for(danhSach x:list){
            System.out.println(x);
        }
        sc.close();
    }
}
