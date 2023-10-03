package com.example.musicstreamingapi.repository;

import com.example.musicstreamingapi.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository  extends JpaRepository <Song, Long> {
    List<Song> findByGenreId(Long genreId);

}
