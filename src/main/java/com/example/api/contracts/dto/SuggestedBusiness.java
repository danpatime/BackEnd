package com.example.api.contracts.dto;

import java.time.LocalDateTime;

public record SuggestedBusiness(
        Long businessId,
        LocalDateTime suggestStartDateTime,
        LocalDateTime suggestEndDateTime,
        Integer suggestPartTimePayment,
        Boolean suggestChecked,
        Boolean suggestAccepted

) {
}