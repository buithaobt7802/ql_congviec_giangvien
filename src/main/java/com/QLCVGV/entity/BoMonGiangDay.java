package com.QLCVGV.entity;

import javax.persistence.*;


@Entity
@Table(name="t_bomon")
public class BoMonGiangDay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="mamon")
	private Long id;
	private String TenMon;
	@ManyToOne
    @JoinColumn(name = "giangvien_id")
    private GiangVien giangVien;

	public BoMonGiangDay(String tenmon, GiangVien giangVien) {
		super();
		this.TenMon = tenmon;
		this.giangVien = giangVien;
	}

	public BoMonGiangDay() {
		super();
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getTenmon() {
		return TenMon;
	}

	public void setTenmon(String tenmon) {
		this.TenMon = tenmon;
	}

	public GiangVien getGiangVien() {
		return giangVien;
	}

	public void setGiangVien(GiangVien giangVien) {
		this.giangVien = giangVien;
	}


}
