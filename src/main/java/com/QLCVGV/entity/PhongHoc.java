package com.QLCVGV.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_phong")
public class PhongHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="maphong")
	private Long id;
	private String TenPhong;
	

	public PhongHoc(String tenphong) {
		super();
		this.TenPhong = TenPhong;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTenphong() {
		return TenPhong;
	}


	public void setTenphong(String tenphong) {
		this.TenPhong = tenphong;
	}


	
}
