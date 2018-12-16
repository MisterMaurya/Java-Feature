package com.feature.java.generic;

import java.util.ArrayList;

/**
 * @author Pawan-pc
 *
 */

public class WithGeneric {

	public static void main(String[] args) {

		// we can add only similar type of object
		ArrayList<String> al = new ArrayList<String>();
		al.add("78");
		al.add("89");
		System.out.println(al);

	}
}