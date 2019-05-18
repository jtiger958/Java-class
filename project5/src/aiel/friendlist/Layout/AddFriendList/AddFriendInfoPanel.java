package aiel.friendlist.Layout.AddFriendList;

import aiel.friendlist.DataUtil.Friend;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFriendInfoPanel extends JPanel {
    private JTextField name;
    private JTextField group;
    private JTextField phoneNumber;
    private JTextField email;
    private JTextField profilePicture;

    public AddFriendInfoPanel(){
        name = new JTextField();
        group = new JTextField();
        phoneNumber = new JTextField();
        email = new JTextField();
        profilePicture = new JTextField();

        setLayout(new GridLayout(1, 5));
        add(name);
        add(group);
        add(phoneNumber);
        add(email);
        add(profilePicture);

    }
    public Friend getFriendInfo(){
        Friend friend = new Friend(name.getText(), Integer.parseInt(group.getText()),
                phoneNumber.getText(), email.getText(), profilePicture.getText());
        return friend;
    }
}