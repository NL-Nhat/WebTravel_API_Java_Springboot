package com.example.travel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.travel.dto.response.InfoBookingResponseDTO;
import com.example.travel.service.DepartureCheduleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/departureChedules")
public class DepartureCheduleController {

    private final DepartureCheduleService departureCheduleService;

    @GetMapping("/{id}/info-booking")
    public ResponseEntity<InfoBookingResponseDTO> getInfoBooking(@PathVariable(value = "id") Integer id) {
        return ResponseEntity.ok(departureCheduleService.getInfoBooking(id));
    }

}
