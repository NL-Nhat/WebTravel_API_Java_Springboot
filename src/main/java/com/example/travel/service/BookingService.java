package com.example.travel.service;

import com.example.travel.dto.request.BookingRequestDTO;
import com.example.travel.dto.response.BookingResponseDTO;

public interface BookingService {

    public BookingResponseDTO bookTour(BookingRequestDTO b);

}
