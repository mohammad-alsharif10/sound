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

}
