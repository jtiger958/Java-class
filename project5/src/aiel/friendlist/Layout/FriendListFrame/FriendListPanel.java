package aiel.friendlist.Layout.FriendListFrame;

import aiel.friendlist.DataUtil.FriendList;
import javax.swing.*;
import java.awt.*;

public class FriendListPanel extends JPanel {
    private FriendInfoPanel[] friendInfoPanel;
    private int numFriendInfoPanel;
    FriendListPanel(FriendList friendList){
        numFriendInfoPanel = friendList.numFriends();
        friendInfoPanel = new FriendInfoPanel[numFriendInfoPanel];

        setLayout(new GridLayout(numFriendInfoPanel, 1));
        for(int i = 0; i < numFriendInfoPanel; i++) {
            friendInfoPanel[i] = new FriendInfoPanel(friendList.getFriend(i));
            add(friendInfoPanel[i]);
        }
    }

    FriendInfoPanel getFriendInfoPanel(int i){
        return friendInfoPanel[i];
    }

    int getNumFriendInfoPanel(){
        return numFriendInfoPanel;
    }
}
