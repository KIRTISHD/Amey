package amey;

import java.util.*;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer[] samplearray = {34, 35, 36, 37, 44, 45, 46, 47, 54, 55, 56, 57, 65, 66, 67};
        int num = 34;
        int rows = 4;
        int cols = 4;*/
        
        /*Integer[] samplearray = {0, 1, 2, 3, 4, 5};
        int num = 0;
        int rows = 1;
        int cols = 6;*/
        
		/*Integer[] samplearray = {0};
        int num = 0;
        int rows = 1;
        int cols = 2;*/
        

        List list = Arrays.asList(samplearray);
    	TreeSet<Integer> set = new TreeSet<Integer>(list);
        
        int len = set.size();
        Integer[] sortedarray = new Integer[len];
        sortedarray = set.toArray(sortedarray);
        
        for(int i = 0 , j = 0 , k = cols-1 ; i < cols ; i++)
        {
            int start = num + 10 * i;
            int end = start + cols -1;
            if (len ==  k || sortedarray[k] != end)  
            {
                int sum_till_start = (start * (start - 1)) / 2;
                int sum_till_end = (end * (end + 1)) / 2;
                int total_sum = sum_till_end - sum_till_start;
                
                for(int x = j ; x <= k-1 ; x++)
                	total_sum -= sortedarray[x];
                System.out.println(total_sum);
            }
            
            j += cols;
            k += cols;
        }
	}

}
