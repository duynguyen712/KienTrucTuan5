package com.example.Lab5.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "nhanvien")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
	@Id
    @Column(name = "manv")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String manv;

    @Column(name = "ten")
    private String ten;

    @Column(name = "luong")
    private Long luong;
}
