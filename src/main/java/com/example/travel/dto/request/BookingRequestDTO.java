package com.example.travel.dto.request;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor //Có @Builder thì phải thêm @NoArgsConstructor để sinh constructor rỗng vì có @Builder nên không tự sinh được
@AllArgsConstructor
public class BookingRequestDTO {

    private Integer idUser;
    private Integer idDepartureChedule;
    private Integer adultNumber;
    private Integer childNumber;
    private String nameGuest;
    private String phoneNumber;
    private String email;
    private Integer gender;
    private LocalDate doB;
    private String note;
}
