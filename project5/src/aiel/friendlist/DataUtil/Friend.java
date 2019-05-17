package aiel.friendlist.DataUtil;

public class Friend {
    private String name;
    private int group;
    private String email;
    private String phoneNumber;
    private String profilePicture;

    public Friend(String name, int group, String phoneNumber, String email, String profilePicture){
        this.name = name;
        this.group = group;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profilePicture = profilePicture;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return name + ":" + group + ":" + phoneNumber + ":" + email + ":" + profilePicture;
    }
}
