package model;

import java.util.*;

public class BenhAnThuong extends BenhAn {
    private double phiNamVien;

    public BenhAnThuong(String maBenhAn, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien, double phiNamVien) {
        super(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(super.toString() + String.format(", Phí nằm viện: %.2f", phiNamVien));
    }
}

