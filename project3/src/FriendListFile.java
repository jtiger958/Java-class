import java.io.*;

public class FriendListFile {
    public FriendList readFileToList(String fileName){
        FriendList friendList = new FriendList();
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] userInfo;
            for (int i = 0; (line = bufferedReader.readLine()) != null; i++){
                    userInfo = line.replaceAll(" ", "").split(":");
                    if (userInfo[0].substring(0,2).equals("//")) {
                        i--;
                        continue;
                    }
                    if (userInfo.length != 5) {
                        throw new ReadIncompleteUserInfoExeption("Not enough information in line in" + line);
                    }

                    friendList.setFriend(i, userInfo[0], Integer.parseInt(userInfo[1]), userInfo[2], userInfo[3], userInfo[4]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ReadIncompleteUserInfoExeption e) {
            e.printStackTrace();
        }
        return friendList;
    }
}
