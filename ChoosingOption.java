package week1;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // Dùng showConfirmDialog sẽ tự động có nút Yes/No/Cancel
        int option = JOptionPane.showConfirmDialog(null, 
                "Do you want to change to the first class ticket?");

        JOptionPane.showMessageDialog(null, "You have chosen: " 
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        
        System.exit(0);
    }
}
