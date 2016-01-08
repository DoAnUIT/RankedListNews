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
public class LastTimeUpdateDTO {
    private Timestamp lasttime = null;
    public void setLastTime (Timestamp a)
    {
        lasttime =a;
    }
    public Timestamp getLastTime(){
        return lasttime;
    }
}
