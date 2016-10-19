package dataSt.week2;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

@SuppressWarnings("unused")
public class BuildHeap {
    private int[] data;
    private List<Swap> swaps;

    private FastScanner in;
    private PrintWriter out;

    public static void main(String[] args) throws IOException {
        new BuildHeap().solve();
    }
    
    public static int parent(int index){
    	return (index-1)/2;
    }
    public static int leftChild(int index){
    	return index*2+1;
    }
    public static int rightChild(int index){
    	return index*2+2;
    }

/**
SiftUp ( i )
while i > 1 and H[Parent(i)] < H[i]:
	swap H[Parent(i)] and H[i]
	i ← Parent(i)
*/
    public void siftUp(int index){
    	while(index>0&&data[parent(index)]>data[index]){
    		swaps.add(new Swap(parent(index), index));
            int tmp = data[parent(index)];
            data[parent(index)] = data[index];
            data[index] = tmp;
    	}
    }
    
/**
SiftDown ( i )
maxIndex ← i
ℓ ← LeftChild ( i )
if ℓ ≤ size and H[ℓ] > H[maxIndex]:
	maxIndex ← ℓ
r ← RightChild(i)
if r ≤ size and H[r] > H[maxIndex]:
	maxIndex ← r
if i ̸= maxIndex:
	swap H[i] and H[maxIndex]
	SiftDown(maxIndex)
*/
    public void siftDown(int index){
    	int size = data.length-1;
    	int maxIndex=index;
    	int l = leftChild(index);
    	if(l<=size){
    		if(data[l]<data[maxIndex]){
    			maxIndex=l;
    		}
    	}    		
    	int r = rightChild(index);
    	if(r<=size){
    		if(data[r]<data[maxIndex]){
    			maxIndex=r;
    		}    		
    	}
    	if(index!=maxIndex){
    		swaps.add(new Swap(index, maxIndex));
    		int tmp=data[index];
    		data[index] = data[maxIndex];
            data[maxIndex] = tmp;
            siftDown(maxIndex);
    	}
    }

    private void readData() throws IOException {
        int n = in.nextInt();
        data = new int[n];
        for (int i = 0; i < n; ++i) {
          data[i] = in.nextInt();
        }
    }

    private void writeResponse() {
        out.println(swaps.size());
        for (Swap swap : swaps) {
          out.println(swap.index1 + " " + swap.index2);
        }
        for (int digit : data){
        	out.print(digit + " ");
        }
    }

    private void generateSwaps() {
      swaps = new ArrayList<Swap>();
      // The following naive implementation just sorts 
      // the given sequence using selection sort algorithm
      // and saves the resulting sequence of swaps.
      // This turns the given array into a heap, 
      // but in the worst case gives a quadratic number of swaps.
      //
      // TODO: replace by a more efficient implementation
      /**
      for (int i = 0; i < data.length; ++i) {
        for (int j = i + 1; j < data.length; ++j) {
          if (data[i] > data[j]) {
            swaps.add(new Swap(i, j));
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
          }
        }
      }
      */
      for (int i = parent(data.length-1); i>=0; --i){
    	  siftDown(i);
      }
      
    }

    public void solve() throws IOException {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        readData();
        generateSwaps();
        writeResponse();
        out.close();
    }

    static class Swap {
        int index1;
        int index2;

        public Swap(int index1, int index2) {
            this.index1 = index1;
            this.index2 = index2;
        }
    }

    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = null;
        }

        public String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
