class Solution(object):
    def twoSum(self, nums, target):
        prevNum = {}
        for i,n in enumerate(nums):
            diff = target - n
            if diff in prevNum:
                return prevNum[diff], i
            prevNum[n] = i