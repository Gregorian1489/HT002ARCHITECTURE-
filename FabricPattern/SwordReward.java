public class SwordReward implements IGameItem{

    @Override
    public void open() {
        int a = 0;
        int b = 2;
        int random_number1 = a + (int) (Math.random() * b);
        if (random_number1 == 0){
        
        System.out.println("Sword");
        } else {
            System.out.println("Long Sword");
        }
    }

    
    
}
