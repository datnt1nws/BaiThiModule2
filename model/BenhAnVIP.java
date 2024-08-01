package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BenhAnVIP extends BenhAn {
    private String loaiVIP;
    private Date thoiHanVIP;

    public BenhAnVIP(String maBenhAn, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien, String loaiVIP, Date thoiHanVIP) {
        super(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVIP = loaiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }

    @Override
    public void hienThiThongTin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(super.toString() + String.format(", Loại VIP: %s, Thời hạn VIP: %s", loaiVIP, sdf.format(thoiHanVIP)));
    }
}
