package huawei;

import java.util.*;    

public class Huawei1{    
    public static void main(String[] args){    
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);    
        while(scanner.hasNext()){    
            String inputString = scanner.next();    
            String outputString = "";    
            int start=-1;    
            int end =-1;    
            for(int i=0;i<inputString.length();i++){    
                if(inputString.charAt(i)!='*'){    
                    start = i;    
                    break;    
                }    
            }    
            for(int i=inputString.length()-1;i>=0;i--){    
                if(inputString.charAt(i)!='*'){    
                    end = i;    
                    break;    
                }    
            }    
            if(start==-1){    
                outputString = inputString;    
                System.out.println(outputString);    
            }    
            else{    
                outputString = inputString.substring(0,start);    
                for(int i=start;i<=end;i++){    
                    if (inputString.charAt(i)!='*')    
                        outputString += inputString.charAt(i);    
                }    
                outputString += inputString.substring(end+1,inputString.length());    
                System.out.println(outputString);    
            }    
        }    
    }    
}  