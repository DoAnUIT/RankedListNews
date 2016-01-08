/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import DataAccessLayer.LastTimeUpdateDAO;
import DataAccessLayer.NewsDAO;
import java.sql.Timestamp;

/**
 *
 * @author Minh Nhat
 */
public class LastTimeUpdateBUS {
    private String username = null;
    private String password = null;
    private LastTimeUpdateDAO lasttime = null;
    public LastTimeUpdateBUS(){
    }
    
    public LastTimeUpdateBUS(String username, String password){
        this.username = username;
        this.password = password;
        lasttime = new LastTimeUpdateDAO(username, password);
    }
         public Timestamp getLastTimeUpdate(){
             return lasttime.getLastTimeUpdate();
         }
}
