package aiel.friendlist.ActionHandler;

import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.Layout.AddFriendList.AddFriendFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AddBtnActionListener implements ActionListener {
    AddBtnActionListener(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {
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
                if (addFriendFrame.isBtnclicked()) {
                    friendList.addFriend(addFriendFrame.getFriendinfo());
                    friendContentPanel.resetFriendListPanel(friendList);
                    validate();
                }
            }
        });
    }
    Friend getFriends(){

    }
}