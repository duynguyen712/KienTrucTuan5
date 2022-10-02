package com.example.Lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Lab5.model.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
	List<ChuyenBay> findChuyenBaysByGaden(String gaden);

    @Query(
            value = "SELECT * FROM chuyenbay u WHERE u.dodai<10000 and u.dodai>8000",
            nativeQuery = true)
    List<ChuyenBay> findChuyenBaysDoDai();


    @Query(
            value = "SELECT * FROM chuyenbay u WHERE u.gaden like N'SGN' and u.gadi like N'BMV'",
            nativeQuery = true)
    List<ChuyenBay> findChuyenBaysFromSGToBuonMaThuot();

    @Query(
            value = "SELECT * FROM chuyenbay u WHERE u.gaden like N'SGN'",
            nativeQuery = true)
    List<ChuyenBay> totalsChuyenBaysFromSGN();
}
