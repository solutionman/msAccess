package com.msaccess.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AccessApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(AccessApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		template.execute("SELECT * FROM tblArrivalsProducts ");
		template.execute("SELECT tblArrivalsProducts.ID, tblArrivalsProducts.Ordinal, tblArrivalsProducts.ProductID FROM tblArrivalsProducts ");

	}
}
