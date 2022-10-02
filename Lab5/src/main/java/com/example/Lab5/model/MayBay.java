package com.example.Lab5.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "maybay")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MayBay {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mamb")
    private String mamb;

    @Column(name = "loai")
    private String loai;

    @Column(name = "tambay")
    private Long tambay;
}
