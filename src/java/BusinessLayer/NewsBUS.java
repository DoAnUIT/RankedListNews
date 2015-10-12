/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

/**
 *
 * @author Minh Nhat
 */
import DTO.*;
import DataAccessLayer.*;
import java.util.*;
public class NewsBUS {
    private String username = null;
    private String password = null;
    private NewsDAO categories = null;
    public NewsBUS(){
    }
    
    public NewsBUS(String username, String password){
        this.username = username;
        this.password = password;
        categories = new NewsDAO(username, password);
    }
    
    public List<NewsDTO> getNews(int offset, int limit){
        return categories.getNews(offset, limit);
    }
}
