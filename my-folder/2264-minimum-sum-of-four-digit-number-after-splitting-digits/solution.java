class Solution {
    public int minimumSum(int num) {
      String s=(num+"");
       char ch[]=s.toCharArray();
        Arrays.sort(ch);
        int a=Integer.parseInt(""+ch[0]+ch[2]);
        int b=Integer.parseInt(""+ch[1]+ch[3]);
       return a+b;
        
        
    }
}
