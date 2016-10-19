package l038eCountAndSay;

public class CountAndSay {

	public static void main(String[] args) {
		for(int i=1;i<16;++i){
			System.out.println(countAndSay(i));
		}		
	}
	public static String countAndSay(int n) {
        String[] strSeq = new String[n];
        strSeq[0] = "1";
        for(int i=1;i<n;++i){
            strSeq[i] = "";
            char[] charSeq = strSeq[i-1].toCharArray();
            int num = charSeq.length;
            char curr = charSeq[0];
            int count = 1;
            for(int j=1;j<num;++j){
                if(charSeq[j]==curr){
                    ++count;
                }else{
                    strSeq[i] += count;
                    strSeq[i] += curr;
                    curr = charSeq[j];
                    count=1;
                }
            }
            strSeq[i] += count;
            strSeq[i] += curr;
        }
        return strSeq[n-1];
    }

}
