package DSA_Practise.Arrays;

class majorityelement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr, arr.length));
    }
    static int majorityElement(int a[], int size)
    {
        // int[] freq = new int[1000000];
        // for(int i=0;i<a.length;i++){
        //     freq[a[i]]++;
        // }
        // int ans = size/2;
        
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]>ans){
        //         return i;
        //     }
        // }
        // return -1;
        
        // Map<Integer,Integer> mpp =new HashMap<>();
        
        // int ans = size/2;
        
        // for(int i=0;i<a.length;i++){
        //     int value = mpp.getOrDefault(a[i],0);
        //     mpp.put(a[i],value+1);
        // }
        
        // for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
        //     if(entry.getValue()>ans){
        //         return entry.getKey();
        //     }
        // }
        // return -1;
        int n = a.length;
        //int a = n/2;
        int count=0;
        int mele = a[0];
        for(int i=0;i<n;i++){
            if(mele==a[i]){
                count++;
            }else{
                //mele=a[i+1];
                count--;

            }
            if(count==0){
                mele=a[i];
                count++;
            }
}
return mele;
    }
}

