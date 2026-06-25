class Solution:
    def isPalindrome(self, s: str) -> bool:
        # not using pointers here 
        newStr = ''

        for c in s: 
            if c.isalnum():
                newStr += c.lower()
        return newStr == newStr[::-1]
        