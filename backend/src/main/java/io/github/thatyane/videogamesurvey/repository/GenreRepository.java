package io.github.thatyane.videogamesurvey.repository;

import io.github.thatyane.videogamesurvey.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
