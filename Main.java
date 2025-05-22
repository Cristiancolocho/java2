public static void Main(String[] args) {
     operacion op = new operacion();
        
        // Test the Sumar method with two integers
        int result1 = op.Sumar(5, 10);
        System.out.println("Resultado de la suma de enteros: " + result1);
        
        // Test the Sumar method with two doubles
        double result2 = op.Sumar(5.5, 10.5);
        System.out.println("Resultado de la suma de dobles: " + result2);
        
        // Test the Sumar method with three integers
        int result3 = op.Sumar(5, 10, 15);
        System.out.println("Resultado de la suma de tres enteros: " + result3);
        
        // Test the Sumar method with negative integers
        int result4 = op.Sumar(-5, 10);
        System.out.println("Resultado de la suma con un número negativo: " + result4);

        operacion op2 = new operacion();
        // Test the Sumar method with two integers
        int result5 = op2.Sumar(5, 10);
        System.out.println("Resultado de la suma de enteros: " + result5);                      

}
