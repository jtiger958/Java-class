package aiel.friendlist.ActionListener;

import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.Layout.AddFriendListFrame.AddFriendFrame;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendContentPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBtnActionListener implements ActionListener {
    private FriendContentPanel friendContentPanel;
    private FriendList friendList;
    public AddBtnActionListener(FriendContentPanel friendContentPanel, FriendList friendList) {
        this.friendContentPanel = friendContentPanel;
        this.friendList = friendList;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new AddFriendFrame(friendContentPanel, friendList);
    }
}
