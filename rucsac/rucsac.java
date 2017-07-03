/*
Problema rucsacului
*/
package greedy;

public class Greedy_rucsac {

    public static void main(String[] args) {
       
        int W = 50;
        
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        float[] density = new float[3];
        
        for(int i = 0; i < value.length; i++)
            density[i] = (float) value[i] / weight[i];
        
        float aux;
        int aux1;
        boolean check = true;
        
        while(check) {
            check = false;
            for(int j = 0; j < value.length-1; j++) {
                
                if(density[j] < density[j+1]){
                    
                    aux = density[j];
                    density[j] = density[j+1];
                    density[j+1] = aux;
                    
                    aux1 = value[j];
                    value[j] = value[j+1];
                    value[j+1] = aux1;
                    
                    aux1 = weight[j];
                    weight[j] = weight[j+1];
                    weight[j+1] = aux1;
                    
                    check = true;
                }
            }   
        }
        
        int total_weight = 0;
        float benefit = 0, need_weight, need_value;
    
        for(int i = 0; i < value.length; i++) {
            
            if(weight[i] + total_weight <= W){
                total_weight += weight[i];
                benefit += value[i];
            }
            else {
                need_weight = W - total_weight;
                total_weight += need_weight;
                need_value = (float) value[i] / weight[i] * need_weight;
                benefit += need_value;
            }
        }
                
        System.out.println("Total Weight: " + total_weight + "\nMax Benefit: " + benefit);
    }
    
}