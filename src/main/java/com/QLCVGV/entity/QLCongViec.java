package com.QLCVGV.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="t_qlcv")
public class QLCongViec {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="maqlcv")
	private Long id;
	private String TenCv;
	private Date ThoiGianBatDau;
	private Date ThoiGianKetThuc;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NguoiQuanLy")
	private User NguoiQuanLy;
	
	private String LoaiCv;
	private String MoTaCv;
	private String TrangThaiCongViec;
	public QLCongViec(String tenCv, Date thoiGianBatDau, Date thoiGianKetThuc, User nguoiQuanly, String loaiCv,
			String moTaCv, String trangThaiCongViec) {
		super();
		TenCv = tenCv;
		ThoiGianBatDau = thoiGianBatDau;
		ThoiGianKetThuc = thoiGianKetThuc;
		NguoiQuanLy = nguoiQuanly;
		LoaiCv = loaiCv;
		MoTaCv = moTaCv;
		TrangThaiCongViec = trangThaiCongViec;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTenCv() {
		return TenCv;
	}
	public void setTenCv(String tenCv) {
		TenCv = tenCv;
	}
	public Date getThoiGianBatDau() {
		return ThoiGianBatDau;
	}
	public void setThoiGianBatDau(Date thoiGianBatDau) {
		ThoiGianBatDau = thoiGianBatDau;
	}
	public Date getThoiGianKetThuc() {
		return ThoiGianKetThuc;
	}
	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		ThoiGianKetThuc = thoiGianKetThuc;
	}
	public User getNguoiQuanly() {
		return NguoiQuanLy;
	}
	public void setNguoiQuanly(User nguoiQuanly) {
		NguoiQuanLy = nguoiQuanly;
	}
	public String getLoaiCv() {
		return LoaiCv;
	}
	public void setLoaiCv(String loaiCv) {
		LoaiCv = loaiCv;
	}
	public String getMoTaCv() {
		return MoTaCv;
	}
	public void setMoTaCv(String moTaCv) {
		MoTaCv = moTaCv;
	}
	public String getTrangThaiCongViec() {
		return TrangThaiCongViec;
	}
	public void setTrangThaiCongViec(String trangThaiCongViec) {
		TrangThaiCongViec = trangThaiCongViec;
	}

	
}
