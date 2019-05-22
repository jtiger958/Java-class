package aiel.friendlist.Layout.FriendListFrame.ContentPanel;

import aiel.friendlist.DataUtil.FriendList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FriendListPanel extends JPanel {
    private ArrayList<FriendInfoPanel> friendInfoPanels;
    private int numFriendInfoPanel;
    public FriendListPanel(FriendList friendList){
        numFriendInfoPanel = friendList.numFriends();
        friendInfoPanels = new ArrayList<>();

        setLayout(new GridLayout(numFriendInfoPanel, 1));
        for(int i = 0; i < numFriendInfoPanel; i++) {
            friendInfoPanels.add(new FriendInfoPanel(friendList.getFriend(i)));
            add(friendInfoPanels.get(i));
        }
    }

    public FriendInfoPanel getFriendInfoPanel(int i){
        return friendInfoPanels.get(i);
    }

    public int getNumFriendInfoPanel(){
        return numFriendInfoPanel;
    }
}
