package aiel.friendlist.Layout.AddFriendList;

import aiel.friendlist.ActionListener.DoneBtnActionListener;
import aiel.friendlist.ActionListener.ShowBtnNameActionListener;
import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.Layout.AddFriendList.ButtonPanel.SettingBtnPanel;
import aiel.friendlist.Layout.AddFriendList.ContentPanel.AddFriendContentPanel;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendContentPanel;

import javax.swing.*;
import java.awt.*;

public class AddFriendFrame extends JFrame {

    public AddFriendFrame(FriendContentPanel friendContentPanel, FriendList friendList){
        AddFriendContentPanel addFriendContentPanel = new AddFriendContentPanel();
        SettingBtnPanel settingBtnPanel = new SettingBtnPanel();

        setLayout(new BorderLayout());
        add(addFriendContentPanel, BorderLayout.CENTER);
        add(settingBtnPanel, BorderLayout.EAST);

        settingBtnPanel.getDoneBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPanel.getDoneBtn().addActionListener(new DoneBtnActionListener(addFriendContentPanel, friendContentPanel, friendList));

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
