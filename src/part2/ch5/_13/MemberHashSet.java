package part2.ch5._13;

import java.util.HashSet;
import java.util.Set;

public class MemberHashSet {
	
	private Set<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<>();
	}

	public void addMember(Member member) {
		hashSet.add(member);
	}

	public void showAllMember() {
		hashSet.stream().forEach(System.out::println);
	}
}
