import java.util.Date;

public class Notebook {
    String initials;
    String nickname;
    String comment;
    Groups group;
    String homePhoneNumber;
    String mobilePhoneNumber;
    String email;
    String skype;
    String address;
    String addressByPost;
    Date recordDate;
    Date dateOfChange;

    public void setAddressByPost(String addressByPost) {
        this.addressByPost = addressByPost;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setAddress(String address) {
        this.address = address;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setSkype(String skype) {
        this.skype = skype;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setEmail(String email) {
        this.email = email;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setGroup(Groups group) {
        this.group = group;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setComment(String comment) {
        this.comment = comment;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setInitials(String initials) {
        this.initials = initials;
        dateOfChange = new Date(System.currentTimeMillis());
    }

    public void setValue(String initials, String nickname, String comment, Groups group,
                         String homePhoneNumber, String mobilePhoneNumber, String email, String skype, String address,
                         String addressByPost, Date recordOfDate, Date dateOfChange) {
        this.initials = initials;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.addressByPost = addressByPost;
        this.recordDate = recordOfDate;
        this.dateOfChange = dateOfChange;
    }

    public void printValues() {
        System.out.print("initials: " + this.initials + "\n" + "nickname: " + this.nickname + "\n" +
                "comment: " + this.comment + "\n" + "group: " + this.group + "\n" + "homePhoneNumber: " + this.homePhoneNumber
                + "\n" + "mobilePhoneNumber: " + this.mobilePhoneNumber + "\n" + "email: " + this.email
                + "\n" + "skype: " + this.skype + "\n" + "address: " + this.address
                + "\n" + "addressByPost: " + this.addressByPost + "\n" + "recordDate: " + this.recordDate);
    }

}
