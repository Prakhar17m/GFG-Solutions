class Solution {
    String compareFrac(String str) {
        // Code here
        double first=0.0,second=0.0;
        int a=0,b=0;
        boolean indication=false;
        String temp1="",temp2="";
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x=='/'){
                indication=true;
                temp2+=x;
                continue;
            }
            else if(x==','){
                indication=false;
                first=(double)a/b;
                a=0;
                b=0;
                temp1=temp2;
                temp2="";
                continue;
            }
            else if(x==' ')continue;
            temp2+=x;
            if(!indication){
                a=a*10+(x-'0');
            }
            else{
                b=b*10+(x-'0');
            }
        }
        second=(double)a/b;
        if(first>second)return temp1;
        else if(second>first)return temp2;
        return "equal";
    }

}
