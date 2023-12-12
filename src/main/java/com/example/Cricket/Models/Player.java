package com.example.Cricket.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Player extends BaseModel{

    private String name;

    private int jerseyNumber;

    private PlayerType playerType;

    private PlayerStatus playerStatus;

    @ManyToOne
    private Team team;

    @ManyToOne
    private Game game;

}
