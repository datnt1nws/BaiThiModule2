package common;

import model.BenhAn;
import model.BenhAnThuong;
import model.BenhAnVIP;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IOStream {
    private static final String FILE_PATH = "C:\\Users\\ADMIN\\IdeaProjects\\TestModule2\\QuanLyBenhAn\\data\\medical_records.csv";
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    /*public static void ghiDuLieuVaoCSV(List<BenhAn> danhSachBenhAn) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            for (BenhAn benhAn : danhSachBenhAn) {
                writer.write(benhAn.toString() + "\n");
            }
            System.out.println("Lưu dữ liệu vào file CSV thành công.");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi dữ liệu vào file CSV.");
        }
    }

    /*public static List<BenhAn> docDuLieuTuCSV() {
        List<BenhAn> danhSachBenhAn = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(", ");
                if (fields.length >= 7) {
                    String maBenhAn = fields[1].split(": ")[1];
                    String maBenhNhan = fields[2].split(": ")[1];
                    String tenBenhNhan = fields[3].split(": ")[1];
                    Date ngayNhapVien = sdf.parse(fields[4].split(": ")[1]);
                    Date ngayRaVien = sdf.parse(fields[5].split(": ")[1]);
                    String lyDoNhapVien = fields[6].split(": ")[1];
                    if (fields.length == 8) {
                        double phiNamVien = Double.parseDouble(fields[7].split(": ")[1]);
                        danhSachBenhAn.add(new BenhAnThuong(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien));
                    } else if (fields.length == 9) {
                        String loaiVIP = fields[7].split(": ")[1];
                        Date thoiHanVIP = sdf.parse(fields[8].split(": ")[1]);
                        danhSachBenhAn.add(new BenhAnVIP(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVIP, thoiHanVIP));
                    } else {
                        System.err.println("Dòng dữ liệu không đúng định dạng: " + line);
                    }
                } else {
                    System.err.println("Dòng dữ liệu không đúng định dạng: " + line);
                }
            }
            System.out.println("Đọc dữ liệu từ file CSV thành công.");
        } catch (IOException | ParseException e) {
            System.err.println("Lỗi khi đọc dữ liệu từ file CSV.");
        }
        return danhSachBenhAn;
    }*/
    public static List<BenhAn> docDuLieuTuCSV() {
        List<BenhAn> danhSachBenhAn = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Xử lý dòng đọc được và thêm vào danh sách bệnh án
                // Cần có logic chuyển đổi từ dòng CSV thành đối tượng BenhAn
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc dữ liệu từ file CSV: " + e.getMessage());
        }
        return danhSachBenhAn;
    }

    public static void ghiDuLieuVaoCSV(List<BenhAn> danhSachBenhAn) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            for (BenhAn benhAn : danhSachBenhAn) {
                writer.write(benhAn.toString() + "\n");
            }
            System.out.println("Lưu dữ liệu vào file CSV thành công.");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi dữ liệu vào file CSV: " + e.getMessage());
        }
    }


}