package aiel.friendlist.Layout.AddFriendList;

import aiel.friendlist.DataUtil.Friend;
import aiel.friendlist.Layout.FriendListFrame.FriendListFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFriendFrame extends JFrame {
    private AddFriendContentPanel addFriendContentPanel;
    private JButton doneBtn;
    Friend friendinfo;
    private boolean isBtnclicked = false;
    FriendListFrame friendListFrame;
    public AddFriendFrame(){
        addFriendContentPanel = new AddFriendContentPanel();
        doneBtn = new JButton("Done");

        setLayout(new BorderLayout());
        add(addFriendContentPanel, BorderLayout.CENTER);
        add(doneBtn, BorderLayout.EAST);

        doneBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("doneBtn is clicked");
                isBtnclicked = true;
                friendinfo = addFriendContentPanel.getFriendAddInfoPanel().getFriendInfo();
                dispose();
            }
        });

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public boolean isBtnclicked(){
        return this.isBtnclicked;
    }

    public Friend getFriendinfo(){
        return friendinfo;
    }
}
