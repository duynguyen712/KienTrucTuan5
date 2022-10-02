package com.example.Lab5.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Lab5.model.ChuyenBay;
import com.example.Lab5.service.ChuyenBayService;
import com.example.Lab5.repository.ChuyenBayRepository;

@Service
public class ChuyenBayImpl implements ChuyenBayService {
	
	@Autowired
    private ChuyenBayRepository chuyenBayRepository;

	@Override
	public List<ChuyenBay> findChuyenBaysByGaden(String gaden) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findChuyenBaysByGaden(gaden);
	}

	@Override
	public List<ChuyenBay> findChuyenBays() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findAll();
	}

	@Override
	public List<ChuyenBay> findChuyenBaysDoDai() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findChuyenBaysDoDai();
	}

	@Override
	public List<ChuyenBay> findChuyenBaysFromSGToBuonMaThuot() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findChuyenBaysFromSGToBuonMaThuot();
	}

	@Override
	public List<ChuyenBay> totalsChuyenBaysFromSGN() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.totalsChuyenBaysFromSGN();
	}

}
