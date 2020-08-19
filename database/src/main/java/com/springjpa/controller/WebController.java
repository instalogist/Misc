package com.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.model.Costemer;
import com.springjpa.repo.CostemerRepository;

@RestController
public class WebController{
    @Autowired
    CostemerRepository repository;

    @RequestMapping("/save")
    public String process(){
        repository.save(new Costemer("Pramod","Prakash"));
        repository.save(new Costemer("Sandeep","Barange"));
        repository.save(new Costemer("Shubham","Saurav"));
        repository.save(new Costemer("Naal","Oli"));
        repository.save(new Costemer("Swaroop","Gupta"));
        return "Done";
    }

    @RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";

        for (Costemer cust : repository.findAll())
        {
            result += "<div>" + cust.toString() + "</div>";
        }
        return result + "</html>";
    }

    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id)
    {
        String result ="";
        result = repository.findById(id).toString();
        return  result;
    }

    @RequestMapping("/findbylastname")
    public String fetchDaraBtLastName(@RequestParam("lastname") String lastname)
    {
        String result = "<html>";

        for (Costemer cust: repository.findByLastName(lastname))
        {
            result += "<div>" +cust.toString() + "</div>";

        }
        return result + "</html>";
    }
}
