package aiel.friendlist.Layout.AddFriendListFrame.ContentPanel;

import java.awt.*;

class AddFriendInfoHeadPanel extends Panel {
    AddFriendInfoHeadPanel(){
        setLayout(new GridLayout(1, 5));
        add(new Label("Name"));
        add(new Label("Group"));
        add(new Label("Phone Number"));
        add(new Label("Email"));
        add(new Label("Profile Picture"));
    }
}

