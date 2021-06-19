package com.proje.connection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;	

public class Uygulama1 {

	public static void main(String[] args) {

		Logger logger = LogManager.getLogger();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			logger.warn("Mysql Driver Bulunamadı : " + e);
			return;
		}

		Connection connection = null;

		try {
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "213165");
			logger.info("Mysql Baglandik.");
		} catch (SQLException e) {
			logger.warn("Mysql baglanirken hata meydana geldi."+e);
		} finally {
			if (connection != null) {
				try {
					connection.close();
					logger.info("Baglati basarili bir sekilde kapatildi.");
				} catch (SQLException e) {
					logger.warn("Baglati kapanirken hata meydana geldi.");

				}

			}
		}

	}

}
