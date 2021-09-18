package Lesson7;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
        if (foodAmount < 0){ this.foodAmount = 0;}
    }

    public boolean descreaseFood(int amount) {
        if(foodAmount < amount){
            System.out.println("Food isn't enough");
            return false;
        }
        this.foodAmount -= amount;
        System.out.printf("Bowl decreased by %d food, now remains: %d\n", amount, this.foodAmount);
        return true;
    }

    public void addFood(int addAmount){
        foodAmount += addAmount;
        System.out.printf("Bowl is refilled by %d food, now contains: %d\n", addAmount, this.foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
