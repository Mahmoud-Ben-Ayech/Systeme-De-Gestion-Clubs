package com.gestionClubs.serviceImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.gestionClubs.dbutil.DBUtil;
import com.gestionClubs.service.ResponsableClubService;

@Service
public class ResponsableClubServiceImpl implements ResponsableClubService {

	
	Connection connection;
	int flag=0;
	public ResponsableClubServiceImpl() throws SQLException {  
		connection=DBUtil.getConnection();
	}
	@Override
	public int loginValidation(String email, String password) {
		try {
			PreparedStatement statement=connection.prepareStatement("Select * from responsableclub where email = '"+email+"'");
            ResultSet rs=statement.executeQuery();		
            while(rs.next()) {
            	if(rs.getString(4).equals(email)&& rs.getString(5).equals(password)) {
            		flag=1;
            	}
            	else {
            		System.out.println("Invalid password / email");
            		flag=0;
            	}
            }
            
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return flag;
	}
}
