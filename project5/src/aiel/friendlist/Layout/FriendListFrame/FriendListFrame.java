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
        SettingBanPanel settingBtnPannel = new SettingBanPanel();

        add(friendContentPanel, BorderLayout.CENTER);
        add(settingBtnPannel, BorderLayout.EAST);


        settingBtnPannel.getAddBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPannel.getAddBtn().addActionListener(new AddBtnListener(friendContentPanel, friendList));

        settingBtnPannel.getDeleteBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPannel.getDeleteBtn().addActionListener(new DeleteBtnActionListener(friendContentPanel, friendList));

        settingBtnPannel.getModifyBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPannel.getModifyBtn().addActionListener(new ModifyBtnListener(friendContentPanel, friendList));

        settingBtnPannel.getSaveFileBtn().addActionListener(new ShowBtnNameActionListener());
        settingBtnPannel.getSaveFileBtn().addActionListener(e -> friendListFile.writeFriendFile(filename, friendList));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
