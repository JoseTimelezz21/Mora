/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mora.entities;


/**
 *
 * @author José Alvarez
 */
public class UserComments {

   

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    private String comment;
    private int like = 0;
    private int dislike = 0;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    private User user;
}
