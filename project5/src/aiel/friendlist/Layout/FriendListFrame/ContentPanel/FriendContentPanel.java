package aiel.friendlist.Layout.FriendListFrame.ContentPanel;

import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.DataUtil.FriendList;

import java.awt.*;

public class FriendContentPanel extends Panel {
    private FriendListPanel friendListPanel;

    public FriendContentPanel(FriendList friendList){
        friendListPanel =  new FriendListPanel(friendList);
        Container container = new Container();
        setLayout(new FlowLayout());
        container.setLayout(new BorderLayout());

        container.add(new FriendInfoHeadPanel(), BorderLayout.NORTH);
        container.add(friendListPanel, BorderLayout.CENTER);
        add(container);
    }

    public FriendListPanel getFriendListPanel(){
        return friendListPanel;
    }

    public void addFriendListPanel(Friend friend) {
        friendListPanel.addFriendInfoPanel(friend);
        this.validate();
    }

    public void deleteFriendListPanel(int index){
        friendListPanel.deleteFriendInfoPanel(index);
        this.validate();
    }

}
