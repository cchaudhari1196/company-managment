package com.companymanagment.services;

import com.companymanagment.entity.Branch;
import com.companymanagment.entity.Company;
import com.companymanagment.persitence.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public void addCompany(Company company){

        companyRepository.save(company);
        for(Branch branch : company.getBranches()){
            branch.setCompany(company);
        }
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company findById(Long id){
        return companyRepository.findById(id).get();
    }
}
