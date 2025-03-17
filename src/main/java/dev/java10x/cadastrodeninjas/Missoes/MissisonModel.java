package dev.java10x.cadastrodeninjas.Missoes;

import dev.java10x.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_mission")
public class MissisonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Rank rank;
    private NinjaModel ninja;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }

    public MissisonModel() {
    }

    public MissisonModel(long id, String name, Rank rank, NinjaModel ninja) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.ninja = ninja;
    }

}
