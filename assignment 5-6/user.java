package assignment5_6;

 public class user {

    protected int userid;
    protected String username;
    protected String email;

    public user(int userid, String username, String email) {
        this.userid = userid;
        this.username = username;
        this.email = email;
    }

    public String getuserdetails() {
        return "user : "+username+" -- email : " +email;
    }
}

