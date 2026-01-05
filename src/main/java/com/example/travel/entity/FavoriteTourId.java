package com.example.travel.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable // dùng để tạo khóa chính khi có hai hay nhiều khóa ngoại tạo thành khóa chính mà không có khóa chính riêng
//      Phải tạo một class chứa các khóa ngoại và dùng nó làm ID
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteTourId implements Serializable{

    @Column(name = "maNguoiDung")
    private Integer userId;

    @Column(name = "maTour")
    private Integer tourId;
}
