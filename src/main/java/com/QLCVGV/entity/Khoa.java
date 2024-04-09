package com.QLCVGV.entity;

import javax.persistence.*;

@Entity
@Table(name="t_khoa")
public class Khoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="makhoa")
	private Long id;
	private String TenKhoa;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
	private User TruongKhoa;

	public Khoa(String tenKhoa, User truongKhoa) {
		super();
		TenKhoa = tenKhoa;
		TruongKhoa = truongKhoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenKhoa() {
		return TenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		TenKhoa = tenKhoa;
	}

	public User getTruongKhoa() {
		return TruongKhoa;
	}

	public void setTruongKhoa(User truongKhoa) {
		TruongKhoa = truongKhoa;
	}


	
}
