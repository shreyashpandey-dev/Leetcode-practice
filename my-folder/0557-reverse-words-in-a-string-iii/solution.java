class Solution {
    public String reverseWords(String s) {
        String ar[]=s.split(" ");
      for(int i=0;i<ar.length;i++)
      {
         char arr[]=ar[i].toCharArray();
          for(int j=0;j<arr.length/2;j++)
          {
              char c=arr[j];
              arr[j]=arr[arr.length-1-j];
              arr[arr.length-1-j]=c;
          }
         ar[i]=String.valueOf(arr);
          
          
      }
        String res="";
       for(int i=0;i<ar.length-1;i++)
       {
           res+=ar[i]+" ";
       }
        res+=ar[ar.length-1];
        return res;
    }
}
