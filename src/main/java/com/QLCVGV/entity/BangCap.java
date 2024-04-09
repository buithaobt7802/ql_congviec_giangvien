package com.QLCVGV.entity;

import javax.persistence.*;

@Entity
@Table(name="t_bangcap")
public class BangCap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="mabangcap")
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "giangvien_id")
	private GiangVien giangVien;
	
	private String TenBangCap;
	private String NoiDaoTao;
	private String ChungChi;
	private String NamCapChungChi;
	
	public BangCap(GiangVien giangVien, String tenBangCap, String noiDaoTao, String chungChi, String namCapChungChi) {
		super();
		this.giangVien = giangVien;
		TenBangCap = tenBangCap;
		NoiDaoTao = noiDaoTao;
		ChungChi = chungChi;
		NamCapChungChi = namCapChungChi;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public GiangVien getGiangVien() {
		return giangVien;
	}
	public void setGiangVien(GiangVien giangVien) {
		this.giangVien = giangVien;
	}
	public String getTenBangCap() {
		return TenBangCap;
	}
	public void setTenBangCap(String tenBangCap) {
		TenBangCap = tenBangCap;
	}
	public String getNoiDaoTao() {
		return NoiDaoTao;
	}
	public void setNoiDaoTao(String noiDaoTao) {
		NoiDaoTao = noiDaoTao;
	}
	public String getChungChi() {
		return ChungChi;
	}
	public void setChungChi(String chungChi) {
		ChungChi = chungChi;
	}
	public String getNamCapChungChi() {
		return NamCapChungChi;
	}
	public void setNamCapChungChi(String namCapChungChi) {
		NamCapChungChi = namCapChungChi;
	}
	
}
