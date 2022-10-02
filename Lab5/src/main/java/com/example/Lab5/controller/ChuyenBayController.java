package com.example.Lab5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Lab5.model.ChuyenBay;
import com.example.Lab5.service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	@Autowired
    private ChuyenBayService chuyenBayService;


    @GetMapping("/chuyenbay")
    public  List<ChuyenBay> fiBays(){
        return  chuyenBayService.findChuyenBays();
    }


    @GetMapping("/chuyenbay/{gaden}")
    public  List<ChuyenBay> getChuyenByByGaden(@PathVariable("gaden") String gaden){

    	List<ChuyenBay> chuyenBays= chuyenBayService.findChuyenBaysByGaden(gaden);
    		System.err.println(gaden);
        return  chuyenBays ;
    }
}
