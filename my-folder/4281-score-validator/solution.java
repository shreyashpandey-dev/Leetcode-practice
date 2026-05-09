class Solution {
    public int[] scoreValidator(String[] events) {
        int sc=0;
        int cnt=0;
        for(String ev: events)
            {
                if(cnt==10)
                    break;
                switch(ev)
                    {
                        case "W":
                            cnt++;
                            break;
                        case "WD":
                        case "NB":
                            sc+=1;
                            break;
                        default:
                            sc+=Integer.parseInt(ev);

                    }
            }
        return new int[]{sc,cnt};

        
    }
}
