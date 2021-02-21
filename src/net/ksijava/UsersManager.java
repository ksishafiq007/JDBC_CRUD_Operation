package net.ksijava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersManager {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/sampledb";
		String dbUsername = "root";
		String dbPassword = "mysql";

//		String fullname = "Dipali Dipa";
//		String email = "dipali77@gmail.com";
//		String password = "dip786777";
		String username = "dipali";

		try {
			Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
			// For connection check
//			if (connection != null) {
//			System.out.println("Connected to the database");
//		}

			// For hard code data insert into database
//			String sql = "INSERT INTO users(username,email,fullname,password)"
//					+ "VALUES('ksi','ksishafiq007@gmail.com','Shafiqul Islam','dipksi777')";
			// Statement statement = connection.createStatement();
			// int rows = statement.executeUpdate(sql);

			// For dynamic data insert into database
//			String sql = "INSERT INTO users(username,email,fullname,password)" + "VALUES(?,?,?,?)";
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.setString(1, username);
//			statement.setString(2, email);
//			statement.setString(3, fullname);
//			statement.setString(4, password);
//			int rows = statement.executeUpdate();
//			if (rows > 0) {
//				System.out.println("A new user has been succesfully");
//			}

			// Data query from database
//			String sql = "SELECT * FROM users";
//			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery(sql);
//
//			while (resultSet.next()) {
//				int userId = resultSet.getInt("user_id");
//				String userName = resultSet.getString("username");
//				String fullName = resultSet.getString("fullname");
//				String email = resultSet.getString("email");
//				String password = resultSet.getString("password");
//				System.out.println(userId + ":" + userName + ", " + fullName + ", " + email + ", " + password);
//			}

			// Users information update from hard code
//			String sql = "UPDATE users SET password='dip77777' WHERE username='dipali'";
//			Statement statement = connection.createStatement();
//			int rows = statement.executeUpdate(sql);			
//			if (rows > 0) {
//				System.out.println("The user's information has been updated.");
//			}

			// For dynamic data update into database
//			String sql = "UPDATE users SET password=?, fullname=?, email=? WHERE username=?";
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.setString(1, password);
//			statement.setString(2, fullname);
//			statement.setString(3, email);
//			statement.setString(4, username);
//			int rows = statement.executeUpdate();
//			if (rows > 0) {
//				System.out.println("The user's information has been updated.");
//			}
			
			// For dynamic data delete from database
			String sql="DELETE FROM users WHERE username=?";
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setString(1, username);
			int rows=statement.executeUpdate();
			if (rows > 0) {
				System.out.println("The user's information has been deleted.");
			}
			
			connection.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
