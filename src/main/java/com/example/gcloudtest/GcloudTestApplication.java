package com.example.gcloudtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GcloudTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcloudTestApplication.class, args);
    }

}

@RestController
@Transactional
class addBook {
//
//    final BookRepository bookRepository;
//
//    public addBook(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    @RequestMapping
    public String addBookToDb(){
//        Book book = new Book();
//        book.setId(100L);
//        book.setName("goodName");
//        bookRepository.saveAndFlush(book);
        return "Hello world!";
    }
}




