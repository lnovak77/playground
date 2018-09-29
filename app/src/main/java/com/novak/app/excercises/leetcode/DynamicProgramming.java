package com.novak.app.excercises.leetcode;

public class DynamicProgramming 
{
	/* 600. Non-negative Integers without Consecutive Ones */
	public int findIntegers(int num) {
		if (num==0) return 1; 
		if (num==1) return 2;
		int g=num;
		int oldb=0;
		int msk=1;
		// Find msb and it's mask
		while (g>0)
		{
			oldb++;
			g=g>>1; 
			msk=msk<<1;
		}
		msk=msk>>1;
			/* dp[i] contains  number of non-conseq sequence with MSB<=i
	            MSB[i]=MSB[i-1]( ## of all sequences with MSB<i)+ MSB[i-2] (If MSB=i then next bit is 0, so MSB[i-2] ar all sequences         
	            starting with 0x10 at position i) 
			 */ 
			int[] dp=new int[oldb+1];
			dp[0]=1; //0
			dp[1]=2; // 0 and 1
			for (int i=2;i<=oldb;i++) 
				dp[i]=dp[i-1]+dp[i-2];

			int res=0;
			boolean good=true; /* if original doesn't have consequtive ones */
			for (int i=oldb; i>0; i--)
			{

				if ( ( num&msk ) >0 ) 
				{
					// X1 X2 .. Xi...Xn was original number and Xi=1
					// dp[i-1] returns you the number of good sequences between X1X2 Xi-1 000...0 and X1X2 Xi 000...0
					//switching i't bit to 0 returns you number of good sequences betwen original number and number when 
					// starting from i'th bit  averything else is 0 Combining these numbers together gives you result

					res+=dp[i-1];
					if (i<oldb&&((num& (msk*2))>0)) 
					{
						/* if we hit 2 consequtive ones in original number we stop the process because switching lower bits to 0 won't give
	                    us new goode sequences*/
						good =false; 
						break;
					}
				}

				msk=msk>>1;
			}

			return res+((good)?1:0);
	}

}
