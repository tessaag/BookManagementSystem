package com.example.bookStoreManagement.booksRepository;

import com.example.bookStoreManagement.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
