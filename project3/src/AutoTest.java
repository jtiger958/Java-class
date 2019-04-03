public class AutoTest {
    public static void main(String[] args){
        FriendListFile friendListFile  = new FriendListFile();
        FriendList friendList = friendListFile.readFileToList("friendlist-norm.data");

        for(int i = 0; i < friendList.numFriends(); i++){
            System.out.println(friendList.getFriend(i));
        }

    }
}