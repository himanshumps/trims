package citi.com.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    @Autowired
    JdbcTemplate template;    
    /*Adding an item into database table*/
    public int saveData(final String refeNum,final String message ) {
		System.out.println("ReferenceNUm in utils:: "+refeNum);
		System.out.println("message in utils:: "+message);
		String sql = "INSERT INTO reprocessdata (refnum,message) values (?,?)";		
		System.out.println("jdbcTemplate  utils:: "+template);
		int insertValue = template.update(sql, refeNum,message);
		return insertValue;
	}
}
