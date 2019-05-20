package aiel.friendlist.Layout.AddFriendList;

import aiel.friendlist.DataUtil.Friend;

import javax.swing.*;
import java.awt.*;

public class AddFriendFrame extends JFrame {
    private AddFriendContentPanel addFriendContentPanel;
    private Friend friendInfo;
    private boolean isDoneBtnClicked = false;

    public AddFriendFrame(){
        addFriendContentPanel = new AddFriendContentPanel();
        JButton doneBtn = new JButton("Done");

        setLayout(new BorderLayout());
        add(addFriendContentPanel, BorderLayout.CENTER);
        add(doneBtn, BorderLayout.EAST);

        doneBtn.addActionListener(e -> {
            System.out.println("doneBtn is clicked");
            isDoneBtnClicked = true;
            friendInfo = addFriendContentPanel.getFriendAddInfoPanel().getFriendInfo();

            if(!friendInfo.getEmail().contains("@")) {
                System.out.println("Illegal email format");
                return;
            }
            dispose();
        });

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public boolean isDoneBtnClicked(){
        return this.isDoneBtnClicked;
    }

    public Friend getFriendInfo(){
        return friendInfo;
    }
}
