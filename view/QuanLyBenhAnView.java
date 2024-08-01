package view;

import model.BenhAn;
import model.BenhAnThuong;
import model.BenhAnVIP;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.List;

public class QuanLyBenhAnView {
    private Scanner scanner = new Scanner(System.in);
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public int hienThiMenu() {
        System.out.println("1. Thêm mới bệnh án");
        System.out.println("2. Xóa bệnh án");
        System.out.println("3. Xem danh sách bệnh án");
        System.out.println("4. Thoát");
        System.out.print("Chọn chức năng: ");
        return scanner.nextInt();
    }

    public BenhAn nhapThongTinBenhAn() throws ParseException {
        scanner.nextLine(); // Clear buffer

        System.out.print("Nhập mã bệnh án (BA-XXX): ");
        String maBenhAn = scanner.nextLine();
        System.out.print("Nhập mã bệnh nhân (BN-XXX): ");
        String maBenhNhan = scanner.nextLine();
        System.out.print("Nhập tên bệnh nhân: ");
        String tenBenhNhan = scanner.nextLine();
        System.out.print("Nhập ngày nhập viện (dd/MM/yyyy): ");
        Date ngayNhapVien = sdf.parse(scanner.nextLine());
        System.out.print("Nhập ngày ra viện (dd/MM/yyyy): ");
        Date ngayRaVien = sdf.parse(scanner.nextLine());
        System.out.print("Nhập lý do nhập viện: ");
        String lyDoNhapVien = scanner.nextLine();

        System.out.print("Bệnh án thường hay VIP (T/V): ");
        String loaiBenhAn = scanner.nextLine();

        if (loaiBenhAn.equalsIgnoreCase("T")) {
            System.out.print("Nhập phí nằm viện: ");
            double phiNamVien = Double.parseDouble(scanner.nextLine());
            return new BenhAnThuong(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
        } else if (loaiBenhAn.equalsIgnoreCase("V")) {
            System.out.print("Nhập loại VIP (VIP I/VIP II/VIP III): ");
            String loaiVIP = scanner.nextLine();
            System.out.print("Nhập thời hạn VIP (dd/MM/yyyy): ");
            Date thoiHanVIP = sdf.parse(scanner.nextLine());
            return new BenhAnVIP(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVIP, thoiHanVIP);
        }
        return null;
    }

    public void hienThiDanhSachBenhAn(List<BenhAn> danhSachBenhAn) {
        if (danhSachBenhAn.isEmpty()) {
            System.out.println("Không có bệnh án nào trong danh sách.");
        } else {
            for (BenhAn ba : danhSachBenhAn) {
                ba.hienThiThongTin();
            }
        }
    }

    public String nhapMaBenhAnCanXoa() {
        scanner.nextLine(); // Clear buffer
        System.out.print("Nhập mã bệnh án cần xóa: ");
        return scanner.nextLine();
    }

    public boolean xacNhanXoa() {
        System.out.print("Bạn có chắc chắn muốn xóa bệnh án này? (Yes/No): ");
        String xacNhan = scanner.nextLine();
        return xacNhan.equalsIgnoreCase("Yes");
    }

    public void hienThiThongBao(String message) {
        System.out.println(message);
    }
}

