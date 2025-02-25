package com.example.bookStoreManagement.Controller;

import com.example.bookStoreManagement.Model.Books;
import com.example.bookStoreManagement.booksRepository.BooksRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookStoreController {
    @Autowired
    private BooksRepository booksRepository;

    @Transactional
    @PostMapping("/booksEntry")
    public ResponseEntity<Map<String, String>> bookSEntry(@RequestBody Books books) {
        Books bookObj = booksRepository.save(books);

        Map<String, String> response = new HashMap<>();
        response.put("Status", "Book Added");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/Viewbook")
    public ResponseEntity<List<Books>> bookList() {
        List<Books> book = booksRepository.findAll();

        return ResponseEntity.ok(book);
    }


}
