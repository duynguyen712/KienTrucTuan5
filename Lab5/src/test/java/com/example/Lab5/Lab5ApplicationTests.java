package com.example.Lab5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Lab5.service.ChuyenBayService;
import com.example.Lab5.service.MayBayService;
import com.example.Lab5.service.NhanVienService;
import com.example.Lab5.model.ChuyenBay;
import com.example.Lab5.model.MayBay;
import com.example.Lab5.repository.ChuyenBayRepository;
import com.example.Lab5.repository.NhanVienRepository;

@SpringBootTest
class Lab5ApplicationTests {
	
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@Autowired
	private MayBayService mayBayService;
	
	@Autowired 
	private NhanVienService nhanVienService;

//	@Test
//	void cau1() {
//		System.out.println("=> Cau 1");
//		chuyenBayService.findChuyenBaysByGaden("DAD").stream().forEach(chuyenBay -> {
//			System.out.println(chuyenBay.toString());
//		});
//	}
	

	@Test
	void cau02() {
		System.out.println("=> Cau 02");
		mayBayService.findMayBaysTamBayFrom().stream().forEach(mb -> {
			System.out.println(mb.toString());
		});
	}

}
