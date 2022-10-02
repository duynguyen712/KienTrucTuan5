package com.example.Lab5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Lab5.model.NhanVien;

@Service
public interface NhanVienService {
	List<NhanVien> findNhanViensLuong();

    Float getTotalSalaryAllNhanVien();

    List<NhanVien> findNhanViensGroupByLoaiMayBays();

    List<NhanVien> findNhanViensByMaSo();
}
