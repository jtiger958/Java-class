package aiel.friendlist.ActionListener;

import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.Layout.AddFriendListFrame.AddFriendFrame;
import aiel.friendlist.Layout.FriendListFrame.ContentPanel.FriendContentPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AddBtnActionListener implements ActionListener {
    private FriendContentPanel friendContentPanel;
    private FriendList friendList;
    private Friend friend;
    public AddBtnActionListener(FriendContentPanel friendContentPanel, FriendList friendList) {
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
                friend = addFriendFrame.getFriend();
                if(friend != null){
                    friendList.addFriend(friend);
                    friendContentPanel.addFriendListPanel(friend);
                }
            }
        });
    }
}
