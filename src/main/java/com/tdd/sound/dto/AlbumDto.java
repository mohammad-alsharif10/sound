package com.tdd.sound.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.tdd.sound.entity.Album} entity
 */
@Data
@Builder
public class AlbumDto implements Serializable {
    private final Integer albumId;
    private final String title;
}
