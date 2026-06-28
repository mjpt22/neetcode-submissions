class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        brackets = {')' : '(', '}' : '{', ']' : '['}

        for c in s: 
            if c in brackets: 
                if not stack or stack[-1] != brackets[c]:
                    return False;
                else: 
                    stack.pop() 
            else: 
                stack.append(c)
        return True if not stack else False


        