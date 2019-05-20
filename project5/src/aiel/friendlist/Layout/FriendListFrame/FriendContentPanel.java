package aiel.friendlist.Layout.FriendListFrame;

import aiel.friendlist.DataUtil.FriendList;

import java.awt.*;

class FriendContentPanel extends Panel {
    private FriendListPanel friendListPanel;
    FriendContentPanel(FriendList friendList){
        friendListPanel =  new FriendListPanel(friendList);
        setLayout(new BorderLayout());
        add(new FriendInfoHeadPanel(), BorderLayout.NORTH);
        add(friendListPanel, BorderLayout.CENTER);
    }

    FriendListPanel getFriendListPanel(){
        return friendListPanel;
    }

    void resetFriendListPanel(FriendList friendList){
        remove(friendListPanel);
        friendListPanel =  new FriendListPanel(friendList);
        add(friendListPanel, BorderLayout.CENTER);
    }
}
