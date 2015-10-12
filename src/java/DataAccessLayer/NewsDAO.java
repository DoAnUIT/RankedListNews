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
public class NewsDAO extends DataSource{
    private CallableStatement call = null;
    public NewsDAO(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public List<NewsDTO> getNews(int offset, int limit){
        List<NewsDTO> lcate = new ArrayList<NewsDTO>();
        try {
            connection = DataSource.getInstance().getConnection();
            while(connection == null)
                connection = DataSource.getInstance().getConnection();
            
            //id,  title,   contenturl,    categoryid ,   sourceid
    // description , imageurl ,    newstime , rating
            call = connection.prepareCall("call getNews(?,?)");
            call.setInt(1, offset);
            call.setInt(2, limit);
            ResultSet rs = call.executeQuery();
            NewsDTO temptCate = null;
            while(rs.next()){
                temptCate = new NewsDTO();
                temptCate.setID(rs.getInt(1));
                temptCate.setTitle(rs.getString(2));
                temptCate.setContentUrl(rs.getString(3));
                temptCate.setCategoryID(rs.getInt(4));
                temptCate.setMagazineID(rs.getInt(5));
                
                temptCate.setDescription(rs.getString(6));
                temptCate.setImageUrl(rs.getString(7));
                temptCate.setNewsTime(rs.getTimestamp(8));
                temptCate.setRating(rs.getInt(9));
                
                lcate.add(temptCate);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        finally{
            if(connection != null)
                try {
                    connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(call != null)
                try {
                    call.close();
            } catch (SQLException ex) {
                Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return lcate;
    }
}
