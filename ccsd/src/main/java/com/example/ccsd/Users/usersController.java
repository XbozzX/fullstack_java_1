//usersController.java

package com.example.ccsd.Users;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class usersController {

    @Autowired
    private usersService usersService;

    @GetMapping
    public List<users> getAllUsers() {
        return usersService.getAllUsers();
    }

    // get user by id 
    @GetMapping("/{id}")
    public ResponseEntity<users> getUserById(@PathVariable String UserId) {
        return usersService.getUserById(UserId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // @PostMapping
    // public users addUser(@RequestBody users users) {
    //     return usersService.addUser(users);
  
    // }

    //prev addUser
    // @PostMapping
    // public users addUser(@RequestBody users users, @RequestParam("file") MultipartFile profPic) {
    //     return usersService.addUser(users);
  
    // }
// addUser v2
    ////////////////////////////////////////////
    
 @PostMapping
    public ResponseEntity<Map<String, Object>> addUser(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("phoneNumber") String phoneNumber,
            @RequestParam("username") String username,
            @RequestParam("dob") String dob,
            @RequestParam("address") String address,
            @RequestParam("role") String role,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("profPic") MultipartFile profPic) throws IOException {

        // Convert the image to a byte array
        byte[] imageBytes = profPic.getBytes();  // Get image data

        // Create a new users instance
        users users = new users();
        users.setFirstName(firstName);
        users.setLastName(lastName);
        users.setPhoneNumber(phoneNumber);
        users.setUsername(username);
        users.setDob(dob);
        users.setAddress(address);
        users.setRole(role);
        users.setEmail(email);
        users.setPassword(password);
        users.setProfPic(imageBytes); //store image as byte array


        // Save the users in MongoDB
        users savedusers = usersService.addUser(users);

        // Return a response
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("users", savedusers);
        
        return ResponseEntity.ok(response);
    }



    ///////////////////////////////////////

//     @PostMapping("/{id}/uploadImage")
// public ResponseEntity<String> uploadUserImage(@PathVariable String id,@RequestParam("file") MultipartFile file) {
//     try {
//         // Validate file type
//         if (!file.getContentType().startsWith("image/")) {
//             return ResponseEntity.badRequest().body("File type not supported. Please upload an image.");
//         }

//         // Save the file (in database or file system)
//         String imageUrl = usersService.addUser(users, profPic);
        
//         return ResponseEntity.ok(imageUrl); // Return the file URL or success message
//     } catch (Exception e) {
//         e.printStackTrace();
//         return ResponseEntity.status(500).body("Error uploading the file.");
//     }

    @PutMapping("/{id}")
    public ResponseEntity<users> updateUser(@PathVariable String id, @RequestBody users usersDetails) {
        users updatedusers = usersService.updateUser(id, usersDetails);
        if (updatedusers != null) {
            return ResponseEntity.ok(updatedusers);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String userId) {
        usersService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

    //  @PostMapping("auth/createAd")
    // public Ads createAd(
    //     @RequestParam("adsImages") MultipartFile[] adsImages,
    //     // Add other parameters
    // ) {
    //     String uploadDirectory = "src/main/resources/static/images/ads";
    //     String adsImagesString = "";

    //     for (MultipartFile imageFile : adsImages) {
    //         adsImagesString += usersService.addUser(uploadDirectory, imageFile) + ",";
    //     }

    //     // Save the adsImagesString in your database
    //     // You can also associate it with other data in your Ads object
    // }


    
}
