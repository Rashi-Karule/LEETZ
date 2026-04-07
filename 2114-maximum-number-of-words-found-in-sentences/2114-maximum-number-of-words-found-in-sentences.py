class Solution(object):
    def mostWordsFound(self, sentences):
        max_words = 0
        
        for s in sentences:
            count = s.count(' ') + 1   # spaces + 1 = words
            max_words = max(max_words, count)
        
        return max_words