package com.QLCVGV.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="t_lichday")
public class LichDay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="malichday")
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "giangvien_id")
	private GiangVien giangVien;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bomongiangday_id")
	private BoMonGiangDay boMonGiangDay;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lop_id")
	private Lop lop;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phonghoc_id")
	private PhongHoc phongHoc;
	
	private String SoTiet;
	private Date ThoiGian;
	public LichDay(GiangVien giangVien, BoMonGiangDay boMonGiangDay, Lop lop, PhongHoc phongHoc, String soTiet,
			Date thoiGian) {
		super();
		this.giangVien = giangVien;
		this.boMonGiangDay = boMonGiangDay;
		this.lop = lop;
		this.phongHoc = phongHoc;
		SoTiet = soTiet;
		ThoiGian = thoiGian;
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
	public BoMonGiangDay getBoMonGiangDay() {
		return boMonGiangDay;
	}
	public void setBoMonGiangDay(BoMonGiangDay boMonGiangDay) {
		this.boMonGiangDay = boMonGiangDay;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	public PhongHoc getPhongHoc() {
		return phongHoc;
	}
	public void setPhongHoc(PhongHoc phongHoc) {
		this.phongHoc = phongHoc;
	}
	public String getSoTiet() {
		return SoTiet;
	}
	public void setSoTiet(String soTiet) {
		SoTiet = soTiet;
	}
	public Date getThoiGian() {
		return ThoiGian;
	}
	public void setThoiGian(Date thoiGian) {
		ThoiGian = thoiGian;
	}


	
}
