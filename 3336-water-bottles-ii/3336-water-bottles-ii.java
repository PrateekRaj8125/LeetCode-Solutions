class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottlesDrunk = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            empty -= numExchange;
            numExchange++;
            bottlesDrunk++;
            empty++;
        }
        return bottlesDrunk;
    }
}
