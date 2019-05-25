package aiel.friendlist.ActionListener;

import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.Layout.AddFriendListFrame.ContentPanel.AddFriendContentPanel;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendContentPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoneBtnActionListener implements ActionListener {
    private AddFriendContentPanel addFriendContentPanel;
    private FriendList friendList;
    private  FriendContentPanel friendContentPanel;
    public DoneBtnActionListener(AddFriendContentPanel addFriendContentPanel, FriendContentPanel friendContentPanel,
                                 FriendList friendList) {
        this.addFriendContentPanel = addFriendContentPanel;
        this.friendContentPanel = friendContentPanel;
        this.friendList = friendList;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Friend friend = addFriendContentPanel.getFriendAddInfoPanel().getFriendInfo();
        final JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());

        if(!friend.getEmail().contains("@")) {
            System.out.println("Illegal email format");
            return;
        }
        else if(friendList.searchFriend(friend.getName()) != null){
            System.out.println("Name Conflict");
            return;
        }

        friendList.addFriend(friend);
        friendContentPanel.resetFriendListPanel(friendList);
        friendContentPanel.validate();
        frame.dispose();
    }
}
