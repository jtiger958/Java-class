public class FriendList {
    private int numFriends = 0;
    private final int maxFriend = 10;
    private Friend[] friends;

    public FriendList() {
        this.friends = new Friend[maxFriend];
    }

    public int getNumFriends() {
        return numFriends;
    }

    public Friend getFriend(int i) {
        return friends[i];
    }
    public FriendList setFriend(int num, String name, int group, String email, String phone, String profilePicture){
        friends[num] = new Friend(name, group, email, phone, profilePicture);
        return this;
    }
}
