class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        freq = {}
        for x in nums:
            if x in freq:
                return True
            freq[x] = 1
        return False
        