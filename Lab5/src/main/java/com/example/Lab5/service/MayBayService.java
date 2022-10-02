package com.example.Lab5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Lab5.model.MayBay;

@Service
public interface MayBayService {
	List<MayBay> findMayBaysTamBayFrom();

    List<MayBay> findLoaiMayBaysBoeing();

    List<MayBay> findMayBaysByTenNhanVien();
}
