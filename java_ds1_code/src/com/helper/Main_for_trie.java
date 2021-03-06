package com.helper;

import com.bjtu.Trie;

public class Main_for_trie {

    public static void main_tire(String[] args) {
		test1();
	}

    static void test1() {
		Trie<Integer> trie = new Trie<>();
		trie.add("cat", 1);
		trie.add("dog", 2);
		trie.add("catalog", 3);
		trie.add("cast", 4);
		trie.add("奥特曼", 5);
		Asserts.test(trie.size() == 5);
		Asserts.test(trie.startsWith("do"));
		Asserts.test(trie.startsWith("c"));
		Asserts.test(trie.startsWith("ca"));
		Asserts.test(trie.startsWith("cat"));
		Asserts.test(trie.startsWith("cata"));
		Asserts.test(!trie.startsWith("hehe"));
		Asserts.test(trie.get("奥特曼") == 5);
		// Asserts.test(trie.remove("cat") == 1);
		Asserts.test(trie.remove("catalog") == 3);
		Asserts.test(trie.remove("cast") == 4);
		Asserts.test(trie.size() == 3);
		Asserts.test(trie.startsWith("奥"));
		Asserts.test(trie.startsWith("do"));
		Asserts.test(trie.startsWith("c"));
	}

	
}
