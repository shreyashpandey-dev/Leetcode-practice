class Solution {
    public String toHex(int num) {
        if(num==0)
            return "0";
        String s="";
      while(num!=0)
      {
          int y=num & 15;
          if(y>=10)
              s+=String.valueOf((char)(y+87));
          else
              s+=y;
          num=num>>>4;
      }
        String t="";
        for(int i=s.length()-1;i>=0;i--)
            t+=String.valueOf(s.charAt(i));
        return t;
    }
}
