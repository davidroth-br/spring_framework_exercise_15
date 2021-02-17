package com.montrealcollege.exercise15.service;

import com.montrealcollege.exercise15.dao.CountriesDAO;
import com.montrealcollege.exercise15.model.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountriesService {

    @Autowired
    private CountriesDAO countriesDAO;

    public List<Countries> getCountries() {
        return countriesDAO.getAllCountries();
    }
}
