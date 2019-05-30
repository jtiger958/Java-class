package aiel.friendlist.Layout.FriendListFrame.ContentPanel;

import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.DataUtil.FriendList;

import javax.swing.*;
import java.util.ArrayList;

public class FriendListPanel extends JPanel {
    private ArrayList<FriendInfoPanel> friendInfoPanels;

    FriendListPanel(FriendList friendList){
        int numFriendInfoPanel = friendList.numFriends();
        friendInfoPanels = new ArrayList<>();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for(int i = 0; i < numFriendInfoPanel; i++) {
            friendInfoPanels.add(new FriendInfoPanel(friendList.getFriend(i), i));
            add(friendInfoPanels.get(i));
        }

    }

    public void addFriendInfoPanel(Friend friend){
        friendInfoPanels.add(new FriendInfoPanel(friend, friendInfoPanels.size()));
        add(friendInfoPanels.get(friendInfoPanels.size()-1));
    }

    public FriendInfoPanel getFriendInfoPanel(int i){
        return friendInfoPanels.get(i);
    }

    public void deleteFriendInfoPanel(int index){
        remove(friendInfoPanels.get(index));
        friendInfoPanels.remove(index);
    }

    public int getNumFriendInfoPanel(){
        return friendInfoPanels.size();
    }
}
