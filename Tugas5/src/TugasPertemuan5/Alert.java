
package TugasPertemuan5;

import javax.swing.*;

public class Alert {

    public Alert(String message) {
        JOptionPane optionPane = new JOptionPane(message, JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Error!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
