package baidu20160929;

import java.util.LinkedList;
import java.util.Queue;

public class CircleProcess {

	public static void main(String[] args) {
		int[] arrive = new int[]{0,1,4};
		int[] run = new int[]{5,2,3};
		int circle=3;
		System.out.println(circleProc(arrive,run,circle));
		arrive = new int[]{0,1,3,9};
		run = new int[]{2,1,7,5};
		circle=2;
		System.out.println(circleProc(arrive,run,circle));
	}

	
	/**
	@question description
	arrive: [0,1,4]  run: [5,2,3]  circle: 3   ---->  wait:[2,2,3] output: mean wait:2.333333
    arrive: [0,1,3,9]  run: [2,1,7,5]  circle: 2  ---->  wait:[0,1,2,1] output: mean wait:1
	 */
	public static float circleProc(int[] arrive,int[] run,int circle){
		int n = arrive.length;
		int[] wait = new int[n];
		int[] start = new int[n];
		int[] end = new int[n];
		int[] remain = run.clone();
		int t=arrive[0];
		int curr=0;
		//int last = 0;
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(curr);
		while(true){
			curr = queue.poll();
			for(int i=0/*last+1*/;i<n;i++){
				if(arrive[i]>t&&arrive[i]<=t+Math.min(circle, remain[curr])){
					queue.offer(i);
					//last = i;
				}
			}
			start[curr]=t;
			if(circle<remain[curr]){
				queue.offer(curr);
				remain[curr] -= circle;
				end[curr]=start[curr]+circle;
				t += circle;
			}else{
				end[curr]=start[curr]+remain[curr];
				t += remain[curr];
				remain[curr] = 0;
			}
			
			int waitProcess = 0;
			for(int i=0;i<n;i++){
				if(remain[i]>0){
					waitProcess++;
				}
			}
			if(waitProcess ==0)
				break;
		}
		int totalWait = 0;
		for(int i=0;i<n;i++){
			wait[i] = end[i] -  arrive[i] - run[i];
			totalWait += wait[i];
		}
		float meanWait = (float)totalWait / (float)n;
		return meanWait;
	}
}
