package aiel.friendlist.Layout;

import javax.swing.*;
import java.awt.*;

public class SettingBtnPannel extends JPanel {
    SettingBtnPannel(){
        setLayout(new GridLayout(4, 1));
        add(new JButton("Add"));
        add(new JButton("Delete"));
        add(new JButton("Modify"));
        add(new JButton("Save File"));
    }
}
