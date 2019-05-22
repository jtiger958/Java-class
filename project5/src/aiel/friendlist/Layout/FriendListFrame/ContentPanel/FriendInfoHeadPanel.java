package aiel.friendlist.Layout.FriendListFrame.ContentPanel;

import java.awt.*;

class FriendInfoHeadPanel extends Panel {
    FriendInfoHeadPanel(){
        setLayout(new GridLayout(1, 6));
        add(new Label("checkbox"));
        add(new Label("Name"));
        add(new Label("Group"));
        add(new Label("Phone Number"));
        add(new Label("Email"));
        add(new Label("Profile Picture"));
    }
}
