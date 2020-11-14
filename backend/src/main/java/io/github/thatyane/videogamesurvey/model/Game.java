package io.github.thatyane.videogamesurvey.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.thatyane.videogamesurvey.model.enums.Platform;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Builder
@EqualsAndHashCode
@AllArgsConstructor
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Platform platform;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @JsonIgnore
    @OneToMany(mappedBy = "game")
    private List<Record> records = new ArrayList<>();

    @Deprecated
    public Game() {
    }

    public Game(Long id, String title, Platform platform, Genre genre) {
        Assert.hasText(title, "O titulo precisa estar preenchido");
        Assert.notNull(platform, "A plataforma precisa estar preenchida");
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public Genre getGenre() {
        return genre;
    }
}
