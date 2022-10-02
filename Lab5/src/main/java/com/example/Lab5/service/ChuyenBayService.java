package com.example.Lab5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Lab5.model.ChuyenBay;

@Service
public interface ChuyenBayService {
	List<ChuyenBay> findChuyenBaysByGaden(String gaden);
    List<ChuyenBay> findChuyenBays();

    List<ChuyenBay> findChuyenBaysDoDai();

    List<ChuyenBay> findChuyenBaysFromSGToBuonMaThuot();

    List<ChuyenBay> totalsChuyenBaysFromSGN();

}
