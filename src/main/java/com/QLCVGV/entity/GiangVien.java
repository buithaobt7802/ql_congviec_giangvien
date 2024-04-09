package com.QLCVGV.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="t_giangvien")
public class GiangVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="magv")
	private Long id;
	private Date NgaySinh;
	private String DiaChi;
	private String TrinhDo;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "khoa_id")
	private Khoa khoa;
	
	private Long SoDienThoai;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
	
	@OneToMany(mappedBy = "giangVien", cascade = CascadeType.ALL)
    private List<BoMonGiangDay> boMons;
	
	

	public GiangVien(Date ngaySinh, String diaChi, String trinhDo, Khoa khoa, Long soDienThoai, User user) {
		super();
		NgaySinh = ngaySinh;
		DiaChi = diaChi;
		TrinhDo = trinhDo;
		this.khoa = khoa;
		SoDienThoai = soDienThoai;
		this.user = user;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getNgaySinh() {
		return NgaySinh;
	}



	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}



	public String getDiaChi() {
		return DiaChi;
	}



	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}



	public String getTrinhDo() {
		return TrinhDo;
	}



	public void setTrinhDo(String trinhDo) {
		TrinhDo = trinhDo;
	}



	public Khoa getKhoa() {
		return khoa;
	}



	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}



	public Long getSoDienThoai() {
		return SoDienThoai;
	}



	public void setSoDienThoai(Long soDienThoai) {
		SoDienThoai = soDienThoai;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public List<BoMonGiangDay> getBoMons() {
		return boMons;
	}



	public void setBoMons(List<BoMonGiangDay> boMons) {
		this.boMons = boMons;
	}



	

}
