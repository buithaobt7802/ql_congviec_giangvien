package com.QLCVGV.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QLCVGV.entity.GiangVien;
import com.QLCVGV.repository.SanPhamRepository;
import com.QLCVGV.service.SanPhamService;

@Service
public class SanPhamServiceImpl implements SanPhamService{

	@Autowired
	 private SanPhamRepository SanPhamRepository;

	@Override
	public List<GiangVien> getAllSanPham() {
		// TODO Auto-generated method stub
		return SanPhamRepository.findAll();
	}

	@Override
	public GiangVien saveSanPham(GiangVien book) {
		// TODO Auto-generated method stub
		return SanPhamRepository.save(book);
	}

	@Override
	public GiangVien getSanPhamById(Long id) {
		// TODO Auto-generated method stub
		return SanPhamRepository.getOne(id);
	}

	@Override
	public GiangVien updateSanPham(GiangVien book) {
		// TODO Auto-generated method stub
		return SanPhamRepository.save(book);
	}

	@Override
	public void deleteSanPhamById(Long id) {
		// TODO Auto-generated method stub
		SanPhamRepository.deleteById(id);
	}

	 
}
