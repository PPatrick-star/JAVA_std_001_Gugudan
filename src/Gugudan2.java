public class Gugudan2 {
    public static void main(String [] args){
        int[] times = new int[9];
        for (int j = 2; j < 10; j++) {
            for(int i = 0 ; i < times.length; i++) {
                times[i] = j*(i+1);
            }

            for (int i = 0; i < times.length; i ++) {
                System.out.println(times[i]);
            }

        }
    }
}
