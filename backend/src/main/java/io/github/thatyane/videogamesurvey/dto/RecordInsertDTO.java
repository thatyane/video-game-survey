package io.github.thatyane.videogamesurvey.dto;

import io.github.thatyane.videogamesurvey.model.Game;
import io.github.thatyane.videogamesurvey.model.Record;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;

public class RecordInsertDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "E-mail obrigatório")
    @Email(message = "E-mail inválido")
    private String email;

    @NotEmpty(message = "Nome obrigatório")
    private String name;
    private Integer age;

    @NotNull(message = "Jogo obrigatório")
    private Long gameId;

    public RecordInsertDTO() {
    }

    public RecordInsertDTO(String email, String name, Integer age, Long gameId) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Record toEntity(Game game) {
        return Record.builder().email(this.email).name(this.name)
                .age(this.age).game(game).moment(Instant.now()).build();
    }
}
