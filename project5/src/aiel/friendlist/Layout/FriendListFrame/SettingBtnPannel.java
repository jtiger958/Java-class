package aiel.friendlist.Layout.FriendListFrame;

import javax.swing.*;
import java.awt.*;

class SettingBtnPannel extends JPanel {
    private JButton addBtn = new JButton("Add");
    private JButton deleteBtn = new JButton("Delete");
    private JButton modifyBtn= new JButton("Modify");
    private JButton saveFileBtn = new JButton("Save File");
    SettingBtnPannel(){
        setLayout(new GridLayout(4, 1));
        add(addBtn);
        add(deleteBtn);
        add(modifyBtn);
        add(saveFileBtn);
    }

    JButton getAddBtn() {
        return addBtn;
    }

    JButton getDeleteBtn() {
        return deleteBtn;
    }

    JButton getModifyBtn() {
        return modifyBtn;
    }

    JButton getSaveFileBtn() {
        return saveFileBtn;
    }
}
