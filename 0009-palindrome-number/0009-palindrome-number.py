class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        s= str(x)

        i = 0
        j = len(s)-1

        while(i<j):
            if s[i] != s[j]:
                return False
            i += 1
            j -= 1
        return True
 #OR

#if x<0:
#    return False

#original = x
#rev = 0

#while x>0:
#    rem = x % 10
#    rev = rev * 10 + rem
#    x //= 10

#return original == rev
