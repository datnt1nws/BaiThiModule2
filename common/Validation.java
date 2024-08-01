package common;

public class Validation {

    public static boolean isValidMaBenhAn(String maBenhAn) {
        return maBenhAn.matches("^BA-\\d{3}$");
    }

    public static boolean isValidMaBenhNhan(String maBenhNhan) {
        return maBenhNhan.matches("^BN-\\d{3}$");
    }

    public static boolean isValidLoaiVIP(String loaiVIP) {
        return loaiVIP.equals("VIP I") || loaiVIP.equals("VIP II") || loaiVIP.equals("VIP III");
    }

    // Bạn có thể thêm các phương thức validate khác tại đây
}
