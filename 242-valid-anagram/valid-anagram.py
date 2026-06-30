class Solution:
    def isAnagram(self, s, t):

        if len(s) != len(t):
            return False

        freq = [0] * 26

        for ch in s:
            index = ord(ch) - ord('a')
            freq[index] += 1

        for ch in t:
            index = ord(ch) - ord('a')
            freq[index] -= 1

        for x in freq:
            if x != 0:
                return False

        return True