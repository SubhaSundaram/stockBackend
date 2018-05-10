package com.example.stockdemo.controller;

import java.util.List;

import com.example.stockdemo.UserDetails;
import com.example.stockdemo.service.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/stock")
public class StockController{
    @Autowired
    private StockService stockService;

    @RequestMapping(method=RequestMethod.GET)
    public List<UserDetails> getAllUsers(){
        return stockService.getAll();
    }
  
    @RequestMapping(value="/{id}",method=RequestMethod.POST)
    public UserDetails find(@PathVariable int id){
        return stockService.find(id);
    }

    @RequestMapping(method=RequestMethod.POST)
    public UserDetails save(@RequestBody UserDetails userdetails){
        return stockService.save(userdetails);
    }
 
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable int id){
      stockService.delete(id);
    }

}