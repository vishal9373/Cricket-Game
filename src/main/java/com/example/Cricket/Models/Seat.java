package com.example.Cricket.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Seat extends BaseModel{

    private String name;

    private SeatType seatType;

    @ManyToOne
    private Stadium stadium;

}
