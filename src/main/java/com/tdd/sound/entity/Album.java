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
    @Basic
    @Column(name = "ArtistId")
    private Integer artistId;
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

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(albumId, album.albumId) && Objects.equals(title, album.title) && Objects.equals(artistId, album.artistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, title, artistId);
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
