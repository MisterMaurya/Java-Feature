package com.feature.java.generic;

public class Gen<T> {

	T t;

	public Gen(T t) {
		this.t = t;
	}

	public String getClassName() {

		return t.getClass().getName();
	}

	public T getObject() {
		return t;
	}

	public static void main(String[] args) {

		Gen<String> ob = new Gen<String>("Mister");
		System.out.println(ob.getClassName());
		System.out.println(ob.getObject());

	}

}
