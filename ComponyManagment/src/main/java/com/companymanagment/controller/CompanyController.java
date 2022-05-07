package com.companymanagment.controller;

import com.companymanagment.entity.Company;
import com.companymanagment.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping()
    public ResponseEntity<String> addCompany(@RequestBody Company company){
        companyService.addCompany(company);
        return ResponseEntity.ok("Company Added Succesfully");
    }

    @PatchMapping()
    public ResponseEntity<String> patchCompany(@RequestBody Company company){
        Company companyFromDB = companyService.findById(company.getId());
//        company
        return ResponseEntity.ok("Company Added Succesfully");
    }

    @GetMapping()
    public ResponseEntity<List<Company>> getAll(){
        List<Company> companies = companyService.findAll();
        return ResponseEntity.ok(companies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getComapny(@PathVariable("id") Long id){
        try{
            Company company = companyService.findById(id);
            return ResponseEntity.ok(company);
        }
        catch (NoSuchElementException ex){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }
}
