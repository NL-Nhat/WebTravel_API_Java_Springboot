package com.example.travel.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.travel.dto.response.InfoBookingResponseDTO;
import com.example.travel.dto.response.ScheduleResponseDTO;
import com.example.travel.entity.DepartureCheduleEntity;
import com.example.travel.mapper.DepartureCheduleMapper;
import com.example.travel.mapper.ScheduleMapper;
import com.example.travel.repository.DepartureCheduleRepository;
import com.example.travel.service.DepartureCheduleService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartureCheduleServiceImpl implements DepartureCheduleService{

    private final DepartureCheduleRepository departureCheduleRepository;
    private final ScheduleMapper scheduleMapper;
    private final DepartureCheduleMapper departureCheduleMapper;

    @Override
    public List<ScheduleResponseDTO> getAllScheduleOfDepartureChedule(Integer id) {
        DepartureCheduleEntity d = departureCheduleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Không tìm thấy lịch khởi hành với id này"));

        return d.getSchedules().stream().map(scheduleMapper::toScheduleResponseDTO).collect(Collectors.toList());
    }

    @Override
    public InfoBookingResponseDTO getInfoBooking(Integer id) {
        DepartureCheduleEntity d = departureCheduleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Không tìm thấy lịch khởi hành với id này"));

        InfoBookingResponseDTO i = departureCheduleMapper.toInfoResponseDTO(d);

        return i;
    }
}
