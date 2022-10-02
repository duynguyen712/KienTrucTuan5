package com.example.Lab5.model;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Data;

@Entity
@Table(name = "chungnhan")
@Data
@IdClass(ChungNhanPK.class)
public class ChungNhan {
	@Id
    @ManyToOne
    @JoinColumn(name = "ma_mb")
    private MayBay mamb;

    @Id
    @ManyToOne
    @JoinColumn(name = "ma_mv")
    private NhanVien manv;
}
