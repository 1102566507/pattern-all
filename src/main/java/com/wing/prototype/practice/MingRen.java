package com.wing.prototype.practice;

import lombok.Data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class MingRen implements Cloneable, Serializable {

	private static final long serialVersionUID = -3443795276058634477L;
	private int age;// 年龄
	private double money;// 存款（元）
	private String addres;// 住址
	private List<String> loves;// 爱好
	private JiNeng jiNeng;// 技能

	// 克隆
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	// 克隆方法2，深拷备，该方法完全复制了一个对象出来，但该方法工作量过大，一但原对象增加了属性，克隆方法也得变化
	public MingRen clone2(MingRen m1) {
		MingRen returnMingRen = new MingRen();
		returnMingRen.setAddres(m1.getAddres());
		returnMingRen.setAge(m1.getAge());
		JiNeng jiNeng = new JiNeng();
		jiNeng.setHurt(m1.getJiNeng().getHurt());
		jiNeng.setName(m1.getJiNeng().getName());
		returnMingRen.setJiNeng(jiNeng);
		List<String> loves = new ArrayList<String>();
		loves.addAll(m1.getLoves());
		returnMingRen.setLoves(loves);
		returnMingRen.setMoney(m1.getMoney());
		return returnMingRen;
	}

	/**
	 * @Description: 深拷备，需要所有的原型都实现Serializable接口，否则会报错。通过序列化与反序列化进行拷备对象，
	 *               不论原型怎么变动属性，都不需要修改拷备方法，但据说序列化与反序列化的过程性能不是非常的高
	 * 
	 * @author: ddpyjqtd
	 * @Date: 2019年3月11日
	 *
	 * @param m1
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public <T> T clone3(T m1) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(m1);
		oos.flush();
		oos.close();

		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (T) ois.readObject();

	}

}