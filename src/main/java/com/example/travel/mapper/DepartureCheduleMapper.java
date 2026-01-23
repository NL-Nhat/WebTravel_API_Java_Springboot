package com.example.travel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.travel.dto.response.InfoBookingResponseDTO;
import com.example.travel.entity.DepartureCheduleEntity;

@Mapper(componentModel = "spring")
public interface DepartureCheduleMapper {

    //Tự động map qua InfoResponseDTO từ DepartureCheduleEntity
    
    @Mapping(source = "tour.tourName", target = "tourName")
    @Mapping(source = "tour.image", target = "image")
    @Mapping(source = "tour.destination.city", target = "city")
    @Mapping(source = "d.id", target = "idDepartureChedule")
    InfoBookingResponseDTO toInfoResponseDTO(DepartureCheduleEntity d);
}
