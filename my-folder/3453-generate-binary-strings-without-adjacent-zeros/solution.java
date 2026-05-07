class Solution {
    public void valStr(StringBuilder sb,char i,char prev_char,List<String>res, int n)
    {
        if(prev_char=='0' && i=='0')
        return;
        else
        sb.append(i);
        if(sb.length()==n)
        {
        res.add(sb.toString());
        sb.deleteCharAt(sb.length()-1);
        return;
        }
        valStr(sb,'0',i,res,n);
        valStr(sb,'1',i,res,n);
        sb.deleteCharAt(sb.length()-1);
    }
    public List<String> validStrings(int n) {
        StringBuilder sb =new StringBuilder("");
        List<String>res=new ArrayList<>();
        valStr(sb,'0' , '1',res,n);
        valStr(sb,'1' , '1',res,n);
        return res; 
    }
}
