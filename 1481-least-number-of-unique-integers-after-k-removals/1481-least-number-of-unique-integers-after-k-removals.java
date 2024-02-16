class Solution 
{
    public int findLeastNumOfUniqueInts(int[] a, int k) 
    {
        
        Map<Integer, Integer> m = new HashMap<>(); 
      
        int n=a.length;   
        int j=0;
        int c=0;
        
        for (int i = 0; i < n; i++) 
            if (m.containsKey(a[i]))  
                m.put(a[i], m.get(a[i]) + 1); 
            else
                m.put(a[i], 1); 

         
         int l=m.size();               
         int r[]=new int[l]; 
        
         for (Map.Entry<Integer, Integer> entry : m.entrySet())
             r[j++]=entry.getValue(); 
     
        
        Arrays.sort(r);
     
        
        int p=0;
         do
         {           
            k-=r[c];             
             if(k>=0)
                 c++;
             else
                 break;          
         }
         while(k>0);
    
        return l-c;
    }
}