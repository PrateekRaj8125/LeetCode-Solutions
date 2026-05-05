class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morse_code=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        transformations=set()
        for word in words:
            morse_word=""
            for ch in word:
                morse_word+=morse_code[ord(ch)-ord('a')]
            transformations.add(morse_word)
        return len(transformations)