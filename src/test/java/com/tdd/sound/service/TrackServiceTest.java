package com.tdd.sound.service;

import com.tdd.sound.entity.Playlist;
import com.tdd.sound.entity.PlaylistTrack;
import com.tdd.sound.entity.Track;
import com.tdd.sound.repository.PlaylistTrackRepository;
import com.tdd.sound.repository.TrackRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TrackServiceTest {

    @Autowired
    private TrackRepository trackRepository;

    @Autowired
    private PlaylistTrackRepository playlistTrackRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void selectFromPlaylistTrackRepository() {
        List<PlaylistTrack> all = playlistTrackRepository.findAll();
        Assertions.assertNotNull(all);
    }

    @Test
    void savePlayListTrack() {
        Playlist playlist = Playlist.builder().playlistId(1).build();
        Track track = Track.builder().trackId(1).build();
        PlaylistTrack playlistTrack = PlaylistTrack.builder().trackId(track.getTrackId()).playlistId(playlist.getPlaylistId()).playlistByPlaylistId(playlist).trackByTrackId(track).build();
        playlistTrack = playlistTrackRepository.save(playlistTrack);
        Assertions.assertNotNull(playlistTrack);
    }
}
