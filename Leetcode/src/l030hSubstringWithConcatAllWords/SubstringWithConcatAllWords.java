package l030hSubstringWithConcatAllWords;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SubstringWithConcatAllWords {

	public static void main(String[] args) {
		String[] words = new String[]{"foo","bar"};
		System.out.println(findSubstring("foobarfoobar", words));
	}
	public static List<Integer> findSubstring(String s, String[] words) {
        LinkedList<Integer> result = new LinkedList<>();
        if(words==null||words.length==0) return result;
        LinkedList<String> allWords = new LinkedList<>();
        allWords = concatAllWords(words);
        int len = allWords.get(0).length();
        if(s.length()<len) return result;
        int num = allWords.size();
        for(int i=0;i<num;i++){
            String word = allWords.get(i);
            int idx = s.indexOf(word);
            if(idx==-1) continue;
            result.add(idx);
            for(int j=idx+1;j<=s.length()-len;j++){
                if(s.substring(j,j+len).equals(word)){
                    result.add(j);
                }
            }
        }
        return result;
    }
    public static LinkedList<String> concatAllWords(String[] words){
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
		    if(i>0&&words.get(i).equals(words.get(i-1))) continue;
			LinkedList<String> middle = new LinkedList<>(words);
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
