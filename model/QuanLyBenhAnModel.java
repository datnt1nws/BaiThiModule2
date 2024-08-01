package model;

import common.DuplicateMedicalRecordException;
import common.IOStream;

import java.util.List;

public class QuanLyBenhAnModel {
    private List<BenhAn> danhSachBenhAn = IOStream.docDuLieuTuCSV();

    public List<BenhAn> getDanhSachBenhAn() {
        return danhSachBenhAn;
    }

    public void themMoiBenhAn(BenhAn benhAn) throws DuplicateMedicalRecordException {
        for (BenhAn ba : danhSachBenhAn) {
            if (ba.getMaBenhAn().equals(benhAn.getMaBenhAn())) {
                throw new DuplicateMedicalRecordException("Bệnh án đã tồn tại.");
            }
        }
        danhSachBenhAn.add(benhAn);
        IOStream.ghiDuLieuVaoCSV(danhSachBenhAn);
    }

    public boolean xoaBenhAn(String maBenhAn) {
        for (BenhAn ba : danhSachBenhAn) {
            if (ba.getMaBenhAn().equals(maBenhAn)) {
                danhSachBenhAn.remove(ba);
                IOStream.ghiDuLieuVaoCSV(danhSachBenhAn);
                return true;
            }
        }
        return false;
    }
}
