package huawei;

import java.util.*;      
public class Huawei3{      
    public static void main(String[] args){      
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);      
        ArrayList<Long> arr = new ArrayList<Long>();      
        ArrayList<Long> arr2 = new ArrayList<Long>();      
        long numBig=0;      
        long numSmall = 0;      
        long sum=0;      
        int k=0;      
        while(scanner.hasNext()){      
            long num = scanner.nextLong();   
            sum = 0;     
            arr2 = new ArrayList<Long>();    
            while(true){      
                k=0;      
                arr =  new ArrayList<Long>();   
                while(num!=0){      
                    long num1 = num%10;      
                    arr.add(num1);      
                    num = num/10;      
                    k++;      
                }      
                for(int i = arr.size();i<k;i++){      
                    arr.add((long) 0);      
                }      
                Collections.sort(arr);      
                numBig =0; numSmall=0;      
                for(int i=0;i<k;i++){      
                    numSmall = numSmall*10+arr.get(i);      
                    numBig = numBig*10+arr.get(k-1-i);      
                }      
                num = numBig - numSmall;      
                if(arr2.contains(num)){     
                    sum=0;    
                    for(int i=arr2.indexOf(num);i<arr2.size();i++){      
                        sum+=arr2.get(i);       
                    }      
                    break;      
                }      
                else{      
                    arr2.add(num);      
                }      
            }      
            System.out.println(sum);      
        }      
    }      
}