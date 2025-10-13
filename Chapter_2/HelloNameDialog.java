import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);
            if (name == null) {
                JOptionPane.showMessageDialog(null, "You must enter your name to proceed.", "Warning", JOptionPane.WARNING_MESSAGE);
                continue; 
            }
            int choice = JOptionPane.showConfirmDialog(null, 
                    "Do you want your name to be shown?", 
                    "Confirmation", 
                    JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break; 
            } 
            else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
                continue; 
            }
        }
    }
}