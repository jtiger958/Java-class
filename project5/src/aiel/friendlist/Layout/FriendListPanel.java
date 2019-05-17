package aiel.friendlist.Layout;

import aiel.friendlist.DataUtil.FriendList;
import aiel.friendlist.DataUtil.FriendListFile;
import javax.swing.*;
import java.awt.*;

public class FriendListPanel extends JPanel {
    FriendListPanel(){
        FriendListFile friendListFile  = new FriendListFile();
        FriendList friendList = friendListFile.readFileToList("friendlist-norm.data");

        int numFriend = friendList.numFriends();
        FriendInfoPanel[] friendInfoPanel = new FriendInfoPanel[numFriend];

        setLayout(new GridLayout(numFriend, 1));
        for(int i = 0; i < numFriend; i++) {
            friendInfoPanel[i] = new FriendInfoPanel(friendList.getFriend(i));
            add(friendInfoPanel[i]);
        }
    }
}
