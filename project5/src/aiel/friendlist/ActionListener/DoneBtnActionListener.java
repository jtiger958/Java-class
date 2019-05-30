package aiel.friendlist.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoneBtnActionListener implements ActionListener {
    public DoneBtnActionListener() {
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        final JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());

        frame.dispose();
    }
}
