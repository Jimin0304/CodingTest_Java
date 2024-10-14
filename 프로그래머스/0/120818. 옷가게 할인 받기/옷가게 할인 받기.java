class Solution {
    public int solution(int price) {
        int minVal = 10;
        int maxVal = 1000000;
        boolean check = (minVal <= price) && (price <= maxVal);
        
        if (price >= 500000)
            price *= 0.8;
        else if (price >= 300000)
            price *= 0.9;
        else if (price >= 100000)
            price *= 0.95;
        
        return price;
    }
}