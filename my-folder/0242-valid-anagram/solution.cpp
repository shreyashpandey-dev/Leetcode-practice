class Solution {
public:
    int ch[26];
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length())
            return false;
       // int ch[26];
        for(int i=0;i<s.length();i++)
        {
            ch[s[i]-'a']++;
            ch[t[i]-'a']--;
        }
        for(int x:ch)
        {
            if(x!=0)
                return false;
        }
        return true;
    }
};
