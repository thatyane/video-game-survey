package io.github.thatyane.videogamesurvey.dto;

import io.github.thatyane.videogamesurvey.model.Record;
import io.github.thatyane.videogamesurvey.model.enums.Platform;

import java.io.Serializable;
import java.time.Instant;

public class RecordDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Instant moment;
    private String email;
    private String name;
    private Integer age;
    private String gameTitle;
    private Platform gamePlatform;
    private String genreName;

    public RecordDTO() {
    }

    public RecordDTO(Record record) {
        this.id = record.getId();
        this.moment = record.getMoment();
        this.email = record.getEmail();
        this.name = record.getName();
        this.age = record.getAge();
        this.gameTitle = record.getGameName();
        this.gamePlatform = record.getGamePlatform();
        this.genreName = record.getGameGenreName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
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

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public Platform getGamePlatform() {
        return gamePlatform;
    }

    public void setGamePlatform(Platform gamePlatform) {
        this.gamePlatform = gamePlatform;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
