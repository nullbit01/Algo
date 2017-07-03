/*
Problema spectacolelor
*/
package greedy;

class Times {
    int st;
    int fn;
    int nr;
}

public class Greedy_spectacole {

    public static void main(String[] args) {
        
        Times[] activ = new Times[11];
        Times[] A = new Times[11];
        
        for(int i = 0; i < 10; i++) {
            activ[i] = new Times();
        }
        for(int i = 0; i < 10; i++) {
            A[i] = new Times();
        }
        
        activ[0].st = 0; activ[0].fn = 4; activ[0].nr = 1;
        activ[1].st = 1; activ[1].fn = 2; activ[1].nr = 2;
        activ[2].st = 2; activ[2].fn = 4; activ[2].nr = 3;
        activ[3].st = 3; activ[3].fn = 5; activ[3].nr = 4;
        activ[4].st = 3; activ[4].fn = 6; activ[4].nr = 5;
        activ[5].st = 5; activ[5].fn = 6; activ[5].nr = 6;
        activ[6].st = 5; activ[6].fn = 7; activ[6].nr = 7;
        activ[7].st = 6; activ[7].fn = 7; activ[7].nr = 8;
        activ[8].st = 7; activ[8].fn = 9; activ[8].nr = 9;
        activ[9].st = 8; activ[9].fn = 10; activ[9].nr = 10;
        
        Times aux = new Times();
        boolean check = true;
        
        while(check) {
            check = false;
            for(int i = 0; i < 9; i++) {
                
                if(activ[i].fn > activ[i+1].fn){
                    
                    aux = activ[i];
                    activ[i] = activ[i+1];
                    activ[i+1] = aux;
                     
                    check = true;
                }
            }   
        }
        
        A[0] = activ[0];
        int counter = 0;
        
        for(int i = 1; i < 10; i++) {
            
            // f_a > s_u
            if(activ[i].st >= A[counter].fn) {
                counter++;
                A[counter] = activ[i];
            }
            
        }
        for(int i = 0; i < counter + 1; i++) {
            System.out.println(A[i].nr + " ");
        }
        
    }
    
}
