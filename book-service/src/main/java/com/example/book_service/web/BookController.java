package com.example.book_service.web;

import com.example.book_service.domain.Book;
import com.example.book_service.service.BookService;
import com.example.book_service.service.BorrowResult; // <-- importer BorrowResult
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> all() {
        return service.all();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book create(@RequestBody Book b) {
        return service.create(b);
    }

    @PostMapping("/{id}/borrow")
    public BorrowResult borrow(@PathVariable long id) throws Throwable {
        return service.borrow(id);
    }
}
