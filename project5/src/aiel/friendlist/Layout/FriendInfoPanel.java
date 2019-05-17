package aiel.friendlist.Layout;

import aiel.friendlist.DataUtil.Friend;
import javax.swing.*;
import java.awt.*;

public class FriendInfoPanel extends JPanel {
    private JComponent name;
    private JTextField group;
    private JTextField phoneNumber;
    private JTextField email;
    private JComponent photoPath;

    FriendInfoPanel(){
        JCheckBox checkbox = new JCheckBox();
        name = new JTextField();
        group = new JTextField();
        phoneNumber = new JTextField();
        email = new JTextField();
        photoPath = new JTextField();

        setLayout(new GridLayout(1, 6));
        add(checkbox);
        add(name);
        add(group);
        add(phoneNumber);
        add(email);
        add(photoPath);
    }
    FriendInfoPanel(Friend friend){
        this();
        remove(name);
        name = new JLabel(friend.getName());
        add(name, 0, 1);
        group.setText(String.valueOf(friend.getGroup()));
        phoneNumber.setText(friend.getPhoneNumber());
        email.setText(friend.getEmail());
        remove(photoPath);
        photoPath = new JLabel(friend.getProfilePicture());
        add(photoPath, 5);
    }

}
