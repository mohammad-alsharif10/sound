package com.tdd.sound.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Genre {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GenreId")
    private Integer genreId;
    @Basic
    @Column(name = "Name")
    private String name;
    @OneToMany(mappedBy = "genreByGenreId")
    private Collection<Track> tracksByGenreId;

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
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
        Genre genre = (Genre) o;
        return Objects.equals(genreId, genre.genreId) && Objects.equals(name, genre.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, name);
    }

    public Collection<Track> getTracksByGenreId() {
        return tracksByGenreId;
    }

    public void setTracksByGenreId(Collection<Track> tracksByGenreId) {
        this.tracksByGenreId = tracksByGenreId;
    }
}
