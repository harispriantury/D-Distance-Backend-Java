package com.enigma.D_Distance_Mobile.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DistributorResponse {
    private String email;
    private String companyId;
    private String name;
    private String address;
    private String pan;
    private String phoneNumber;
}
