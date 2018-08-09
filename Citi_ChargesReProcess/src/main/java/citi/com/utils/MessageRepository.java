package citi.com.utils;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import citi.com.domain.MessageData;

import java.util.List;

@Repository
public class MessageRepository {

    @Autowired
    JdbcTemplate template;    
    /*delete an message data  from database*/
    public int deleteItem(String refnum){
        String query = "DELETE FROM reprocessdata WHERE refnum =?";
        return template.update(query,refnum);
    }  
    /*Adding an item into database table*/
    public int addItem(int id,String name,String category){
        String query = "INSERT INTO ITEM VALUES(?,?,?)";
        return template.update(query,id,name,category);
    }
    /*Getting all messageData from table*/
    public List<MessageData> getAllItems(){
        List<MessageData> items = template.query("select refnum,message from reprocessdata",(result,rowNum)->new MessageData(
                result.getString("refnum"),result.getString("message")));
        return items;
    }
}
