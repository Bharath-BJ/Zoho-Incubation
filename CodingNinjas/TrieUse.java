package CodingNinjas;

public class TrieUse {
	public static void main(String[] args) {
		Trie t = new Trie();
		t.add("note");
		t.add("notes");
		t.add("book");
		t.add("not");
		t.add("boo");
		System.out.println(t.search("note"));
		t.remove("boo");
		System.out.println(t.countWords());
		t.autoComplete("no");

	}
}
