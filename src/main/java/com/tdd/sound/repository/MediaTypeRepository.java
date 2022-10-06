package com.tdd.sound.repository;

import com.tdd.sound.entity.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaTypeRepository extends JpaRepository<MediaType, Integer> {
}
