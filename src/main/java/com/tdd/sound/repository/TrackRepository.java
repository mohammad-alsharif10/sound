package com.tdd.sound.repository;

import com.tdd.sound.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track,Integer> {
}
