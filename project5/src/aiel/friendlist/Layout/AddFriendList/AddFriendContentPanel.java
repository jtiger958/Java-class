package aiel.friendlist.Layout.AddFriendList;

import aiel.friendlist.Layout.FriendListFrame.FriendInfoHeadPanel;

import javax.swing.*;
import java.awt.*;

public class AddFriendContentPanel extends JPanel {
    private AddFriendInfoPanel addFriendInfoPanel = new AddFriendInfoPanel();
    private AddFriendInfoHeadPanel addFriendInfoHeadPanel = new AddFriendInfoHeadPanel();
    AddFriendContentPanel(){
        setLayout(new BorderLayout());

        add(addFriendInfoHeadPanel, BorderLayout.NORTH);
        add(addFriendInfoPanel, BorderLayout.CENTER);
    }

    public AddFriendInfoPanel getFriendAddInfoPanel() {
        return addFriendInfoPanel;
    }
}
