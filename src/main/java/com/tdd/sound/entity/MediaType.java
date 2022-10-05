package com.tdd.sound.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class MediaType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MediaTypeId")
    private Integer mediaTypeId;
    @Basic
    @Column(name = "Name")
    private String name;
    @OneToMany(mappedBy = "mediaTypeByMediaTypeId")
    private Collection<Track> tracksByMediaTypeId;

    public Integer getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(Integer mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
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
        MediaType mediaType = (MediaType) o;
        return Objects.equals(mediaTypeId, mediaType.mediaTypeId) && Objects.equals(name, mediaType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaTypeId, name);
    }

    public Collection<Track> getTracksByMediaTypeId() {
        return tracksByMediaTypeId;
    }

    public void setTracksByMediaTypeId(Collection<Track> tracksByMediaTypeId) {
        this.tracksByMediaTypeId = tracksByMediaTypeId;
    }
}
