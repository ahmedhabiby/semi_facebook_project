
package com.mycompany.mavenproject1;

import java.util.List;


public class Post extends Data {
    private User user;
    private String video;
    private List<Like> likes;
    private List<Comment> comments;

   

    public void setUser(User user) {
        this.user = user;
    }

   

    public void setVideo(String video) {
        this.video = video;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


    public User getUser() {
        return user;
    }

    

    public String getVideo() {
        return video;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }
    
}
