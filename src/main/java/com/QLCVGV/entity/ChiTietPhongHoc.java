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
@Table(name="t_chitietphonghoc")
public class ChiTietPhongHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="machitietphonghoc")
	private Long id;
	private String SoTiet;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "boMonGiangDay_id")
	private BoMonGiangDay boMonGiangDay ;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lop_id")
	private Lop lop;



	public ChiTietPhongHoc(String sotiet, BoMonGiangDay boMonGiangDay, Lop lop) {
		super();
		this.SoTiet = sotiet;
		this.boMonGiangDay = boMonGiangDay;
		this.lop = lop;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getSotiet() {
		return SoTiet;
	}



	public void setSotiet(String sotiet) {
		this.SoTiet = sotiet;
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


}
