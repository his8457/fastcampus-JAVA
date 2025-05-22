package part2.ch5._14;

import java.util.Set;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private Set<Member> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<>();
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}

	public void showAllMember() {
		treeSet.stream().forEach(System.out::println);
	}
}
