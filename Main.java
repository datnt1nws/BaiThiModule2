
import controller.QuanLyBenhAnController;
import model.QuanLyBenhAnModel;
import view.QuanLyBenhAnView;

public class Main {
    public static void main(String[] args) {
        QuanLyBenhAnModel model = new QuanLyBenhAnModel();
        QuanLyBenhAnView view = new QuanLyBenhAnView();
        QuanLyBenhAnController controller = new QuanLyBenhAnController(model, view);
        controller.start();
    }
}