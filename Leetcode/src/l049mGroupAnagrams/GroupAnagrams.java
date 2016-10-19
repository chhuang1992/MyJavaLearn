package l049mGroupAnagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new LinkedList<>();
        int len = strs.length;
        if(strs==null||len==0)
            return results;
        String[] strsSorted = new String[len];
        for(int i=0;i<len;++i){
            char[] charsInStr = strs[i].toCharArray();
            Arrays.sort(charsInStr);
            strsSorted[i] = new String(charsInStr);
        }
        HashMap<String,List<String>> map = new HashMap<>();
        List<String> result = new LinkedList<>();
        for(int i=0;i<len;++i){
            result = new LinkedList<>();
            if(!map.containsKey(strsSorted[i])){
                result.add(strs[i]);
                map.put(strsSorted[i],result);
            }else{
                result = map.get(strsSorted[i]);
                result.add(strs[i]);
                map.put(strsSorted[i],result);
            }
        }
        String[] strsSortedRemoveDup = new String[len];
        for(int i=0;i<len;++i){
            strsSortedRemoveDup[i] = strsSorted[i];
        }
        Arrays.sort(strsSortedRemoveDup);
        int lenAfterRemove=1;
        for(int i=1;i<len;++i){
            if(!strsSortedRemoveDup[i].equals(strsSortedRemoveDup[i-1])){
                strsSortedRemoveDup[lenAfterRemove] =  strsSortedRemoveDup[i];
                lenAfterRemove++;
            }
        }
        for(int i=0;i<lenAfterRemove;++i){
            result = new LinkedList<>();
            result = map.get(strsSortedRemoveDup[i]);
            results.add(result);
        }
        return results;
    }
}
