package com.QLCVGV.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_congviec")
public class CongViec {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="macongviec")
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "QLCongViec_id")
	private QLCongViec qlCongViec;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "GiangVien_id")
	private GiangVien giangVien;

	public CongViec(QLCongViec qlCongViec, GiangVien giangVien) {
		super();
		this.qlCongViec = qlCongViec;
		this.giangVien = giangVien;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public QLCongViec getQlCongViec() {
		return qlCongViec;
	}

	public void setQlCongViec(QLCongViec qlCongViec) {
		this.qlCongViec = qlCongViec;
	}

	public GiangVien getGiangVien() {
		return giangVien;
	}

	public void setGiangVien(GiangVien giangVien) {
		this.giangVien = giangVien;
	}

	
	
}
