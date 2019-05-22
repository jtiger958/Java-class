package aiel.friendlist.Layout.AddFriendList.ContentPanel;

import javax.swing.*;
import java.awt.*;

public class AddFriendContentPanel extends JPanel {
    private AddFriendInfoPanel addFriendInfoPanel = new AddFriendInfoPanel();
    public AddFriendContentPanel(){
        setLayout(new BorderLayout());

        add(new AddFriendInfoHeadPanel(), BorderLayout.NORTH);
        add(addFriendInfoPanel, BorderLayout.CENTER);
    }

    public AddFriendInfoPanel getFriendAddInfoPanel() {
        return addFriendInfoPanel;
    }
}
