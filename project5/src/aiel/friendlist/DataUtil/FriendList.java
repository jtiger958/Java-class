package aiel.friendlist.DataUtil;

public class FriendList extends ObjectList<Friend> {
    FriendList() {
        super();
    }

    public int numFriends() {
        return super.numElement();
    }

    public Friend getFriend(int index) {
        return super.getElement(index);
    }

    public void addFriend(String name, int group, String phoneNumber, String email, String profilePicture){
        super.setElement(new Friend(name, group, phoneNumber, email, profilePicture));
    }

    public void addFriend(Friend friend){
        super.setElement(friend);
    }

    public void deleteFriend(Friend friend){
        super.deleteElement(friend);
    }

    public void deleteFriend(int index){
        this.deleteFriend(getFriend(index));
    }

    public void modifyFriend(Friend srcFriend, Friend desFriend){
        super.modifyElement(srcFriend, desFriend);
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < numFriends(); i++){
            str += getFriend(i) + "\n";
        }
        return str;
    }
}
