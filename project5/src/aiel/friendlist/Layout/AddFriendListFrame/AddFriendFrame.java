package aiel.friendlist.Layout.AddFriendListFrame;

import aiel.friendlist.ActionListener.DoneBtnActionListener;
import aiel.friendlist.ActionListener.ShowBtnNameActionListener;
import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.Layout.AddFriendListFrame.Button.SettingBtn;
import aiel.friendlist.Layout.AddFriendListFrame.ContentPanel.AddFriendContentPanel;

import javax.swing.*;
import java.awt.*;

public class AddFriendFrame extends JFrame {
    private boolean isDoneClicked = false;
    private AddFriendContentPanel addFriendContentPanel;
    public AddFriendFrame(){
        super("Add Friend");
        addFriendContentPanel = new AddFriendContentPanel();
        SettingBtn settingBtnPanel = new SettingBtn();

        setLayout(new BorderLayout());
        add(addFriendContentPanel, BorderLayout.CENTER);
        add(settingBtnPanel, BorderLayout.EAST);

        settingBtnPanel.getDoneBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPanel.getDoneBtn().addActionListener(new DoneBtnActionListener());
        settingBtnPanel.getDoneBtn().addActionListener(e -> isDoneClicked = !isDoneClicked);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public boolean isDoneClicked() {
        return isDoneClicked;
    }

    public Friend getFriend() {
        if (isDoneClicked)
            return new Friend(addFriendContentPanel.getFriendInfo());
        else
            return null;
    }
}
