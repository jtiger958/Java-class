package aiel.friendlist.Layout.FriendListFrame;

import aiel.friendlist.ActionListener.AddBtnListener;
import aiel.friendlist.ActionListener.DeleteBtnActionListener;
import aiel.friendlist.ActionListener.ModifyBtnListener;
import aiel.friendlist.ActionListener.ShowBtnNameActionListener;
import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.DataUtil.FriendListFile;
import aiel.friendlist.Layout.FriendListFrame.ButtonPanel.SettingBtnPanel;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendContentPanel;

import javax.swing.*;
import java.awt.*;

public class FriendListFrame extends JFrame {
    public FriendListFrame(String filename){
        super("Friend List");
        setLayout(new BorderLayout());

        FriendListFile friendListFile  = new FriendListFile();
        FriendList friendList = friendListFile.readFileToList(filename);
        FriendContentPanel friendContentPanel = new FriendContentPanel(friendList);
        SettingBtnPanel settingBtnPanel = new SettingBtnPanel();

        add(friendContentPanel, BorderLayout.CENTER);
        add(settingBtnPanel, BorderLayout.EAST);


        settingBtnPanel.getAddBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPanel.getAddBtn().addActionListener(new AddBtnListener(friendContentPanel, friendList));

        settingBtnPanel.getDeleteBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPanel.getDeleteBtn().addActionListener(new DeleteBtnActionListener(friendContentPanel, friendList));

        settingBtnPanel.getModifyBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPanel.getModifyBtn().addActionListener(new ModifyBtnListener(friendContentPanel, friendList));

        settingBtnPanel.getSaveFileBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPanel.getSaveFileBtn().addActionListener(e -> friendListFile.writeFriendFile(filename, friendList));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 300);
        setVisible(true);
    }
}
