public class Friend {
    private String name;
    private int group;
    private String email;
    private String phone;
    private String profilePicture;

    Friend(String name, int group, String phone, String email, String profilePicture){
        this.name = name;
        this.group = group;
        this.email = email;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Friend {" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                '}';
    }


}
