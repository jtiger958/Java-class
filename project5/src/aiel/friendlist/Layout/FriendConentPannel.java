package aiel.friendlist.Layout;

import java.awt.*;

public class FriendConentPannel extends Panel {
    FriendConentPannel(){
        setLayout(new BorderLayout());
        add(new FriendInfoHeadPanel(), BorderLayout.NORTH);
        add(new FriendListPanel(), BorderLayout.CENTER);
    }
}
