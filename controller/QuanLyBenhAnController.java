package controller;

import model.QuanLyBenhAnModel;
import view.QuanLyBenhAnView;
import model.BenhAn;
import common.DuplicateMedicalRecordException;

import java.text.ParseException;

public class QuanLyBenhAnController {
    private QuanLyBenhAnModel model;
    private QuanLyBenhAnView view;

    public QuanLyBenhAnController(QuanLyBenhAnModel model, QuanLyBenhAnView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        while (true) {
            int chon = view.hienThiMenu();
            switch (chon) {
                case 1:
                    try {
                        BenhAn benhAn = view.nhapThongTinBenhAn();
                        if (benhAn != null) {
                            model.themMoiBenhAn(benhAn);
                            view.hienThiThongBao("Thêm mới bệnh án thành công!");
                        }
                    } catch (ParseException e) {
                        view.hienThiThongBao("Định dạng ngày không hợp lệ.");
                    } catch (DuplicateMedicalRecordException e) {
                        view.hienThiThongBao(e.getMessage());
                    }
                    break;
                case 2:
                    String maBenhAn = view.nhapMaBenhAnCanXoa();
                    if (view.xacNhanXoa()) {
                        boolean xoaThanhCong = model.xoaBenhAn(maBenhAn);
                        if (xoaThanhCong) {
                            view.hienThiThongBao("Xóa bệnh án thành công.");
                        } else {
                            view.hienThiThongBao("Không tìm thấy bệnh án với mã " + maBenhAn);
                        }
                    } else {
                        view.hienThiThongBao("Hủy thao tác xóa.");
                    }
                    break;
                case 3:
                    view.hienThiDanhSachBenhAn(model.getDanhSachBenhAn());
                    break;
                case 4:
                    view.hienThiThongBao("Thoát chương trình.");
                    return;
                default:
                    view.hienThiThongBao("Chọn chức năng không hợp lệ.");
            }
        }
    }
}