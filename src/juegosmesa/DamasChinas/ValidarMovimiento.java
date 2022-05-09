/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosmesa.DamasChinas;

/**
 * Metodo para validar los movimientos y saber si las damas se pueden mover
 * hacia esa direccion
 *
 * @author Moise
 */
public class ValidarMovimiento {

    String[][] tablero = new String[8][8];
    boolean comer = false;
    boolean seCome;
    String location;

    private void copiarTablero(String[][] arr) {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                this.tablero[x][y] = arr[x][y];
            }
        }
    }

    /**
     * Movimientos validos se autorizan por medio de este metodo
     *
     * @param tablero
     * @param posAntigua
     * @param posNueva
     * @return verdadero si el movimiento es valido
     */
    public boolean esPosibleEsteMovimiento(String[][] tablero, String posAntigua, String posNueva) {
        this.tablero = tablero;
        String[] posicionesPosibles;

        int xA = Character.getNumericValue(posAntigua.charAt(1));
        int yA = Character.getNumericValue(posAntigua.charAt(0));

        int xN = Character.getNumericValue(posNueva.charAt(1));
        int yN = Character.getNumericValue(posNueva.charAt(0));

        System.out.println(xA + " " + yA + " " + tablero[yA][xA]);
        System.out.println(xN + " " + yN + " ");
        if (tablero[yA][xA].equals("Black")) {

            if ((xN == (xA + 1) && (yN == yA + 1)) || ((xN == (xA - 1)) && (yN == yA + 1))) {
                if (tablero[yN][xN].equals("Black")) {

                    return false;
                }

                return true;
            }else if(((xN == (xA + 2)) && (yN == yA + 2))&&(tablero[yA+1][xA+1].equals("Red"))){
                comer = true;
                location = (yA+1)+""+(xA+1);
                System.out.println(location);
                return true;
            }else if ((xN == (xA - 2) && (yN == yA + 2))&&(tablero[yA+1][xA-1].equals("Red"))){
                comer = true;               
                location = (yA+1)+""+(xA-1);
                System.out.println(location);
                return true;
            }
        } else if (tablero[yA][xA].equals("Red")) {

            if (((xN == (xA + 1)) && (yN == yA - 1)) || ((xN == (xA - 1)) && (yN == yA - 1))) {
                if (tablero[yN][xN].equals("Red")) {
                    return false;
                }
                return true;
            }else if(((xN == (xA + 2)) && (yN == yA - 2))&&(tablero[yA-1][xA+1].equals("Black"))){
                comer = true;
                location = (yA+1)+""+(xA+1);
                System.out.println(location);
                return true;
            }else if ((xN == (xA - 2) && (yN == yA - 2))&&(tablero[yA-1][xA-1].equals("Black"))){
                comer = true;
                location = (yA-1)+""+(xA-1);
                System.out.println(location);
                return true;
            }
        }

//        posicionesPosibles = movimientosAmodificados(tablero, posAntigua);
//
//        if (posicionesPosibles != null) {
//            for (int i = 0; i < posicionesPosibles.length; i++) {
//                if (posicionesPosibles[i].equals(posNueva)) {
////                    
//                    return true;
//                }
//            }
//        }
        return false;
    }

    String getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * Movimientos basicos modificados
     *
     * @param tableroM
     * @param posicion
     * @return null
     */
//      public String[] movimientosAmodificados(String[][] tableroM, String posicion) {
//        String[] posiblesMovimientos = movimientosFichas(tableroM, posicion);
//        int x;
//        x = Character.getNumericValue(posicion.charAt(1));
//        int y;
//        y = Character.getNumericValue(posicion.charAt(0));
//
//        return modificacionTodosMovimientos(tableroM, posicion, posiblesMovimientos);
//    }
//        private String[] modificacionTodosMovimientos(String[][] tableroFuturo, String posicionInicial, String[] posicionesFinales) {
//        String posicionesDefinitivas = "";
//
//        int xInicial = Character.getNumericValue(posicionInicial.charAt(1));
//        int yInicial = Character.getNumericValue(posicionInicial.charAt(0));
//
//        String ficha = fichaDeLaCasilla(tableroFuturo, yInicial, xInicial);
//        if (posicionesFinales != null) {
//            for (int i = 0; i < posicionesFinales.length; i++) {
//                try {
//                    String posicionFinal = posicionesFinales[i];
//                    int xFinal = Character.getNumericValue(posicionFinal.charAt(1));
//                    int yFinal = Character.getNumericValue(posicionFinal.charAt(0));
//
//                    String tableroM[][] = new String[8][8];
//
//                    copiarTableroPrimeroAlSegundo(tableroFuturo, tableroM);
//
//                    tableroM[yFinal][xFinal] = tableroM[yInicial][xInicial];
//                    tableroM[yInicial][xInicial] = "";
//
//                    if (ficha.charAt(0) == 'A') {
//                        if (reyAenJaque(tableroM) == false) {
//                            posicionesDefinitivas += "" + yFinal + "" + xFinal + "_";
//                        }
//                    } else if (ficha.charAt(0) == 'B') {
//                        if (reyBenJaque(tableroM) == false) {
//                            posicionesDefinitivas += "" + yFinal + "" + xFinal + "_";
//                        }
//                    }
//                } catch (Exception ex) {
//                }
//
//            }
//
//            String[] arrayPosiciones = posicionesDefinitivas.split("_");
//            return arrayPosiciones;
//        }
//        return null;
//    }
}
