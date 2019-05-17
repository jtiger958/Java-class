package aiel.friendlist.Layout.FriendListFrame;

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
    private boolean isChecked;

    public FriendInfoPanel(Friend friend){
        checkbox = new JCheckBox();
        name = new JLabel(friend.getName());
        group = new JTextField(String.valueOf(friend.getGroup()));
        phoneNumber = new JTextField(friend.getPhoneNumber());
        email = new JTextField(friend.getEmail());
        profilePicture = new JLabel(friend.getProfilePicture());
        isChecked = false;

        setLayout(new GridLayout(1, 6));
        add(checkbox);
        add(name);
        add(group);
        add(phoneNumber);
        add(email);
        add(profilePicture);

        checkbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isChecked = !isChecked;
            }
        });
    }

    public Friend getFriend(){
        Friend friend = new Friend(name.getText(), Integer.parseInt(group.getText()),
                phoneNumber.getText(), email.getText(), profilePicture.getText());
        return friend;
    }

    public boolean isChecked(){
        return isChecked;
    }
}
