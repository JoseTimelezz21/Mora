/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.mora.entities.post;
import mx.itson.mora.entities.UserComments;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.mora.entities.Category;
import mx.itson.mora.entities.Post;
import mx.itson.mora.entities.User;

/**
 *
 * @author José Alvarez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        * This code part creates three user objects with different properties of name, email, password and role.
        */
        User user1 = new User();
        user1.setName("LUX Lifestyle");
        user1.setEmail("luxury.lifestyle21@gmail.com");
        user1.setPassword("kiwichi21");
        user1.setRol("Admin");
        User user2 = new User();
        user2.setName("stuart12");
        user2.setEmail("suart12@gmail.com");
        user2.setPassword("destroy2");
        user2.setRol("User");
        User user3 = new User();
        user3.setName("Christy");
        user3.setEmail("Christy11@gmail.com");
        user3.setPassword("136563");
        user3.setRol("User");
        
        /*
        *This is only used to get the date.
        */
        Date date = new Date();
        System.out.println(date);
       
        /*
        *This is an object of the category class, called category1.
        */    
        Category category1 = new Category();
        category1.setName("Cars");
        
        /*
        *In this part of the code you create three objects of the "UserComments" class and initialize them with comments,
        *like and dislike counts, and then assign a user to each of them. Additionally,
        *it creates a list called "answers" that contains these "UserComments" objects.
        */
        
       UserComments comments = new UserComments();
       comments.setComment("HOLY");
       comments.setLike(1267);
       comments.setDislike(12);
       comments.setUser(user1);       
       
       UserComments comments1 = new UserComments();
       comments1.setComment("BEAUTIFUL CAR MEEEEN");
       comments1.setLike(345);
       comments1.setDislike(2); 
       comments1.setUser(user2);
       
       UserComments comments2 = new UserComments();
       comments2.setComment("I really love it");
       comments2.setLike(234);
       comments2.setDislike(1); 
       comments2.setUser(user3);
       
       List<UserComments> answers = new ArrayList();
       answers.add(comments);
       answers.add(comments1);
       answers.add(comments2);
   
       
       /*
       *In this part of the code, a "Post" type object is created that represents a post on a platform, 
       with information about its title, author, description, image, date, and like and dislike counts. 
       User comments are also associated with this post.
       */
        
        
        
        Post post1 = new Post();
        post1.setName("LUX Lifestyle CARS");
        post1.setUser(user1);
        post1.setDescription("Audi RS7");
        post1.setImage("https://pbs.twimg.com/media/F8ayAIyWcAA0vww?format=jpg&name=medium");
        post1.setDate(date);
        post1.setLike(3898);
        post1.setDislike(250); 
        post1.setUserComment(answers);
        
        
       
       
        System.out.println("------- X -------");
        
        System.out.println(post1.getName());
        System.out.println("---" + category1.getName() + "---");
        System.out.println(post1.getUser().getName());
        System.out.println("---" +post1.getDescription() + "---" + "\n" + post1.getDate());
        System.out.println(post1.getImage());
        System.out.println("Likes: " + post1.getLike() + " " + "Dislikes: " +post1.getDislike());   
        
        /*
        *A for-each loop runs through the user comments associated with a "post1" object and displays information about each comment in the console.
        */
        for(UserComments comment : post1.getUserComment()){
            System.out.println(comment.getUser().getName()+ ": "+ comment.getComment()+ " ---" + " Likes: "+comment.getLike()+ " Dislikes: "+comment.getDislike());
        }
    }
}

