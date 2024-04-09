package com.QLCVGV.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_lop")
public class Lop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="malop")
	private Long id;
	private String TenLop;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "khoa_id")
	private Khoa khoa;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "giangvien_id")
	private GiangVien gvcn;



	public Lop(String tenlop, Khoa khoa, GiangVien gvcn) {
		super();
		this.TenLop = tenlop;
		this.khoa = khoa;
		this.gvcn = gvcn;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTenlop() {
		return TenLop;
	}



	public void setTenlop(String tenlop) {
		this.TenLop = tenlop;
	}



	public Khoa getKhoa() {
		return khoa;
	}



	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}



	public GiangVien getGvcn() {
		return gvcn;
	}



	public void setGvcn(GiangVien gvcn) {
		this.gvcn = gvcn;
	}



	
}
