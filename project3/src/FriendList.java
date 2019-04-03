import java.util.Arrays;

public class FriendList extends ObjectList<Friend> {
    public FriendList() {
        super(100);
    }
    public FriendList(int maxNum) {
        super(maxNum);
    }

    public int numFriends() {
        return super.numElement();
    }

    public Friend getFriend(int index) {
        return super.getElement(index);
    }
    public void setFriend(int num, String name, int group, String phone, String email, String profilePicture){
        super.setElement(num, new Friend(name, group, phone, email, profilePicture));
    }

    @Override
    public String toString() {
        return "FriendList{" +
                "numElement=" + numElement +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
