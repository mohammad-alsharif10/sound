package com.tdd.sound.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Artist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ArtistId")
    private Integer artistId;
    @Basic
    @Column(name = "Name")
    private String name;
    @OneToMany(mappedBy = "artistByArtistId")
    private Collection<Album> albumsByArtistId;

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
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
        Artist artist = (Artist) o;
        return Objects.equals(artistId, artist.artistId) && Objects.equals(name, artist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistId, name);
    }

    public Collection<Album> getAlbumsByArtistId() {
        return albumsByArtistId;
    }

    public void setAlbumsByArtistId(Collection<Album> albumsByArtistId) {
        this.albumsByArtistId = albumsByArtistId;
    }
}
