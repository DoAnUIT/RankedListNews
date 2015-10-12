/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Minh Nhat
 */
public class CategoriesDTO {
    private int id = 0;
    private String name = null;
    
    public CategoriesDTO(){
        
    }
    public CategoriesDTO(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    // id
    public int getID(){
        return this.id;
    }
    
    public void setID(int a){
        this.id = a;
    }
    
    // name
    public String getName(){
        return this.name;                
    }
    
    public void setName(String a){
        this.name = a;
    }
}
