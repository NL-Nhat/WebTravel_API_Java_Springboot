package com.example.travel.service;

import java.util.List;

import com.example.travel.dto.response.InfoBookingResponseDTO;
import com.example.travel.dto.response.ScheduleResponseDTO;

public interface DepartureCheduleService {

    public List<ScheduleResponseDTO> getAllScheduleOfDepartureChedule(Integer id);

    public InfoBookingResponseDTO getInfoBooking(Integer id);
}
