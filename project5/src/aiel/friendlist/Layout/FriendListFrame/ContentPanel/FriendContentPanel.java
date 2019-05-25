package aiel.friendlist.Layout.FriendListFrame.ContentPanel;

import aiel.friendlist.DataUtil.FriendList;

import java.awt.*;

public class FriendContentPanel extends Panel {
    private FriendListPanel friendListPanel;
    private Container container;
    public FriendContentPanel(FriendList friendList){
        friendListPanel =  new FriendListPanel(friendList);
        container = new Container();
        setLayout(new FlowLayout());
        container.setLayout(new BorderLayout());

        container.add(new FriendInfoHeadPanel(), BorderLayout.NORTH);
        container.add(friendListPanel, BorderLayout.CENTER);
        add(container);
    }

    public FriendListPanel getFriendListPanel(){
        return friendListPanel;
    }

    public void resetFriendListPanel(FriendList friendList){
        container.remove(friendListPanel);
        friendListPanel =  new FriendListPanel(friendList);
        container.add(friendListPanel, BorderLayout.CENTER);
    }
}
