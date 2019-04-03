public class AutoTest {
    public static void main(String[] args){
        FriendListFile friendListFile  = new FriendListFile();
        FriendList friendList = friendListFile.readFileToList("friendlist-norm.data");

        System.out.println(friendList.getFriend(1));
    }
}