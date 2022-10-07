package com.tdd.sound.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
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
}
