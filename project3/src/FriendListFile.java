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
                    userInfo = line.split(": ");
                    if (userInfo[0].substring(0,2).equals("//")) {
                        i--;
                        continue;
                    }
                    if (userInfo.length != 5) {
                        System.out.println("Not enough information in line");
                        System.out.println("[err] in " + line);
                    }
                    friendList.setFriend(i, name, group, email, phone, profilePicture);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return friendList;
    }
}
