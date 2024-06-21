public class Stock {
    static int maxProfit(int price[], int size){
        int buy = price[0], max = 0;
        for(int i = 1; i < size; i++){
            if(buy > price[i])
                buy = price[i];
            else if(price[i] - buy > max)
                max = price[i] - buy;
        }

        return max;
    }
    public static void main(String[] args) {
        int[] price = { 7, 1, 5, 6, 4 };
        int size = price.length;
        int max = maxProfit(price, size);
        System.out.println(max);
    }
}
