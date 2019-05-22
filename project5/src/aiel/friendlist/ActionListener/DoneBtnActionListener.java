package aiel.friendlist.ActionListener;

import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.Layout.AddFriendList.ContentPanel.AddFriendContentPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoneBtnActionListener implements ActionListener {
    private Friend friend;
    private AddFriendContentPanel addFriendContentPanel;

    public DoneBtnActionListener(AddFriendContentPanel addFriendContentPanel, Friend friend) {
        this.friend = friend;
        this.addFriendContentPanel = addFriendContentPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        friend = addFriendContentPanel.getFriendAddInfoPanel().getFriendInfo();
        final JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());

        if(!friend.getEmail().contains("@")) {
            System.out.println("Illegal email format");
            return;
        }

        frame.dispose();
    }
}
