package com.wing.prototype.practice;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest implements Cloneable {

	public static void main(String[] args) {
		MingRen m1 = new MingRen();
		m1.setJiNeng(new JiNeng());
		m1.setAge(1);
		m1.setAddres("...");
		List<String> loves = new ArrayList<String>();
		loves.add("eat");
		loves.add("sleep");
		m1.setLoves(loves);

		MingRen m2 = clone3(m1);
		m2.setAddres("change address");

		compareObj(m1, m2);

	}

	public static MingRen clone(MingRen m1) {
		return (MingRen) m1.clone();
	}
	
	public static MingRen clone2(MingRen m1) {
		return m1.clone2(m1);
	}
	
	public static MingRen clone3(MingRen m1) {
		MingRen m2 = null;
		try {
			m2 = m1.clone3(m1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return m2;
	}


	public static void compareObj(MingRen m1, MingRen m2) {
		System.out.println("(m1 == m2)-->" + (m1 == m2));
		System.out.println(m1 + ".." + m2);
		System.out.println(m1.getJiNeng() + ".." + m2.getJiNeng());
		System.out.println("(m1.getAddres() == m2.getAddres())-->" + (m1.getAddres() == m2.getAddres()));
		System.out.println("(m1.getAge() == m2.getAge())-->" + (m1.getAge() == m2.getAge()));
		System.out.println("(m1.getMoney() == m2.getMoney())-->" + (m1.getMoney() == m2.getMoney()));
		System.out.println("(m1.getClass() == m2.getClass())-->" + (m1.getClass() == m2.getClass()));
		System.out.println("(m1.getJiNeng() == m2.getJiNeng())-->" + (m1.getJiNeng() == m2.getJiNeng()));
		System.out.println("(m1.getJiNeng().getHurt() == m2.getJiNeng().getHurt())-->"
				+ (m1.getJiNeng().getHurt() == m2.getJiNeng().getHurt()));
		System.out.println("(m1.getJiNeng().getName() == m2.getJiNeng().getName())-->"
				+ (m1.getJiNeng().getName() == m2.getJiNeng().getName()));
		System.out.println("(m1.getJiNeng().getClass() == m2.getJiNeng().getClass())-->"
				+ (m1.getJiNeng().getClass() == m2.getJiNeng().getClass()));

	}
}