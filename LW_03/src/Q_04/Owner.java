package Q_04;

public class Owner {
    // Data Member
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    //Returns the name of this bicycle's owner
    public String getOwnerName() {
        return ownerName;
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        ownerName = name;
    }

    //Returns the phone number of this bicycle's owner
    public String getPhoneNo() {
        return phoneNo;
    }

    //Assigns the name of this bicycle's owner
    public void setPhoneNo(String num) {
        phoneNo = num;
    }
}
