package com.woodspoon.analytics.controller;

import com.woodspoon.analytics.model.BookAnalytics;
import com.woodspoon.analytics.service.BookAnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
public class BookAnalyticsController {

    @Autowired
    private BookAnalyticsService bookAnalyticsService;

    @GetMapping("/book_analytics/{isbn}")
    @ResponseBody
    public Optional<BookAnalytics> getBookAnalyticsByIsbn(@PathVariable String isbn) {
        return bookAnalyticsService.getBookAnalyticsByIsbn(isbn);
    }

    @GetMapping("/book_analytics/add_analytics/{isbn}")
    @CrossOrigin(origins = "http://localhost:4040")
    @ResponseBody
    public void incrementStats(@PathVariable String isbn) {
        this.bookAnalyticsService.incrementStats(isbn);
    }
}
