public class Member {

    private String email;
    private String userName;
    private BucketList bucketList;

    public Member(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BucketList getBucketList() {
        return bucketList;
    }

    public void setBucketList(BucketList bucketList) {
        this.bucketList = bucketList;
    }
}
