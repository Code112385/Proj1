package Pack1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author senju
 */
class User {

    private String fname;
    private String lname;
    private static String username;
    private String password;
    private String role;
    private static String Id;
    private String email;

    User(String Id, String fname, String lname, String password, String role, String email) {
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.Id = Id;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }
}
