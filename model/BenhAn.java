package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BenhAn {
    private static int sttCounter = 1;
    private int soThuTu;
    private String maBenhAn;
    private String maBenhNhan;
    private String tenBenhNhan;
    private Date ngayNhapVien;
    private Date ngayRaVien;
    private String lyDoNhapVien;

    public BenhAn(String maBenhAn, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien) {
        this.soThuTu = sttCounter++;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public String getMaBenhAn() { return maBenhAn; }
    public String getMaBenhNhan() { return maBenhNhan; }
    public String getTenBenhNhan() { return tenBenhNhan; }
    public Date getNgayNhapVien() { return ngayNhapVien; }
    public Date getNgayRaVien() { return ngayRaVien; }
    public String getLyDoNhapVien() { return lyDoNhapVien; }

    public abstract void hienThiThongTin();

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("STT: %d, Mã bệnh án: %s," +
                            " Mã bệnh nhân: %s," +
                            " Tên bệnh nhân: %s," +
                            " Ngày nhập viện: %s," +
                            " Ngày ra viện: %s," +
                            " Lý do nhập viện: %s",
                soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, sdf.format(ngayNhapVien), sdf.format(ngayRaVien), lyDoNhapVien);
    }
}
