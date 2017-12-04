package ordinaarray;

public class OrdinaArray {

    public static void main(String[] args) {
        int[] numeri = {15, 2, 20, 7, 10};
        boolean scambiato = true;
        while (scambiato == true) {
            scambiato = false;
            int index = 0;
            while (index < numeri.length - 1) {
                if (numeri[index] > numeri[index + 1]) {
                    //scambio
                    int tmp = numeri[index];
                    numeri[index] = numeri[index + 1];
                    numeri[index + 1]=tmp;
                    scambiato=true;
                }
                index++;
            }
        }
        //Stampa
        for (int i = 0; i < numeri.length; i++) {
            int valore = numeri[i];
            System.out.println(valore);
        } 
    }

}
