package com.example.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travel.entity.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Integer>{

    //Kiểm tra mã vé điện tử đã có trong db chưa
    boolean existsByIdTicket(String idTicket);

}
