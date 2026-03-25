package week1;
import javax.swing.JOptionPane;

public class doublenumber {
    public static void main(String[] args) {
        // 1. Sửa lỗi chính tả InputDialog
        String i1 = JOptionPane.showInputDialog("Nhập số thứ nhất:");
        String i2 = JOptionPane.showInputDialog("Nhập số thứ hai:");

        double num1 = Double.parseDouble(i1);
        double num2 = Double.parseDouble(i2);

        // 2. Thêm tham số 'null' vào đầu mỗi lệnh showMessageDialog
        JOptionPane.showMessageDialog(null, "Tổng 2 số: " + (num1 + num2));
        JOptionPane.showMessageDialog(null, "Hiệu 2 số: " + (num1 - num2));
        JOptionPane.showMessageDialog(null, "Tích 2 số: " + (num1 * num2));
        JOptionPane.showMessageDialog(null, "Thương 2 số: " + (num1 / num2));

        System.exit(0);
    }
}