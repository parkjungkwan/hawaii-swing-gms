package com.jse.member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
	}
	
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	@Override
	public Member[] list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Member detail(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Member login(Member member) {
		Member returnMember = null;
		for(int i=0;i< members.length;i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&&
				member.getPasswd().equals(members[i].getPasswd())) {
				returnMember = new Member();
				returnMember = members[i] ;
				break;
			}
		}
		return returnMember;
	}
	@Override
	public void update(Member member) {
		
	}

	@Override
	public void delete(Member member) {
		
	}

	
	
	
}











