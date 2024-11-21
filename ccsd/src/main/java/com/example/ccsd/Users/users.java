package com.example.ccsd.Users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class users {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private String profPic;

     // Constructors
     public users() {}

    public users(String userId, String firstName, String  lastName, String phoneNumber, String email, String password, String profPic){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.profPic = profPic;
    }

    //getter user id
    public String getUserId()
    {
        return userId;
    }

     // setter user id
     public void setUserId(String userId){
        this.userId = userId;
    }

     //getter first name
     public String getFirstName()
     {
         return firstName;
     }
 
     // setter first name
     public void setFirstName(String firstName){
         this.firstName = firstName;
     }

      //getter last name
      public String getLastName()
      {
          return lastName;
      }
  
      // setter last name
      public void setLastName(String lastName){
          this.lastName = lastName;
      }

       //getter phone number
       public String getPhoneNumber()
       {
           return phoneNumber;
       }
   
       // setter phone number
       public void setPhoneNumber(String phoneNumber){
           this.phoneNumber = phoneNumber;
       }

       //getter email
       public String getEmail()
       {
           return email;
       }
   
       // setter email
       public void setEmail(String email){
           this.email = email;
       }

        //getter password
        public String getPassword()
        {
            return password;
        }

        //setter password
        public void setPassword(String password){

                this.password = password;

        }

        //getter profile pic
     public String getProfPic()
     {
         return profPic;
     }
 
     // setter profile pic
     public void setProfPic(String profPic){
         this.profPic = profPic;
     }
 

    
}
