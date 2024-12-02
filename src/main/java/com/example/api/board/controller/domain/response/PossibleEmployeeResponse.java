package com.example.api.board.controller.domain.response;

import java.time.LocalDateTime;

public record PossibleEmployeeResponse(
        Long accountId,
        String name,
        Integer age,
        String sex,
        LocalDateTime possibleStartDateTime,
        LocalDateTime possibleEndDateTime
) {
}