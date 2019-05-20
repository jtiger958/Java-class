package aiel.friendlist.Layout.AddFriendList;

import javax.swing.*;
import java.awt.*;

class AddFriendContentPanel extends JPanel {
    private AddFriendInfoPanel addFriendInfoPanel = new AddFriendInfoPanel();
    AddFriendContentPanel(){
        setLayout(new BorderLayout());

        add(new AddFriendInfoHeadPanel(), BorderLayout.NORTH);
        add(addFriendInfoPanel, BorderLayout.CENTER);
    }

    AddFriendInfoPanel getFriendAddInfoPanel() {
        return addFriendInfoPanel;
    }
}
