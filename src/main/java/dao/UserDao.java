package main.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import main.java.model.User;
import main.java.util.DbUtil;
import main.java.model.MD5;

/*
 Klasa umożliwiająca operacje na danych zawartych w tabeli Users
 
 Created by Lemur z o.o.
 */
// połączenie z bazą danych
public class UserDao {

	private Connection connection;

	public UserDao() {
		connection = DbUtil.getConnection();
	}
/*
 wyświetlenie jednego użytkownika na podstawie loginu
 */
	public User getUserById(String login, String password){
		User user = new User();
		MD5 md5= new MD5();
		try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("SELECT * FROM users WHERE email=?");
            preparedStatement.setString(1, login);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
				String tmp=rs.getString("password");
				System.out.println(md5.getMD5(password));
				//String tmp=md5.getMD5(password);
				//System.out.println("haslo w md5:"+tmp);
				if (tmp.equals(md5.getMD5(password))){
					user.setUserId(rs.getInt("userid"));
					user.setLogin(rs.getString("email"));
					user.setPassword(rs.getString("password"));
				}
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
/*
 dodanie nowego użytkownika
 */
	public void addUser(User user) {

		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into users(email,password) values (?, ?)");
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
