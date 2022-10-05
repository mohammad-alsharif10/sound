package com.tdd.sound.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Track {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TrackId")
    private Integer trackId;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "AlbumId")
    private Integer albumId;
    @Basic
    @Column(name = "MediaTypeId")
    private Integer mediaTypeId;
    @Basic
    @Column(name = "GenreId")
    private Integer genreId;
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

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(Integer mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(trackId, track.trackId) && Objects.equals(name, track.name) && Objects.equals(albumId, track.albumId) && Objects.equals(mediaTypeId, track.mediaTypeId) && Objects.equals(genreId, track.genreId) && Objects.equals(composer, track.composer) && Objects.equals(milliseconds, track.milliseconds) && Objects.equals(bytes, track.bytes) && Objects.equals(unitPrice, track.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, name, albumId, mediaTypeId, genreId, composer, milliseconds, bytes, unitPrice);
    }

    public Collection<InvoiceLine> getInvoiceLinesByTrackId() {
        return invoiceLinesByTrackId;
    }

    public void setInvoiceLinesByTrackId(Collection<InvoiceLine> invoiceLinesByTrackId) {
        this.invoiceLinesByTrackId = invoiceLinesByTrackId;
    }

    public Collection<PlaylistTrack> getPlaylistTracksByTrackId() {
        return playlistTracksByTrackId;
    }

    public void setPlaylistTracksByTrackId(Collection<PlaylistTrack> playlistTracksByTrackId) {
        this.playlistTracksByTrackId = playlistTracksByTrackId;
    }

    public Album getAlbumByAlbumId() {
        return albumByAlbumId;
    }

    public void setAlbumByAlbumId(Album albumByAlbumId) {
        this.albumByAlbumId = albumByAlbumId;
    }

    public MediaType getMediaTypeByMediaTypeId() {
        return mediaTypeByMediaTypeId;
    }

    public void setMediaTypeByMediaTypeId(MediaType mediaTypeByMediaTypeId) {
        this.mediaTypeByMediaTypeId = mediaTypeByMediaTypeId;
    }

    public Genre getGenreByGenreId() {
        return genreByGenreId;
    }

    public void setGenreByGenreId(Genre genreByGenreId) {
        this.genreByGenreId = genreByGenreId;
    }
}
