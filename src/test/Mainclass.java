package test;

import java.util.ArrayList;

public class Mainclass {
	public static void main(String[] args) {
		MemberDAO data = new MemberDAO();
		ArrayList<MemberDO> list = data.getMemberlist();
		
		System.out.println(list.get(1));	//test.Member@41d477ed
		System.out.println(list.get(0).getUserName());
		for(MemberDO a:list) {
			System.out.println(a.getUserName());
		}
	}
}
