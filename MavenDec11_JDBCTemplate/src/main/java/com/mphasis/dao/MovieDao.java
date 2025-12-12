package com.mphasis.dao;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mphasis.beans.Movie;
import com.mphasis.config.MovieRowMapper;

@Repository
public class MovieDao {
	
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	NamedParameterJdbcTemplate namedJdbc;
	
	public List<Movie> findAll(){
		String query="select * from movie";
		return jdbc.query(query, new MovieRowMapper());
	}
	
	public void save(Movie m) {
		String query="insert into movie(mid,mname,lang,rating) values(?,?,?,?)";
		jdbc.update(query,m.getMid(),m.getMname(),m.getLang(),m.getRating());
		System.out.println("Row Inserted Successfully");
	}
	
	public Movie findById(int id) {
		String query="select * from movie where mid=?";
		return jdbc.queryForObject(query,new MovieRowMapper(),id);
	}
	
	public void update(Movie m) {
		String query="update movie set rating=:r where mid=:id";
		namedJdbc.update(query, Map.of("r",m.getRating(),"id",m.getMid()));
		System.out.println("Row Updated");
		Movie m1=findById(m.getMid());
		System.out.println(m1);
	}
	
	public void delete(Movie m) {
		String query="delete from movie where mid=:id";
		namedJdbc.update(query, Map.of("id",m.getMid()));
		System.out.println("Deleted successfully");
	}
	
}
