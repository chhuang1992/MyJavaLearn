package huawei;

import java.util.*;        
public class Huawei2{        
    public static void main(String[] args){        
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);        
        ArrayList<Integer> arr = new ArrayList<Integer>();        
        try{        
            while(scanner.hasNext()){        
                int num = scanner.nextInt();        
                arr.add(num);        
            }        
        }catch(Exception e){        
            System.out.println("ERROR"); return;        
        }       
                if(arr.size()>32){        
                	System.out.println("ERROR"); return;        
                }        
                int sum=0;        
                for(int i=0;i<arr.size();i++){        
                	if(arr.get(i)>0){        
                		sum+=arr.get(i);        
                	}else{        
                		System.out.println("ERROR"); return;        
                	}  
             
                }      
                System.out.println(sum);             
    }        
}
