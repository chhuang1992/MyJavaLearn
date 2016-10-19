package l014LongestCommonPrefix;

import java.util.Scanner;

public class FurtherThoughts {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String q = scanner.next();
		int n = scanner.nextInt();
		String[] strs=new String[n];
		for(int i=0;i<n;i++){
			strs[i]=scanner.next();
		}
		FurtherThoughts obj = new FurtherThoughts();
		System.out.println(obj.longestCommonPrefix(q,strs));
	}
	
	public String longestCommonPrefix(String q, String[] strs) {
	    if (strs == null || strs.length == 0)
	         return "";  
	    if (strs.length == 1)
	         return strs[0];
	    Trie trie = new Trie();      
	    for (int i = 1; i < strs.length ; i++) {
	        trie.insert(strs[i]);
	    }
	    return trie.searchLongestPrefix(q);
	}
	
	public class TrieNode {

	    // R links to node children
	    private TrieNode[] links;

	    private final int R = 26;

	    private boolean isEnd;
	    
	    public TrieNode() {
	        links = new TrieNode[R];
	    }

	    // number of children non null links
	    private int size;    
	    public void put(char ch, TrieNode node) {
	        links[ch -'a'] = node;
	        size++;
	    }

	    public int getLinks() {
	        return size;
	    }
	    public boolean containsKey(char ch) {
	        return links[ch -'a'] != null;
	    }
	    public TrieNode get(char ch) {
	        return links[ch -'a'];
	    }
	    public void setEnd() {
	        isEnd = true;
	    }
	    public boolean isEnd() {
	        return isEnd;
	    }
	}
	
	public class Trie {

	    private TrieNode root;

	    public Trie() {
	        root = new TrieNode();
	    }

	    // Inserts a word into the trie.
	    public void insert(String word) {
	        TrieNode node = root;
	        for (int i = 0; i < word.length(); i++) {
	            char currentChar = word.charAt(i);
	            if (!node.containsKey(currentChar)) {
	                node.put(currentChar, new TrieNode());
	            }
	            node = node.get(currentChar);
	        }
	        node.setEnd();
	    }
	    
	    // search a prefix or whole key in trie and
	    // returns the node where search ends
	    private TrieNode searchPrefix(String word) {
	        TrieNode node = root;
	        for (int i = 0; i < word.length(); i++) {
	           char curLetter = word.charAt(i);
	           if (node.containsKey(curLetter)) {
	               node = node.get(curLetter);
	           } else {
	               return null;
	           }
	        }
	        return node;
	    }

	    // Returns if the word is in the trie.
	    public boolean search(String word) {
	       TrieNode node = searchPrefix(word);
	       return node != null && node.isEnd();
	    }
	    
	    // Returns if there is any word in the trie
	    // that starts with the given prefix.
	    public boolean startsWith(String prefix) {
	        TrieNode node = searchPrefix(prefix);
	        return node != null;
	    }
	    
	    private String searchLongestPrefix(String word) {
	        TrieNode node = root;
	        StringBuilder prefix = new StringBuilder();
	        for (int i = 0; i < word.length(); i++) {
	            char curLetter = word.charAt(i);
	            if (node.containsKey(curLetter) && (node.getLinks() == 1) && (!node.isEnd())) {
	                prefix.append(curLetter);
	                node = node.get(curLetter);
	            }
	            else
	                return prefix.toString();

	         }
	         return prefix.toString();
	    }
	}
}
