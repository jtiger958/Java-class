class Friend {
    private String name;
    private int group;
    private String email;
    private String phoneNumber;
    private String profilePicture;

    Friend(String name, int group, String phoneNumber, String email, String profilePicture){
        this.name = name;
        this.group = group;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profilePicture = profilePicture;
    }

    String getName() {
        return name;
    }

    int getGroup() {
        return group;
    }

    String getEmail() {
        return email;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    String getProfilePicture() {
        return profilePicture;
    }

    void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Friend {" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                '}';
    }
}
