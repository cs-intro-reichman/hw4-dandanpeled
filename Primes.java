public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code

        int upper_bound = Integer.parseInt(args[0]);
        boolean[] bool_array = new boolean[upper_bound + 1]; 
        int p_divider = 2;
        int count_primes = 0;

        bool_array[0] = false;
        bool_array[1] = false;

        // put T in all indexes > 2
        for (int i = 2; i < bool_array.length-1 ; i++){ 
            bool_array[i] = true;
        }

        while (p_divider < Math.sqrt(upper_bound)){
            if (bool_array[p_divider] == true){
                for (int j = 2; j < bool_array.length; j++){
                    if (j == p_divider){
                        bool_array[j] = true;
                    }
                    else if (j % p_divider == 0 ){
                        bool_array[j] = false;
                    }
                }
            }

            p_divider++;
        }

        System.out.println("Prime numbers up to " + upper_bound + ":");
        for (int i = 2; i < bool_array.length; i++){
            if (bool_array[i] == true){
                count_primes++;
                System.out.println(i);
            }
        }  

        int per = (int)(((double)count_primes/upper_bound)*100);        
        System.out.println("There are " + count_primes + " primes between 2 and " + upper_bound + " (" + per + "% are primes)" );

    }
}
