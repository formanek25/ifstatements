public class WhileLoops
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i = i + 1;
        }
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + " but is more than 5");
            k = k - 1;
        }
        while (a < 10 && b <= 20) {
            System.out.println("a is " + a + " but is less than 10 and b is " + b + " but is less than or equal to 20");
            a = a + 1;
            b = b + 1;
        }
    }
    
    
    public static void main(String[] args)
    {        
        WhileLoops hw = new WhileLoops();
        hw.run();
    }
}