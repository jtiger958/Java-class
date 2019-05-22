package aiel.friendlist.Layout.AddFriendList.ButtonPanel;

import javax.swing.*;
import java.awt.*;

public class SettingBtnPanel extends Panel{
    private JButton doneBtn;
    public SettingBtnPanel(){
        doneBtn = new JButton("Done");
        add(doneBtn);
    }
    public JButton getDoneBtn() {
        return doneBtn;
    }
}