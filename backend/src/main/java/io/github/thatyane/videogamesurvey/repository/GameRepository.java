package io.github.thatyane.videogamesurvey.repository;

import io.github.thatyane.videogamesurvey.dto.GameDTO;
import io.github.thatyane.videogamesurvey.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query("SELECT new io.github.thatyane.videogamesurvey.dto.GameDTO(g.id, g.title, g.platform) FROM Game g")
    List<GameDTO> findAllDTO();
}
