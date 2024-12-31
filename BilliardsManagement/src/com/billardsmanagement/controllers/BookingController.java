package com.billardsmanagement.controllers;

import com.billardsmanagement.dao.BookingDAO;
import com.billardsmanagement.models.Booking;

public class BookingController {
    private final BookingDAO bookingDAO = new BookingDAO();

    public void createBooking(Booking booking) {
        bookingDAO.saveBooking(booking);
    }
}