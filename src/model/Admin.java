package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import dao.DatabaseUtils;

/**
*
* @author Yuzana Zaw Zaw
*/
public class Admin {
	DatabaseUtils conn = new DatabaseUtils();
    PreparedStatement pst = null;
    ResultSet rst = null;
   public void changePassword(String username,String newPassword)
    {
        int flag;
        
         try{
        conn.OpenConnection();
        String sql = "UPDATE Admin SET password = '"+ newPassword +"' where user_name = '"+username+ "'";
       
        flag = conn.InsertUpdateDelete(sql);
           if(flag == 1){
               JOptionPane.showMessageDialog(null, "YOUR PASSWORD HAS BEEN CHANGED  ");
           }
           else{
                JOptionPane.showMessageDialog(null, "YOUR PASSWORD COULDn't BE CHANGED" );
           }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "UpdatePassword Query Failed");
        }
        
    }
    public boolean chkAdminPass(String id, String pass){
        boolean flag = false;
        
        try{
            conn.OpenConnection();
            String sql = "Select user_name,password from Admin where user_name = '" + id + "' and password = '" + pass + "'";
            rst= conn.GetData(sql);
            if(rst.next()){
                flag= true;
                              
            }
            else 
                flag=  false;
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nInavlid Username or Password");
        }
       return flag; 
    }
}
