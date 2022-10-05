package com.tdd.sound.repository;

import com.tdd.sound.entity.PlaylistTrack;
import com.tdd.sound.entity.PlaylistTrackPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistTrackRepository extends JpaRepository<PlaylistTrack, PlaylistTrackPK> {
}
