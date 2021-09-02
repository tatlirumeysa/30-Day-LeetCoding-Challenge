class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {        
        
       int i = 0, j = 0, k = 0;
       int n1 = nums1.length;
       int n2 = nums2.length;
       int lengthOfMergedArray=n1+n2;
       int[] arr3 = new int[lengthOfMergedArray];
       double result = 0;
        
        // The idea is to use Merge function of Merge sort
        while (i<n1 && j <n2){
            if (nums1[i] < nums2[j])
                arr3[k++] = nums1[i++];
            else
                arr3[k++] = nums2[j++];
        }
     
        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = nums1[i++];
     
        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = nums2[j++];
        
        System.out.println("Array after merging");
        for (int a=0; a < n1+n2; a++)
            System.out.print(arr3[a] + " ");
        
        System.out.println("now the logic begins");
        
        if((lengthOfMergedArray) % 2 == 0 ){//get average for median
            //(n1+n2) / 2 --->indis1  ((n1+n2) / 2 ) -1 ---->indis2
            double temp1=arr3[lengthOfMergedArray/2];
            System.out.println(temp1);
            double temp2=arr3[lengthOfMergedArray/2-1];
            System.out.println(temp2);
            result=(temp1+temp2)/2;
            
        }  else{ //get the mid element for median
            //(n1+n2) / 2+1
            result=arr3[lengthOfMergedArray/2];
        }
        
        return result;
    }
}