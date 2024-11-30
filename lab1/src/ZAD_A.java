public class ZAD_A {
    public void ZAD_A(){
        for(int i = 0; i < 301; i++){
            if(i % 6 != 0 && i % 4 == 0){
                int d, s = 0;
                int temp = i;
                while(temp > 0){
                    d = temp % 10;
                    s += d;
                    temp /= 10;
                }
                if (s < 10) System.out.println(i);
            }
        }
    }
}