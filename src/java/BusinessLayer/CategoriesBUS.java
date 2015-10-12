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
public class CategoriesBUS {
    private String username = null;
    private String password = null;
    private CategoriesDAO categories = null;
    public CategoriesBUS(){
    }
    
    public CategoriesBUS(String username, String password){
        this.username = username;
        this.password = password;
        categories = new CategoriesDAO(username, password);
    }
    
    public List<CategoriesDTO> getCategories(){
        return categories.getCategories();
    }
}
