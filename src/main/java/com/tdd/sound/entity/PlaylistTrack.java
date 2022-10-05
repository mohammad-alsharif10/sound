package com.tdd.sound.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(PlaylistTrackPK.class)
public class PlaylistTrack {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PlaylistId")
    private Integer playlistId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TrackId")
    private Integer trackId;
    @ManyToOne
    @JoinColumn(name = "PlaylistId", referencedColumnName = "PlaylistId", nullable = false)
    private Playlist playlistByPlaylistId;
    @ManyToOne
    @JoinColumn(name = "TrackId", referencedColumnName = "TrackId", nullable = false)
    private Track trackByTrackId;

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaylistTrack that = (PlaylistTrack) o;
        return Objects.equals(playlistId, that.playlistId) && Objects.equals(trackId, that.trackId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, trackId);
    }

    public Playlist getPlaylistByPlaylistId() {
        return playlistByPlaylistId;
    }

    public void setPlaylistByPlaylistId(Playlist playlistByPlaylistId) {
        this.playlistByPlaylistId = playlistByPlaylistId;
    }

    public Track getTrackByTrackId() {
        return trackByTrackId;
    }

    public void setTrackByTrackId(Track trackByTrackId) {
        this.trackByTrackId = trackByTrackId;
    }
}
