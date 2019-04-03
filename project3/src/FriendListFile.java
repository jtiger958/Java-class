import java.io.*;

public class FriendListFile {
    public FriendList readFileToList(String fileName){
        FriendList friendList = new FriendList();
        try {
            File file = new File("./data");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] userInfo;
            for (int i = 0; (line = bufferedReader.readLine()) != null; i++){
                    userInfo = line.split(":");
                String name, int group, String email, String phone, String profilePicture
                    friendList.setFriend()

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return friendList;
    }
}
