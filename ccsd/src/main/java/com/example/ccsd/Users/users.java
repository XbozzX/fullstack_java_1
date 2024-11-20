package com.example.ccsd.Users;


public class users {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private String profPic;

    public users(String firstName, String  lastName, String phoneNumber, String email, String password, String profPic){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.profPic = profPic;
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
   
       // setter email (if email exist, then this.email, if not ("invalid email"))
       public void setEmail(String email){
           this.email = email;
       }

        //getter password
        public String getPassword()
        {
            return password;
        }

        //setter password normal
        public void setPassword(String password){


                this.password = password;
        

        }
    
        // setter password registration
        public void setPasswordReg(String password, String password2){

            if(password2.equals(password) ){
                this.password = password;
            }
            else{

            }


        }

         // setter password sign in with database
         public void setPasswordSignIn(String password){

            // if(password == )

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
