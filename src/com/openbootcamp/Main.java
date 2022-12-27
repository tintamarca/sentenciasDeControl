package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        int valoraComprobar = 11;

        signoDe(valoraComprobar);            //    Pto 1
        System.out.println("While:");
        bucleWhile();                        //    Pto 2
        System.out.println("DoWhile:");
        bucleDoWhile();                      //    Pto 3
        System.out.println("For:");
        bucleFor();                          //    Pto 4

        var nombreEstacion= "otoño";
        queEstacionEs(nombreEstacion);       //    Pto 5
    }

    public static void signoDe(int numeroIF) {     //   1: Comparador IF
        if (numeroIF < 0) {
            System.out.println("Es negativo");
        } else if (numeroIF > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es cero");
        }
    }

    public static void bucleWhile(){            // 2: Bucle While
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile += 1;
        }
    }
    public static void bucleDoWhile(){          // 3: Bucle Do-While
        int numeroDoWhile = 4;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile += 1;
        }
        while (numeroDoWhile < 3);
    }

    public static void bucleFor() {                        // 4: Bucle For
        for (int numeroFor = 0; numeroFor < 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }

    public static void queEstacionEs(String args ) {                        // 5: Switch
        switch (args){
            case "primavera":
                System.out.println("Es Primavera");
                break;
            case "verano":
                System.out.println("Es Verano");
                break;
            case "otoño":
                System.out.println("Es Otoño");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una Estación");
                break;
        }
    }
}