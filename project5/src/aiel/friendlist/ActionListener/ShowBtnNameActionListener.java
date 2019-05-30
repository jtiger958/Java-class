package aiel.friendlist.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowBtnNameActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton)
            System.out.println(((JButton) e.getSource()).getText() + "Btn is clicked");
    }
}