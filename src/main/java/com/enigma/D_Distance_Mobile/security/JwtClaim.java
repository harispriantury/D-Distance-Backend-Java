package com.enigma.D_Distance_Mobile.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtClaim {
    private String userId;
    private String role;
}
