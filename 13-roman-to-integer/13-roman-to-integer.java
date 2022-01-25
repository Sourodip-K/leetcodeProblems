class Solution {
public int romanToInt(String s) {
int sum=0;
HashMap<Character,Integer> h1=new HashMap();
h1.put('I',1);
h1.put('V',5);
h1.put('X',10);
h1.put('L',50);
h1.put('C',100);
h1.put('D',500);
h1.put('M',1000);
for(int i=0;i<s.length();i++)
{
    char c;
    int val=0;
    c=s.charAt(i);
    val=h1.get(c);
    if(i+1<s.length() && val<h1.get(s.charAt(i+1)))
    {   
        val*=-1;
        }
    sum=sum+val;
}
    return sum;
}
}