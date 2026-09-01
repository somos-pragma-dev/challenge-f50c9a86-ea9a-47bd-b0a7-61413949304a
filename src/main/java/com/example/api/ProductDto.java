package com.example.api;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

public record ProductDto(
    @NotNull @Size(max = 255) String name,
    @NotNull @DecimalMin("0.0") BigDecimal price,
    @NotNull @Positive int stock,
    @NotNull @Size(max = 255) String category
) {}