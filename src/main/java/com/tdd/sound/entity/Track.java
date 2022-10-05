package com.tdd.sound.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Track {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TrackId")
    private Integer trackId;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Composer")
    private String composer;
    @Basic
    @Column(name = "Milliseconds")
    private Integer milliseconds;
    @Basic
    @Column(name = "Bytes")
    private Integer bytes;
    @Basic
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    @OneToMany(mappedBy = "trackByTrackId")
    private Collection<InvoiceLine> invoiceLinesByTrackId;
    @OneToMany(mappedBy = "trackByTrackId")
    private Collection<PlaylistTrack> playlistTracksByTrackId;
    @ManyToOne
    @JoinColumn(name = "AlbumId", referencedColumnName = "AlbumId")
    private Album albumByAlbumId;
    @ManyToOne
    @JoinColumn(name = "MediaTypeId", referencedColumnName = "MediaTypeId", nullable = false)
    private MediaType mediaTypeByMediaTypeId;
    @ManyToOne
    @JoinColumn(name = "GenreId", referencedColumnName = "GenreId")
    private Genre genreByGenreId;
}
