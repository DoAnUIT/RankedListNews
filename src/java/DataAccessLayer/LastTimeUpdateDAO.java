/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DTO.CategoriesDTO;
import DTO.LastTimeUpdateDTO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Nhat
 */
public class LastTimeUpdateDAO extends DataSource{
    private CallableStatement call = null;
    public LastTimeUpdateDAO(String username, String password){
        this.username = username;
        this.password = password;
    }
     public Timestamp getLastTimeUpdate(){
        
        try {
            connection = DataSource.getInstance().getConnection();
            while(connection == null)
                connection = DataSource.getInstance().getConnection();
            
            call = connection.prepareCall("select * from lasttimeupdate");
            ResultSet rs = call.executeQuery();
            LastTimeUpdateDTO temptCate = null;
            while(rs.next()){
                temptCate = new LastTimeUpdateDTO();
                temptCate.setLastTime(rs.getTimestamp(1));
            }
            
            return temptCate.getLastTime();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        finally{
            if(connection != null)
                try {
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(call != null)
                try {
                    call.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
