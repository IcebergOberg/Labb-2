import java.util.HashMap;


    public class Model {
       
        private static int Memorycleared;

        public  static String compute2power;
       
         @SuppressWarnings("serial")
        HashMap<Integer, Long > Memory = new HashMap<Integer, Long>(){

           
             @SuppressWarnings("unused")
                private long compute2power(final int power){
                    return 2^power;
                   
            
            }
           
            @SuppressWarnings("unused")
            private void getValueFromMemory(final Integer value){
               
            }
           
            @SuppressWarnings("unused")
            private void addValueToMemory(final Integer value, final Long result){
               
            }
    };

        public static void memory(){
           


        }

        public static long compute(long power){
           
            Math.pow(2,power);
           
            if (power >= 0){
                Math.pow(2,power);
            }
            return power;
        }

        public static int clearmemoryButton(Integer valueOf) {
            return Memorycleared;
        }

        public static String compute2power(int intValue) {
            return compute2power;
        }
