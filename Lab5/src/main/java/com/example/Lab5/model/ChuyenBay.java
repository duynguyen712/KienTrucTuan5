package com.example.Lab5.model;

import java.sql.Time;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "chuyenbay")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChuyenBay {
	@Id
    @Column(name = "macb",columnDefinition = "varchar(50)")
    private String macb;

    @Column(name = "gadi")
    private String gadi;

    @Column(name = "gaden")
    private String gaden;

    @Column(name = "dodai")
    private Long dodai;

    @Column(name = "giodi")
    private Time giodi;

    @Column(name = "gioden")
    private Time gioden;

    @Column(name = "chiphi")
    private Long chiphi;
}
