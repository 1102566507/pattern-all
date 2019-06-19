package com.wing.prototype.practice;

import lombok.Data;

import java.io.Serializable;

@Data
public class JiNeng implements Serializable{
	private static final long serialVersionUID = 6627138514862312578L;
	private String name;// 技能名称
	private int hurt;// 伤害
}