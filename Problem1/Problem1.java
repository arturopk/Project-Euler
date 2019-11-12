
/*
Multiples of 3 and 5: 
If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000. */

class Problem1{  
    public static void main(String args[]){ 
    int cuenta=0; 
    
    for(int i=0;i<1000;i++){
        if(i%5==0 | i%3==0){
            cuenta = cuenta + i;
        }
    }    
     System.out.println("La suma de multiplos de 3 o 5 menores a 1000 es: " + cuenta);  
    }  
}  