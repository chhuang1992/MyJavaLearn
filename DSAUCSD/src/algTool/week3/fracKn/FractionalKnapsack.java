package algTool.week3.fracKn;

import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        int number = values.length;
        //write your code here
        SingleItem[] singleItem = new SingleItem[number];
        for(int i=0;i<number;++i){
        	singleItem[i] = new SingleItem(values[i],weights[i]);
        	//System.out.println(singleItem[i].valueItem);
        }
        
        SingleItem temp;
        int index;
        for(int i=0;i<number;++i){
        	index = i;
        	for(int j=i+1;j<number;++j){
        		if(singleItem[j].valueItem>singleItem[index].valueItem){
        			index = j;
        		}
        	}
        	if(index!=i){
        		temp = new SingleItem(singleItem[i].value,singleItem[i].weight);
        		singleItem[i] = new SingleItem(singleItem[index].value,singleItem[index].weight);
        		singleItem[index] = new SingleItem(temp.value,temp.weight);
        	}
        }
        
        int sum = 0;
        int indexItem = 0;
        for(int i=0;i<number;++i){
        	indexItem=i;
        	sum+=singleItem[i].weight;
        	if(sum>capacity) break;
        }
        
        sum=0;
        for(int i=0;i<indexItem;++i){
        	sum+=singleItem[i].weight;
        	value += (double)singleItem[i].value;
        }
        
        int lastItemWeight = capacity - sum;
        value += (double)lastItemWeight*singleItem[indexItem].valueItem;
        

        return value;
    }

    public static void main(String args[]) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
