package com.toricor.demo;

import com.toricor.demo.domain.Customer;
import com.toricor.demo.repository.CustomerRepository;
import com.toricor.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class App{

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
