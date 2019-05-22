package aiel.friendlist.Layout.FriendListFrame.ContentPanel;

import aiel.friendlist.DataUtil.FriendList;

import java.awt.*;

public class FriendContentPanel extends Panel {
    private FriendListPanel friendListPanel;
    public FriendContentPanel(FriendList friendList){
        friendListPanel =  new FriendListPanel(friendList);
        setLayout(new BorderLayout());
        add(new FriendInfoHeadPanel(), BorderLayout.NORTH);
        add(friendListPanel, BorderLayout.CENTER);
    }

    public FriendListPanel getFriendListPanel(){
        return friendListPanel;
    }

    public void resetFriendListPanel(FriendList friendList){
        remove(friendListPanel);
        friendListPanel =  new FriendListPanel(friendList);
        add(friendListPanel, BorderLayout.CENTER);
    }
}
