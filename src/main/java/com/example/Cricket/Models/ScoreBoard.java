package com.example.Cricket.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class ScoreBoard extends BaseModel{

    private int noOfOvers;

    private int noOfBowls;

    private int noOfWickets;

    private int runs;

}
