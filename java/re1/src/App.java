public class App {

    
    public static void main(String[] args) throws Exception {

       
        int resultado ;

        resultado = factorial(5);
        System.out.println(resultado);
       
    }

    public int fibo(int n){

        

        if(n==0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }

    }

    

    public static int factorial(int numero){
        if(numero == 1){
            return 1;
        }else{
            return numero * factorial(numero - 1);
        }
    }





}
