/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mora.entities;

import java.util.Date;
import java.util.List;




/**
 *
 * @author José Alvarez
 */
public class Post {

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
   
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
private String description;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
private User user;
private String name;
private Date date;
private int like = 0;
private int dislike = 0;
private String image;

    
    public List<UserComments> getUserComment() {
        return userComment;
    }

    public void setUserComment(List<UserComments> userComment) {
        this.userComment = userComment;
    }
private List<UserComments> userComment;

    
}
