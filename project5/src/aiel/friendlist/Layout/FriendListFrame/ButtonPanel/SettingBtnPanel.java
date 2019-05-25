package aiel.friendlist.Layout.FriendListFrame.ButtonPanel;

import javax.swing.*;
import java.awt.*;

public class SettingBtnPanel extends JPanel {
    private JButton addBtn = new JButton("Add");
    private JButton deleteBtn = new JButton("Delete");
    private JButton modifyBtn= new JButton("Modify");
    private JButton saveFileBtn = new JButton("Save File");
    public SettingBtnPanel(){
        setLayout(new GridLayout(4, 1));
        add(addBtn);
        add(deleteBtn);
        add(modifyBtn);
        add(saveFileBtn);
    }

    public JButton getAddBtn() {
        return addBtn;
    }

    public JButton getDeleteBtn() {
        return deleteBtn;
    }

    public JButton getModifyBtn() {
        return modifyBtn;
    }

    public JButton getSaveFileBtn() {
        return saveFileBtn;
    }
}
