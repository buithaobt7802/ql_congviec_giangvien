package com.QLCVGV.service;

import java.util.List;

import com.QLCVGV.entity.GiangVien;

public interface SanPhamService {
	List<GiangVien> getAllSanPham();
	GiangVien saveSanPham(GiangVien book);
	GiangVien getSanPhamById(Long id);
	GiangVien updateSanPham(GiangVien book);
	void deleteSanPhamById(Long id);
}
