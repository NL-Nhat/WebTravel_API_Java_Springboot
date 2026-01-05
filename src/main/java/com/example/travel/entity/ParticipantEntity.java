package com.example.travel.entity;

import java.time.LocalDate;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@Table(name = "KhachHangThamGia")
public class ParticipantEntity {

    @Id
    @Column(name = "maKhachHang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maDatTour")
    private BookingEntity booking;

    @Column(name = "hoTen", nullable = false)
    private String fullName;

    @Column(name = "soDienThoai", nullable = false)
    private String phoneNumber;

    @Column(name = "ngaySinh")
    private LocalDate doB;

    @Column(name = "gioiTinh", columnDefinition = "TINYINT DEFAULT 1")
    private Integer gender;

    @Column(name = "diaChi")
    private String address;

}
