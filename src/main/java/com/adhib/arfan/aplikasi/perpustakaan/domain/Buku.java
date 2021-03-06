package com.adhib.arfan.aplikasi.perpustakaan.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 8:00:12 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.domain
 *
 */
@Entity
@Table(name = "tb_buku")
public class Buku implements Serializable {

    /**
     * @return the idBuku
     */
    public String getIdBuku() {
        return idBuku;
    }

    /**
     * @param idBuku the idBuku to set
     */
    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    /**
     * @return the judulBuku
     */
    public String getJudulBuku() {
        return judulBuku;
    }

    /**
     * @param judulBuku the judulBuku to set
     */
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    /**
     * @return the namaPengarang
     */
    public String getNamaPengarang() {
        return namaPengarang;
    }

    /**
     * @param namaPengarang the namaPengarang to set
     */
    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    /**
     * @return the tahunTerbit
     */
    public Integer getTahunTerbit() {
        return tahunTerbit;
    }

    /**
     * @param tahunTerbit the tahunTerbit to set
     */
    public void setTahunTerbit(Integer tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    /**
     * @return the penerbit
     */
    public String getPenerbit() {
        return penerbit;
    }

    /**
     * @param penerbit the penerbit to set
     */
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    /**
     * @return the jumlahBuku
     */
    public String getJumlahBuku() {
        return jumlahBuku;
    }

    /**
     * @param jumlahBuku the jumlahBuku to set
     */
    public void setJumlahBuku(String jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    /**
     * @return the nomorRakBuku
     */
    public String getNomorRakBuku() {
        return nomorRakBuku;
    }

    /**
     * @param nomorRakBuku the nomorRakBuku to set
     */
    public void setNomorRakBuku(String nomorRakBuku) {
        this.nomorRakBuku = nomorRakBuku;
    }

    /**
     * @return the peminjamans
     */
    public List<Peminjaman> getPeminjamans() {
        return peminjamans;
    }

    /**
     * @param peminjamans the peminjamans to set
     */
    public void setPeminjamans(List<Peminjaman> peminjamans) {
        this.peminjamans = peminjamans;
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_buku", length = 36)
    private String idBuku;

    @Column(name = "judul_buku", length = 50)
    private String judulBuku;

    @Column(name = "nama_pengarang", length = 50)
    private String namaPengarang;

    @Column(name = "tahun_terbit", length = 11)
    private Integer tahunTerbit;

    @Column(name = "penerbit", length = 50)
    private String penerbit;

    @Column(name = "jumlah_buku", length = 11)
    private String jumlahBuku;

    @Column(name = "nomor_rak_buku", length = 50)
    private String nomorRakBuku;
    
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "buku")
    private List<Peminjaman> peminjamans = new ArrayList<>();

}
