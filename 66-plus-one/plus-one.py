class Solution(object):
    def plusOne(self, digits):
        for i in range (len(digits)-1,-1,-1):
            if digits[i]<9 :
                digits[i]+=1
                return  digits
            digits[i]=0
        ans =[0]*(len(digits)+1)
        ans[0]=1
        return ans
        