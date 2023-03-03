package com.example.ecommerce1;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.ecommerce1.Login.toHexString;

public class Signup {
    String name;
    String pass;
    String email;
    String mobile;
    String address;

    public static void customerSignup(String userName, String userMobile, String userEmail, String userPass, String userAddress) throws NoSuchAlgorithmException {
        // insert into customers (name, email, mobile, password) values ('Salim Ansari','ansariboy@gmail.com','4678676467','boyansari');
        String encryptedPassword = toHexString(userPass);
        //System.out.println("This is the encrypted password --> " + encryptedPassword);
        String query = "insert into customer(name, email, mobile, password,address)values('"+userName+"','"+userEmail+"','"+userMobile+"','"+encryptedPassword+"','"+userAddress+"')";
        DataBaseConnection dbConn = new DataBaseConnection();
        dbConn.insertUpdate(query);
    }
}



