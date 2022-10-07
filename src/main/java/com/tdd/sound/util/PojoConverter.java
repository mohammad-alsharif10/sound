package com.tdd.sound.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tdd.sound.dto.AlbumDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PojoConverter {

    private final ObjectMapper objectMapper;

    public String convertAlbumToJson(AlbumDto albumDto) throws JsonProcessingException {
        return objectMapper.writeValueAsString(albumDto);
    }
}
