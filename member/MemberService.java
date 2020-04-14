package com.jse.member;

public interface MemberService {
	public void setMembers(Member[] members);
	public Member[] getMemebers();
	public void add(Member member);
	public Member login(Member member);
}
