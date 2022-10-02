package com.example.Lab5.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Lab5.model.NhanVien;
import com.example.Lab5.repository.NhanVienRepository;
import com.example.Lab5.service.NhanVienService;

@Service
public class NhanVienImpl implements NhanVienService {
	@Autowired
    private NhanVienRepository nhanVienRepository;

	@Override
	public List<NhanVien> findNhanViensLuong() {
		// TODO Auto-generated method stub
		return nhanVienRepository.findNhanViensLuong();
	}

	@Override
	public Float getTotalSalaryAllNhanVien() {
		// TODO Auto-generated method stub
		return nhanVienRepository.getTotalSalaryAllNhanVien();
	}

	@Override
	public List<NhanVien> findNhanViensGroupByLoaiMayBays() {
		// TODO Auto-generated method stub
		return nhanVienRepository.findNhanViensGroupByLoaiMayBays();
	}

	@Override
	public List<NhanVien> findNhanViensByMaSo() {
		// TODO Auto-generated method stub
		return nhanVienRepository.findNhanViensByMaSo();
	}

}
