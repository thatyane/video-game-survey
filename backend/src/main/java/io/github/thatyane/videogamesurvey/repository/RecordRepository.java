package io.github.thatyane.videogamesurvey.repository;

import io.github.thatyane.videogamesurvey.model.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.Instant;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query("SELECT r from Record r where "
            + "(coalesce(:minDate, null) IS NULL OR r.moment >= :minDate) AND "
            + "(coalesce(:maxDate, null) IS NULL OR r.moment <= :maxDate)")
    Page<Record> findByMoments(Instant minDate, Instant maxDate, Pageable pageable);
}
