package aiel.friendlist.Layout.FriendListFrame.ContentPanel;

import aiel.friendlist.DataUtil.Friend;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FriendInfoPanel extends JPanel {
    private JLabel name;
    private JTextField group;
    private JTextField phoneNumber;
    private JTextField email;
    private JLabel profilePicture;
    private JCheckBox checkbox;

    public FriendInfoPanel(Friend friend){
        checkbox = new JCheckBox();
        name = new JLabel(friend.getName());
        group = new JTextField(String.valueOf(friend.getGroup()));
        phoneNumber = new JTextField(friend.getPhoneNumber());
        email = new JTextField(friend.getEmail());
        profilePicture = new JLabel(friend.getProfilePicture());

        setLayout(new GridLayout(1, 6));
        add(checkbox);
        add(name);
        add(group);
        add(phoneNumber);
        add(email);
        add(profilePicture);

    }

    public Friend getFriend(){
        return new Friend(name.getText(), Integer.parseInt(group.getText()),
                phoneNumber.getText(), email.getText(), profilePicture.getText());
    }

    public boolean isChecked(){
        return checkbox.isSelected();
    }
}
