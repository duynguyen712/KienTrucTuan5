package com.example.Lab5.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Lab5.model.MayBay;
import com.example.Lab5.service.MayBayService;
import com.example.Lab5.repository.MayBayRepository;

@Service
public class MayBayImpl implements MayBayService {
	
	@Autowired
    private MayBayRepository mayBayRepository;

	@Override
	public List<MayBay> findMayBaysTamBayFrom() {
		// TODO Auto-generated method stub
		return mayBayRepository.findMayBaysTamBayFrom();
	}

	@Override
	public List<MayBay> findLoaiMayBaysBoeing() {
		// TODO Auto-generated method stub
		return mayBayRepository.findLoaiMayBaysBoeing();
	}

	@Override
	public List<MayBay> findMayBaysByTenNhanVien() {
		// TODO Auto-generated method stub
		return mayBayRepository.findMayBaysByTenNhanVien();
	}

}
