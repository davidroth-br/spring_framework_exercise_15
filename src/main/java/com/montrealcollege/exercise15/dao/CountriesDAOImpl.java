package com.montrealcollege.exercise15.dao;

import com.montrealcollege.exercise15.model.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class CountriesDAOImpl implements CountriesDAO{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);

    }

    @Override
    public List<Countries> getAllCountries() {
        String sql = "Select * from Countries";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Countries.class));
    }
}
