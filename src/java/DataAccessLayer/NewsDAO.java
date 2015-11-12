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
    
    public List<NewsDTO> getNews(int offset, int limit, int categoryid){
        List<NewsDTO> lcate = new ArrayList<NewsDTO>();
        try {
            connection = DataSource.getInstance().getConnection();
            while(connection == null)
                connection = DataSource.getInstance().getConnection();
            
            //id,  title,   contenturl,    categoryid ,   sourceid
    // description , imageurl ,    newstime , rating
            call = connection.prepareCall("call getNews(?,?,?)");
            call.setInt(1, offset);
            call.setInt(2, limit);
            call.setInt(3, categoryid);
            ResultSet rs = call.executeQuery();
            NewsDTO temptCate = null;
            while(rs.next()){
                temptCate = new NewsDTO();
                temptCate.setIDTableNews(rs.getInt(1));
                temptCate.setID(rs.getInt(2));
                temptCate.setTitle(rs.getString(3));
                temptCate.setContentUrl(rs.getString(4));
                temptCate.setCategoryID(rs.getInt(5));
                temptCate.setMagazineID(rs.getInt(6));
                
                temptCate.setDescription(rs.getString(7));
                temptCate.setImageUrl(rs.getString(8));
                temptCate.setNewsTime(rs.getTimestamp(9));
                temptCate.setRating(rs.getInt(10));
                
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
