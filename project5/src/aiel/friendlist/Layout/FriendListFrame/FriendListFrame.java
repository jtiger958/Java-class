package aiel.friendlist.Layout.FriendListFrame;

import aiel.friendlist.ActionListener.AddBtnListener;
import aiel.friendlist.ActionListener.DeleteBtnActionListener;
import aiel.friendlist.ActionListener.ModifyBtnListener;
import aiel.friendlist.ActionListener.ShowBtnNameActionListener;
import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.DataUtil.FriendListFile;
import aiel.friendlist.Layout.FriendListFrame.ButtonPanel.SettingBanPanel;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendContentPanel;

import javax.swing.*;
import java.awt.*;

public class FriendListFrame extends JFrame {
    public FriendListFrame(String filename){
        setLayout(new BorderLayout());

        FriendListFile friendListFile  = new FriendListFile();
        FriendList friendList = friendListFile.readFileToList(filename);
        FriendContentPanel friendContentPanel = new FriendContentPanel(friendList);
        SettingBanPanel settingBanPanel = new SettingBanPanel();

        add(friendContentPanel, BorderLayout.CENTER);
        add(settingBanPanel, BorderLayout.EAST);


        settingBanPanel.getAddBtn().addActionListener(new ShowBtnNameActionListener());
        settingBanPanel.getAddBtn().addActionListener(new AddBtnListener(friendContentPanel, friendList));

        settingBanPanel.getDeleteBtn().addActionListener(new ShowBtnNameActionListener());
        settingBanPanel.getDeleteBtn().addActionListener(new DeleteBtnActionListener(friendContentPanel, friendList));

        settingBanPanel.getModifyBtn().addActionListener(new ShowBtnNameActionListener());
        settingBanPanel.getModifyBtn().addActionListener(new ModifyBtnListener(friendContentPanel, friendList));

        settingBanPanel.getSaveFileBtn().addActionListener(new ShowBtnNameActionListener());
        settingBanPanel.getSaveFileBtn().addActionListener(e -> friendListFile.writeFriendFile(filename, friendList));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
