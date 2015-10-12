/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

/**
 *
 * @author Minh Nhat
 */
import DTO.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CategoriesDAO extends DataSource{
    private CallableStatement call = null;
    public CategoriesDAO(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public List<CategoriesDTO> getCategories(){
        List<CategoriesDTO> lcate = new ArrayList<CategoriesDTO>();
        try {
            connection = DataSource.getInstance().getConnection();
            while(connection == null)
                connection = DataSource.getInstance().getConnection();
            
            call = connection.prepareCall("call getCategories()");
            ResultSet rs = call.executeQuery();
            CategoriesDTO temptCate = null;
            while(rs.next()){
                temptCate = new CategoriesDTO();
                temptCate.setID(rs.getInt(1));
                temptCate.setName(rs.getString(2));
                
                lcate.add(temptCate);
            }
            
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
        return lcate;
    }
}
