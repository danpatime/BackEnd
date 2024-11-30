package com.example.api.business.dto;

import java.util.List;

public record BusinessDetailsResponse(
        String businessName,
        Long businessId,
        BusinessOwner businessOwner,
        String location,
        List<CategoryInfo> categoryInfos
) {
}
