package aiel.friendlist.Layout.FriendListFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingBtnPannel extends JPanel {
    JButton addBtn = new JButton("Add");
    JButton deleteBtn = new JButton("Delete");
    JButton modifyBtn= new JButton("Modify");
    JButton saveFileBtn = new JButton("Save File");
    SettingBtnPannel(){
        setLayout(new GridLayout(4, 1));
        add(addBtn);
        add(deleteBtn);
        add(modifyBtn);
        add(saveFileBtn);
    }
}
