package aiel.friendlist.ActionListener;

import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.Layout.AddFriendList.AddFriendFrame;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendContentPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBtnListener implements ActionListener {
    private FriendContentPanel friendContentPanel;
    private FriendList friendList;
    public AddBtnListener(FriendContentPanel friendContentPanel, FriendList friendList) {
        this.friendContentPanel = friendContentPanel;
        this.friendList = friendList;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new AddFriendFrame(friendContentPanel, friendList);
    }
}
