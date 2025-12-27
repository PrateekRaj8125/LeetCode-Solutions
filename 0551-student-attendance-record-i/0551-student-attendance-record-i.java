class Solution {
    public boolean checkRecord(String s) {
        int absences = 0;
        int lateStreak = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absences++;
                lateStreak = 0;
                if (absences >= 2) 
                    return false;
            } 
            else if (c == 'L') {
                lateStreak++;
                if (lateStreak >= 3) 
                    return false;
            } 
            else {
                lateStreak = 0;
            }
        }
        return true;
    }
}
