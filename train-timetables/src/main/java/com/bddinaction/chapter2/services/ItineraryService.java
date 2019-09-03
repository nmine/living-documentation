package com.bddinaction.chapter2.services;

import org.joda.time.LocalTime;

import java.util.List;

public interface ItineraryService {
    List<LocalTime> findNextDepartures(String departure, String destination, LocalTime startTime);
}
