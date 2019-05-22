package aiel.friendlist.ActionListener;

import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.Layout.AddFriendList.AddFriendFrame;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendContentPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AddBtnListener implements ActionListener {
    private FriendContentPanel friendContentPanel;
    private FriendList friendList;
    public AddBtnListener(FriendContentPanel friendContentPanel, FriendList friendList) {
        this.friendContentPanel = friendContentPanel;
        this.friendList = friendList;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
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
                    if (friendList.searchFriend(friend.getName()) != null) {
                        System.out.println("Name Conflict");
                        return;
                    }
                    friendList.addFriend(friend);
                    friendContentPanel.resetFriendListPanel(friendList);
                    friendContentPanel.validate();
                }
            }
        });
    }
}
