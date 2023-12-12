package com.example.Cricket.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Team extends BaseModel{

    private String name;

    private int totolRuns;
    private int totalWickets;

    private TeamType teamType;

    @OneToOne
    private ScoreBoard scoreBoard;

    @OneToMany(mappedBy = "team")
    private List<Player> playerList;
}
