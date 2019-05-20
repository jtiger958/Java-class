package aiel.friendlist.Layout.FriendListFrame;

import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.DataUtil.FriendListFile;
import aiel.friendlist.Layout.AddFriendList.AddFriendFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FriendListFrame extends JFrame {
    private FriendContentPanel friendContentPanel;
    private SettingBtnPannel settingBtnPannel;
    public FriendListFrame(String filename){
        setLayout(new BorderLayout());

        FriendListFile friendListFile  = new FriendListFile();
        FriendList friendList = friendListFile.readFileToList(filename);
        friendContentPanel = new FriendContentPanel(friendList);
        settingBtnPannel = new SettingBtnPannel();

        add(friendContentPanel, BorderLayout.CENTER);
        add(settingBtnPannel, BorderLayout.EAST);



        settingBtnPannel.getAddBtn().addActionListener(e -> {
            System.out.println("addBtn is clicked");
            AddFriendFrame addFriendFrame = new AddFriendFrame();
            addFriendFrame.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {

                }

                @Override
                public void windowClosed(WindowEvent e) {

                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {
                    if (addFriendFrame.isDoneBtnClicked()) {
                        Friend friend = addFriendFrame.getFriendInfo();
                        if(friendList.searchFriend(friend.getName()) == null){
                            System.out.println("Name Conflict");
                            return;
                        }
                        friendList.addFriend(friend);
                        friendContentPanel.resetFriendListPanel(friendList);

                        validate();
                    }
                }
            });
        });

        settingBtnPannel.getDeleteBtn().addActionListener(e -> {
            System.out.println("deleteBtn is clicked");
            int numFriendInfoPanel = friendContentPanel.getFriendListPanel().getNumFriendInfoPanel();
            FriendInfoPanel friendInfoPanel;

            for(int i = 0; i < numFriendInfoPanel; i++) {
                friendInfoPanel = friendContentPanel.getFriendListPanel().getFriendInfoPanel(i);
                if(friendInfoPanel.isChecked()) {
                    friendList.deleteFriend(i);
                    break;
                }
            }
            friendContentPanel.resetFriendListPanel(friendList);
            validate();
        });

        settingBtnPannel.getModifyBtn().addActionListener(e -> {
            System.out.println("modifyBtn is clicked");
            int numFriendInfoPanel = friendContentPanel.getFriendListPanel().getNumFriendInfoPanel();
            FriendInfoPanel friendInfoPanel;

            for(int i = 0; i < numFriendInfoPanel; i++) {
                friendInfoPanel = friendContentPanel.getFriendListPanel().getFriendInfoPanel(i);
                if (friendInfoPanel.isChecked()) {
                    friendList.modifyFriend(friendList.getFriend(i), friendInfoPanel.getFriend());
                    break;
                }
            }
            friendContentPanel.resetFriendListPanel(friendList);
            validate();
        });

        settingBtnPannel.getSaveFileBtn().addActionListener(e -> {
            System.out.println("saveFileBtn is clicked");
            friendListFile.writeFriendFile(filename, friendList);
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

}
