package com.scp.java.collectionDemo;

import java.util.HashMap;

public class Appstart {
public static void main(String[] args) {
	System.out.println(" main");
	HashMap<String, String> hmap= new HashMap<String, String>();
	hmap.put("1", "V1");
	hmap.put("2", "V2");
	hmap.put("3", "V3");
	hmap.put("4", "V4");
	System.out.println(hmap);
	ABC abc= new ABC();
	System.out.println(abc.hashCode());
	System.out.println(abc);
	
}
}
class ABC{
	private int no;
}


