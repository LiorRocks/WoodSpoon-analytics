package com.woodspoon.analytics.service;

import com.woodspoon.analytics.model.BookAnalytics;
import com.woodspoon.analytics.repository.BookAnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookAnalyticsService {

    @Autowired
    private BookAnalyticsRepository bookAnalyticsRepository;

    public Optional<BookAnalytics> getBookAnalyticsByIsbn(String isbn) {
        return BookAnalyticsRepository.bookAnalyticsRepo.stream().filter(bookAnalytics -> bookAnalytics.getBookIsbn().equals(isbn)).findFirst();
    }

    public void incrementStats(String isbn) {
        Optional<BookAnalytics> bookAnalytics = this.getBookAnalyticsByIsbn(isbn);
        if(bookAnalytics.isPresent()) {
            bookAnalytics.get().incrementCount();
        } else {
            BookAnalyticsRepository.bookAnalyticsRepo.add(new BookAnalytics(isbn, 1));
        }
    }
}
