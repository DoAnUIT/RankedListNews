/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Timestamp;

/**
 *
 * @author Minh Nhat
 */
public class NewsDTO {

    private int idTableNews = 0;
    private int id = 0;
    private String title = null;
    private String contenturl = null;
    private int categoryid = 0;
    private int magazineid = 0;
    private String description = null;
    private String imageurl = null;
    private Timestamp newstime = null;
    private int rating = 0;

    // idTableNews
    public int getIDTableNews(){
        return this.idTableNews;
    }
    public void setIDTableNews(int a){
        this.idTableNews = a;
    }
    // id
    public int getID() {
        return this.id;
    }
    public void setID(int a) {
        this.id = a;
    }

    //title
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String a){
        this.title = a;
    }
    
    // contenturl
    public String getContentUrl(){
        return this.contenturl;
    }
    public void setContentUrl(String a){
        this.contenturl = a;
    }
    
    // categoryid
    public int getCategoryID(){
        return this.categoryid;
    }
    public void setCategoryID(int a){
        this.categoryid = a;
    }
    
    // sourceid
    public int getMagazineID(){
        return this.magazineid;
    }
    public void setMagazineID(int a){
        this.magazineid = a;
    }
    
    // description
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String a){
        this.description = a;
               
    }
    
    // imageurl
    public String getImageUrl(){
        return this.imageurl;
    }
    public void setImageUrl(String a){
        this.imageurl =a;
    }
    
    // newstime
    public Timestamp getNewsTime(){
        return this.newstime;
    }
    
    public void setNewsTime(Timestamp a){
        this.newstime = a;
    }
    
    // rating
    public int getRating(){
        return this.rating;
    }
    public void setRating(int a){
        this.rating = a;
    }
            
            
}
