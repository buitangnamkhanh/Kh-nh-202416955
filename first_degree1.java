package week1;
import javax.swing.JOptionPane;

public class first_degree1{
    public static void main(String[] args) {
        String i1 = JOptionPane.showInputDialog("Nhập số thứ nhất:");
        String i2 = JOptionPane.showInputDialog("Nhập số thứ hai:");

        double num1 = Double.parseDouble(i1);
        double num2 = Double.parseDouble(i2);

        if( num1 == 0){
            if(num2 != 0)
                JOptionPane.showMessageDialog(null, "Hệ vô nghiệm.");
            else 
                JOptionPane.showMessageDialog(null, "Hệ vô số nghiệm.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Hệ có nghiệm:" + ( -num2 / num1 ));
        }
        System.exit(0);
    }
}