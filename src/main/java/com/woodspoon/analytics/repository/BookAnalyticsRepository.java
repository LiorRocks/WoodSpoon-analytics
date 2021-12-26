package com.woodspoon.analytics.repository;

import com.woodspoon.analytics.model.BookAnalytics;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookAnalyticsRepository {

    public static List<BookAnalytics> bookAnalyticsRepo = new ArrayList<>();

    public static void incrementCounter(String isbn) {

    }
}
