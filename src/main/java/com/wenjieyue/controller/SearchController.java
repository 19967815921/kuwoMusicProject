package com.wenjieyue.controller;

import com.wenjieyue.service.impl.SearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private SearchServiceImpl searchService;

    @RequestMapping("/search")
    public List<Object> getAllMessage(@RequestParam("message") String message){
        return searchService.getAllMessage(message);
    }
}
