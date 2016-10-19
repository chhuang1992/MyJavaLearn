package l030hSubstringWithConcatAllWords;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ConcatWords {

	public static void main(String[] args) {
		String[] words = {"word","good","best","good"};
		List<String> res = concatAllWords(words);
		System.out.println(res);
		System.out.println(res.size());
	}
	public static List<String> concatAllWords(String[] words){
		LinkedList<String> result = new LinkedList<>();
		if(words==null||words.length==0) return result;
		LinkedList<String> input = new LinkedList<>();
		for(int i=0;i<words.length;i++){
			input.add(words[i]);
		}
		result = concatAllWords(input);
		return result;
	}
	public static LinkedList<String> concatAllWords(LinkedList<String> words){
		Collections.sort(words);
		LinkedList<String> res = new LinkedList<>();
		if(words.size()==1){
			res.add(words.get(0));
			return res;
		}
		LinkedList<String> temp = new LinkedList<>();
		for(int i=0;i<words.size();i++){
			if(i>0&&words.get(i)==words.get(i-1)) continue;
			LinkedList<String> middle = new LinkedList<>();
			middle.addAll(words);
			String str = middle.remove(i);
			temp = concatAllWords(middle);
			concatWordAndLists(str,temp);
			res.addAll(temp);
		}
		return res;
	}
	public static void concatWordAndLists(String word, LinkedList<String> res){
		for(int i=0;i<res.size();i++){
			res.set(i, word+res.get(i));
		}
	}
}
