class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
           int a=(int)event1[0].charAt(0)*10+(int)event1[0].charAt(1);
          int b=(int)event2[0].charAt(0)*10+(int)event2[0].charAt(1);
        if(a<b)
        {
              int c=(int)event1[1].charAt(0)*10+(int)event1[1].charAt(1);
          int d=(int)event2[0].charAt(0)*10+(int)event2[0].charAt(1);
            if(c>d)
            {
                return true;
            }
                if(c==d)
                {
                   int e=(int)event1[1].charAt(3)*10+(int)event1[1].charAt(4);
                   int f=(int)event2[0].charAt(3)*10+(int)event2[0].charAt(4); 
                    if(e>=f)
                        return true;
            }
            
        }
        if(a>b)
        {
            int c=(int)event1[0].charAt(0)*10+(int)event1[0].charAt(1);
          int d=(int)event2[1].charAt(0)*10+(int)event2[1].charAt(1);
            if(c<d)
            {
                return true;
            }
                if(c==d)
                {
                   int e=(int)event1[0].charAt(3)*10+(int)event1[0].charAt(4);
                   int f=(int)event2[1].charAt(3)*10+(int)event2[1].charAt(4); 
                    if(e<=f)
                        return true;
                }
        }
        if(a==b)
        {
            int x=(int)event1[0].charAt(3)*10+(int)event1[0].charAt(4);
            int y=(int)event2[0].charAt(3)*10+(int)event2[0].charAt(4);
            if(x==y)
                return true;
            if(x<y)
            {
                int c=(int)event1[1].charAt(0)*10+(int)event1[1].charAt(1);
                int d=(int)event2[0].charAt(0)*10+(int)event2[0].charAt(1);
            if(c>d)
            {
                return true;
            }
                if(c==d)
                {
                   int e=(int)event1[1].charAt(3)*10+(int)event1[1].charAt(4);
                   int f=(int)event2[0].charAt(3)*10+(int)event2[0].charAt(4); 
                    if(e>=f)
                        return true;
            } 
            }
            if(x>y)
            {
               int c=(int)event1[0].charAt(0)*10+(int)event1[0].charAt(1);
                int d=(int)event2[1].charAt(0)*10+(int)event2[1].charAt(1);
            if(c<d)
            {
                return true;
            }
                if(c==d)
                {
                   int e=(int)event1[0].charAt(3)*10+(int)event1[0].charAt(4);
                   int f=(int)event2[1].charAt(3)*10+(int)event2[1].charAt(4); 
                    if(e<=f)
                        return true;
            }  
            }
        }
        return false;
              }
          }
