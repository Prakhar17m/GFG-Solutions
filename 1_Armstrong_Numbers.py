# An Armstrong number in Python is a special number that equals the sum of its digits, each raised to a power of the number of its digits. It is also known as a narcissistic number.
# In c++
string armstrongNumber(int n){
        // code here
        int ans=0,temp=n;
        while(temp){
            int digit=temp%10;
            ans+=digit*digit*digit;
            temp/=10;
        }
        return ans==n?"true":"false";
    }
