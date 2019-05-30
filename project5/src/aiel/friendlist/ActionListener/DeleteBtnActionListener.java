package aiel.friendlist.ActionListener;

import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendContentPanel;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendInfoPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteBtnActionListener implements ActionListener {
    private FriendContentPanel friendContentPanel;
    private FriendList friendList;
    public DeleteBtnActionListener(FriendContentPanel friendContentPanel, FriendList friendList){
        this.friendContentPanel =friendContentPanel;
        this.friendList = friendList;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int numFriendInfoPanel = friendContentPanel.getFriendListPanel().getNumFriendInfoPanel();
        FriendInfoPanel friendInfoPanel;

        for(int i = 0; i < numFriendInfoPanel; i++) {
            friendInfoPanel = friendContentPanel.getFriendListPanel().getFriendInfoPanel(i);
            if (friendInfoPanel.isChecked()) {
                friendList.deleteFriend(i);
                friendContentPanel.deleteFriendListPanel(friendInfoPanel.getIndex());
                break;
            }
        }
    }
}
