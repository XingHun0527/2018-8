package com.briup.zuoye;

import java.util.HashMap;
import java.util.HashSet;

public class Test1 {

	public static void main(String[] args) {
		String str="ddsjdgtewusdfnsdfk";
		char[] char1 = str.toCharArray();
		HashMap map=new HashMap();
		for(int i=0;i<char1.length;i++){
			if(map.containsKey(char1[i])){
				int in1=(int)map.get(char1[i])+1;
				map.put(char1[i],in1);
			}else{
				map.put(char1[i],1);
			}
		}
		System.out.println(map);
	}
}

