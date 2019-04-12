import java.io.*;
import java.util.regex.Pattern;

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
                line = line.replaceAll(" ", "");
                if(!isRightInformation(line)) {
                    i--;
                    continue;
                }
                userInfo = line.split(":");
                try {
                    friendList.setFriend(i, userInfo[0], Integer.parseInt(userInfo[1]), userInfo[2], userInfo[3], userInfo[4]);
                }catch (ArrayIndexOutOfBoundsException e){
                    friendList.setFriend(i, userInfo[0], Integer.parseInt(userInfo[1]), userInfo[2], userInfo[3], null);
                }
            }
        } catch (NameConflictExeption e) {
            System.out.println("Name Conflict");
        } catch (IOException e){
            System.out.println("Unknown File");
        }
        return friendList;
    }

    private boolean isRightInformation(String line) throws NameConflictExeption {
        int numOfFriend = friendList.numFriends();
        Friend tempFriend;
        String tempName;
        String[] userInfo = line.split(":");

        if (userInfo[0].startsWith("//"))
            return false;

        if (userInfo.length < 5 && !line.endsWith(":")) {
            System.out.println("Irregular input line   ; Skip the input line : " + line);
            return false;
        }

        if (userInfo.length > 5){
            System.out.println("Irregular input line   ; Skip the input line : " + line);
            return false;
        }

        if (userInfo[3].indexOf('@') == -1){
            System.out.println("Illegal email address ; Skip the input line : " + line);
            return false;
        }

        for(int i = 0; i < numOfFriend; i++){
            tempFriend = friendList.getFriend(i);
            tempName = tempFriend.getName();
            if (tempName.equals(userInfo[0])) {
                throw new NameConflictExeption();
            }
        }

        if(!userInfo[1].matches( "^[0-9]*$")){
            System.out.println("Illegal value -- " + userInfo[1] + "Skip the input line : "
                    + String.join(":", userInfo));
            return false;
        }

        return true;
    }
}
