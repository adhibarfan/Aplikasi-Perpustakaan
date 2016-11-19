package com.adhib.arfan.aplikasi.perpustakaan.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 8:00:25 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.domain
 *
 */
@Entity
@Table(name = "tb_mahasiswa")
public class Mahasiswa implements Serializable{

    @Id    
    @Column(name = "npm", length = 8)
    private String npm;

    @Column(name = "nama", length = 50)
    private String nama;

    @Column(name = "kelas", length = 6)
    private String kelas;

    @Column(name = "jenis_kelamin", length = 6)
    private JenisKelamin jenisKelamin;
    
    @Lob
    @Column(name = "alamat", length = 50)
    private String alamat;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "mahasiswa")
    private List<Peminjaman> peminjamans = new ArrayList<>();

    /**
     * @return the npm
     */
    public String getNpm() {
        return npm;
    }

    /**
     * @param npm the npm to set
     */
    public void setNpm(String npm) {
        this.npm = npm;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the kelas
     */
    public String getKelas() {
        return kelas;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    /**
     * @return the jenisKelamin
     */
    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
}
