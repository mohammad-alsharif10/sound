package com.tdd.sound.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Album {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "AlbumId")
    private Integer albumId;
    @Basic
    @Column(name = "Title")
    private String title;
    @ManyToOne
    @JoinColumn(name = "ArtistId", referencedColumnName = "ArtistId", nullable = false)
    private Artist artistByArtistId;
    @OneToMany(mappedBy = "albumByAlbumId")
    private Collection<Track> tracksByAlbumId;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtistByArtistId() {
        return artistByArtistId;
    }

    public void setArtistByArtistId(Artist artistByArtistId) {
        this.artistByArtistId = artistByArtistId;
    }

    public Collection<Track> getTracksByAlbumId() {
        return tracksByAlbumId;
    }

    public void setTracksByAlbumId(Collection<Track> tracksByAlbumId) {
        this.tracksByAlbumId = tracksByAlbumId;
    }
}
