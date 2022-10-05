package com.tdd.sound.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(PlaylistTrackPK.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PlaylistTrack {

    @Id
    @Column(name = "PlaylistId")
    private Integer playlistId;

    @Id
    @Column(name = "TrackId")
    private Integer trackId;
    @ManyToOne
    @JoinColumn(name = "PlaylistId", referencedColumnName = "PlaylistId", nullable = false, insertable = false, updatable = false)
    private Playlist playlistByPlaylistId;
    @ManyToOne
    @JoinColumn(name = "TrackId", referencedColumnName = "TrackId", nullable = false, insertable = false, updatable = false)
    private Track trackByTrackId;
}
