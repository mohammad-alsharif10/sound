package com.tdd.sound.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Playlist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PlaylistId")
    private Integer playlistId;
    @Basic
    @Column(name = "Name")
    private String name;
    @OneToMany(mappedBy = "playlistByPlaylistId")
    private Collection<PlaylistTrack> playlistTracksByPlaylistId;

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(playlistId, playlist.playlistId) && Objects.equals(name, playlist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, name);
    }

    public Collection<PlaylistTrack> getPlaylistTracksByPlaylistId() {
        return playlistTracksByPlaylistId;
    }

    public void setPlaylistTracksByPlaylistId(Collection<PlaylistTrack> playlistTracksByPlaylistId) {
        this.playlistTracksByPlaylistId = playlistTracksByPlaylistId;
    }
}
