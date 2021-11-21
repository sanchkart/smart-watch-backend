package com.ing.smartwatch.backend.event.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Activity {
    private Integer bpm;
}
