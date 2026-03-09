package com.ust.bs.book.controller;

import java.util.List;
import java.util.Collections;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ust.bs.book.dto.Book;
import com.ust.bs.book.dto.Info;
import com.ust.bs.book.dto.Rating;

@RestController
@RequestMapping("/info")
public class InfoServiceController {

    RestTemplate rest = new RestTemplate();

    @RequestMapping("/list/{bookid}")
    public List<Book> getAllData(@PathVariable("bookid") int id){

        Rating rating = rest.getForObject(
                "http://localhost:9092/rating/list", Rating.class);

        Info info = rest.getForObject(
                "http://localhost:9093/cato/list", Info.class);

        return Collections.singletonList(
                new Book(id, info.getBookName(), rating.getRating())
        );
    }
}