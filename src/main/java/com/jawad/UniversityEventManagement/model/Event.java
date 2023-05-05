package com.jawad.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eventId;

    private String eventName;

    private String locationOfEvent;

    @Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}")
    private String date;

    @Pattern(regexp = "[0-9]{2}:[0-9]{2}")
    private String startTime;

    @Pattern(regexp = "[0-9]{2}:[0-9]{2}")
    private String endTime;
}
