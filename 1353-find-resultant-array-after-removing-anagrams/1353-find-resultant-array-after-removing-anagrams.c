/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 bool isAnagram(char *a, char *b) {
    if (strlen(a) != strlen(b)) return false;

    int freq[26] = {0};
    for (int i = 0; a[i]; i++) {
        freq[a[i] - 'a']++;
        freq[b[i] - 'a']--;
    }

    for (int i = 0; i < 26; i++)
        if (freq[i] != 0)
            return false;

    return true;
}
char** removeAnagrams(char** words, int wordsSize, int* returnSize) {
    char **result = (char **)malloc(wordsSize * sizeof(char *));
    int index = 0;
    result[index++] = words[0];
    for (int i = 1; i < wordsSize; i++) {
        if (!isAnagram(words[i], words[i - 1])) {
            result[index++] = words[i];
        }
    }
    *returnSize = index;
    return result;
}