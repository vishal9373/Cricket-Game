package com.example.Cricket.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Game extends BaseModel{

    private GameStatus gameStatus;

    @ManyToMany
    private List<Team> teamList;

    @ManyToOne
    private Stadium stadium;

    @OneToMany(mappedBy = "game")
    private List<Player> playerList;

}
