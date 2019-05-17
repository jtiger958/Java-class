package aiel.friendlist.Layout;

import javax.swing.*;
import java.awt.*;

public class FriendListFrame extends JFrame {
    public FriendListFrame(){
        setLayout(new BorderLayout());
        add(new FriendConentPannel(), BorderLayout.CENTER);
        add(new SettingBtnPannel(), BorderLayout.EAST);
    }
}
