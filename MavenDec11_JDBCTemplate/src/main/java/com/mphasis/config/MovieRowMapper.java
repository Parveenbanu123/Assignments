package com.mphasis.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mphasis.beans.Movie;

public class MovieRowMapper implements RowMapper<Movie>{

	@Override
	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Movie m=new Movie();
		m.setMid(rs.getInt("mid"));
		m.setMname(rs.getString("mname"));
		m.setLang(rs.getString("lang"));
		m.setRating(rs.getDouble("rating"));
		return m;
	}
	
}
