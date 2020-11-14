package io.github.thatyane.videogamesurvey.dto;

import io.github.thatyane.videogamesurvey.model.Game;
import io.github.thatyane.videogamesurvey.model.Genre;
import io.github.thatyane.videogamesurvey.model.enums.Platform;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class GameInsertDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "Nome obrigatório")
    private String title;

    @NotEmpty(message = "Plataforma obrigatória")
    private String platform;

    @NotEmpty(message = "Gênero obrigatório")
    private Long genreId;

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public Long getGenreId() {
        return genreId;
    }

    public Game toEntity(Genre genre) {
        return Game.builder().title(this.title).platform(Platform.valueOf(this.platform))
                .genre(genre).build();
    }
}
