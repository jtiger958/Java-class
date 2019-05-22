package aiel.friendlist.Layout.AddFriendList;

import aiel.friendlist.ActionListener.DoneBtnActionListener;
import aiel.friendlist.ActionListener.ShowBtnNameActionListener;
import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.Layout.AddFriendList.ButtonPanel.SettingBtnPanel;
import aiel.friendlist.Layout.AddFriendList.ContentPanel.AddFriendContentPanel;

import javax.swing.*;
import java.awt.*;

public class AddFriendFrame extends JFrame {
    private AddFriendContentPanel addFriendContentPanel;
    private Friend friend;
    private boolean isDoneBtnClicked = false;

    public AddFriendFrame(){
        addFriendContentPanel = new AddFriendContentPanel();
        SettingBtnPanel settingBtnPanel = new SettingBtnPanel();

        setLayout(new BorderLayout());
        add(addFriendContentPanel, BorderLayout.CENTER);
        add(settingBtnPanel, BorderLayout.EAST);

        settingBtnPanel.getDoneBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPanel.getDoneBtn().addActionListener(new DoneBtnActionListener(addFriendContentPanel, friend));
        settingBtnPanel.getDoneBtn().addActionListener(e -> isDoneBtnClicked = true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public boolean isDoneBtnClicked(){
        return this.isDoneBtnClicked;
    }

    public Friend getFriendInfo(){
        return friend;
    }
}
