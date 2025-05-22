package part2.ch5._14;

public class MemberTreeSetTest {
	
	public static void main(String[] args) {
		
		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member m1 = new Member(1001, "이순신");
		Member m2 = new Member(1002, "김유신");
		Member m3 = new Member(1003, "강감찬");
		
		memberHashSet.addMember(m1);
		memberHashSet.addMember(m2);
		memberHashSet.addMember(m3);
		
		Member m4 = new Member(1000, "홍길동");
		memberHashSet.addMember(m4);
		
		memberHashSet.showAllMember();
	}
}
