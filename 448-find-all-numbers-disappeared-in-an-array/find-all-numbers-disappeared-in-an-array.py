class Solution(object):
    def findDisappearedNumbers(self, nums):
        ans =[]
        n = len(nums)
        li= [0]*(n+1)
        for i in range (n):
            li[nums[i]]+=1
        for i in range (1,n+1):
            if li[i]==0:
                ans.append(i)
        return ans


        