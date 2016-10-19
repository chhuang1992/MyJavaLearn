/**
 * @algorithm
 * DPChange ( money , coins[] )
 * MinNumCoins (0) ← 0
 * for m from 1 to money:
 * 	  MinNumCoins(m) ← ∞
 *    for i from 1 to |coins|:
 *        if m ≥ coin[i]:
 *            NumCoins ← MinNumCoins(m − coin[i]) + 1
 *            if NumCoins < MinNumCoins(m):
 *                MinNumCoins(m) ← NumCoins
 * return MinNumCoins(money)
 */
package algTool.week5;

import java.util.Scanner;

/**
 * @author <a href="mailto:chhuang1992@gmail.com">Huangchunhui (from China)</a>
 * @reference 
 * <a href="https://www.coursera.org/learn/algorithmic-toolbox/home/week/5">
 *     Algorithmic Toolbox - Dynamic Programming | Coursera
 * </a>
 */
public class DPChangeMoney {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int money, n;
        money = scanner.nextInt();
        n = scanner.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
        	coins[i] = scanner.nextInt();
        }
        
        System.out.println(change(money, coins));

	}

	private static int change(int money, int[] coins) {
		// TODO Auto-generated method stub
		int[] minNumCoins = new int[money+1];
		minNumCoins[0]=0;
		int numCoins;
		for(int m=1;m<=money;++m){
			minNumCoins[m]=money+8;
			for(int i=0;i<coins.length;++i){
				if(m >= coins[i]){
					numCoins=minNumCoins[m - coins[i]] + 1;
					if(numCoins < minNumCoins[m]){
						minNumCoins[m] = numCoins;
					}
				}
			}
		}
		return minNumCoins[money];
	}

}
