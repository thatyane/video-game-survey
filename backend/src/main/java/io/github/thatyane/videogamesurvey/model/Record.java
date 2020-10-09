package io.github.thatyane.videogamesurvey.model;

import io.github.thatyane.videogamesurvey.model.enums.Platform;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    private Integer age;

    @Column(nullable = false)
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    public Record() {
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Instant getMoment() {
        return moment;
    }

    public String getGameName() {
        return this.game.getTitle();
    }

    public Platform getGamePlatform() {
        return this.game.getPlatform();
    }

    public String getGameGenreName() {
        return this.game.getGenre().getName();
    }
}

