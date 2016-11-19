package com.adhib.arfan.aplikasi.perpustakaan.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 8:00:33 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.domain
 *
 */
@Entity
@Table(name = "tb_peminjaman")
public class Peminjaman implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_peminjaman", length = 36)
    private String idPeminjaman;

    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal_peminjaman")
    private Date tanggalPeminjaman;

    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal_batas_pengembalian", length = 50)
    private Date tanggalBatasPengembalian;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Buku.class)
    @JoinColumn(name = "id_buku", nullable = true, foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT))
    private Buku buku;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Mahasiswa.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "npm", nullable = false, foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT))
    private Mahasiswa mahasiswa;

    /**
     * @return the idPeminjaman
     */
    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    /**
     * @param idPeminjaman the idPeminjaman to set
     */
    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    /**
     * @return the tanggalPeminjaman
     */
    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    /**
     * @param tanggalPeminjaman the tanggalPeminjaman to set
     */
    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    /**
     * @return the tanggalBatasPengembalian
     */
    public Date getTanggalBatasPengembalian() {
        return tanggalBatasPengembalian;
    }

    /**
     * @param tanggalBatasPengembalian the tanggalBatasPengembalian to set
     */
    public void setTanggalBatasPengembalian(Date tanggalBatasPengembalian) {
        this.tanggalBatasPengembalian = tanggalBatasPengembalian;
    }

    /**
     * @return the buku
     */
    public Buku getBuku() {
        return buku;
    }

    /**
     * @param buku the buku to set
     */
    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    /**
     * @return the mahasiswa
     */
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    /**
     * @param mahasiswa the mahasiswa to set
     */
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    
    
}
