package com.example.Lab5.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class ChungNhanPK implements Serializable {
	private String manv;
    private String mamb;
}
