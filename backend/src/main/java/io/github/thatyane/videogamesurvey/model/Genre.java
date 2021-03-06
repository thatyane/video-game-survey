package io.github.thatyane.videogamesurvey.model;

import lombok.EqualsAndHashCode;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@EqualsAndHashCode
public class Genre implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "genre")
    private List<Game> games = new ArrayList<>();

    @Deprecated
    public Genre() {
    }

    public Genre(Long id, String name) {
        Assert.hasText(name, "O nome precisa estar preenchido");
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
