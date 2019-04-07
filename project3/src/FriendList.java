import java.util.Arrays;

class FriendList extends ObjectList<Friend> {
    FriendList() {
        super(100);
    }
    FriendList(int maxNum) {
        super(maxNum);
    }

    int numFriends() {
        return super.numElement();
    }

    Friend getFriend(int index) {
        return super.getElement(index);
    }
    void setFriend(int num, String name, int group, String phoneNumber, String email, String profilePicture){
        super.setElement(num, new Friend(name, group, phoneNumber, email, profilePicture));
    }

    @Override
    public String toString() {
        return "FriendList{" +
                "numElement=" + numElement +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
