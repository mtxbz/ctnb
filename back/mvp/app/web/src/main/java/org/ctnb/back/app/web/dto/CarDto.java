package org.ctnb.back.app.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class CarDto {
    private UUID id;
    private String name;
}
