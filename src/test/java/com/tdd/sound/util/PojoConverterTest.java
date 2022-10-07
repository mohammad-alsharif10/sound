package com.tdd.sound.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tdd.sound.dto.AlbumDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MockitoExtension.class)
class PojoConverterTest {

    @InjectMocks
    private PojoConverter pojoConverter;

    @Mock
    private ObjectMapper objectMapper;

    @Test
    void convertAlbumToJson() throws JsonProcessingException {
        AlbumDto albumDto = AlbumDto.builder().albumId(1).title("string").build();
        Mockito.when(objectMapper.writeValueAsString(albumDto)).thenReturn("{");
        var albumToJson = pojoConverter.convertAlbumToJson(albumDto);
        assertTrue(albumToJson.startsWith("{"));
    }
}
