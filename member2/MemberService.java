package com.jse.member2;

public interface MemberService {
	public void setMembers(Member[] members);
	public Member[] getMembers();
	public void setCount(int count);
	public int getCount();
	public void add(Member member);
	public Member login(Member member);
}
