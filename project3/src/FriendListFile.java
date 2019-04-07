import java.io.*;

public class FriendListFile extends ListFile{
    private FriendList friendList = new FriendList();

    @Override
    public FriendList readFileToList(String fileName){
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] userInfo;
            for (int i = 0; (line = bufferedReader.readLine()) != null; i++){
                    userInfo = line.replaceAll(" ", "").split(":");
                    if(!isRightInformation(userInfo)) {
                        i--;
                        continue;
                    }
                    friendList.setFriend(i, userInfo[0], Integer.parseInt(userInfo[1]), userInfo[2], userInfo[3], userInfo[4]);
            }
        } catch (NameConflictExeption | IOException e) {
            e.printStackTrace();
        }
        return friendList;
    }

    private boolean isRightInformation(String[] userInfo) throws NameConflictExeption {
        int numOfFriend = friendList.numFriends();
        Friend tempFriend;
        String tempName;

        if (userInfo[0].startsWith("//"))
            return false;

        if (userInfo.length < 5) {
            System.out.println("Not enough information in line. Skip the input line");
            return false;
        }

        if (userInfo.length > 5){
            System.out.println("too many information in line. Skip the input line");
            return false;
        }

        if (userInfo[3].indexOf('@') == -1){
            System.out.println("Illegal email address. Skip the input line");
            return false;
        }

        for(int i = 0; i < numOfFriend; i++){
            tempFriend = friendList.getFriend(i);
            tempName = tempFriend.getName();
            if (tempName.equals(userInfo[0])) {
                throw new NameConflictExeption();
            }
        }

        try {
            Integer.parseInt(userInfo[1]);
        } catch (Exception e){
            System.out.println("Illegal value. Skip the input line");
            return false;
        }

        return true;
    }
}
