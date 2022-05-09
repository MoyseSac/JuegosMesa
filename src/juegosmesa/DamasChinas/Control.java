/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosmesa.DamasChinas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import juegosmesa.Damas;

public class Control implements ActionListener {

    private String[][] tablero = new String[8][8];
    ValidarMovimiento movimientos;
    private char turnoJugadorUno = 'A';
    private char turnoJugadorDos = 'B';
    private String posNueva = null;
    private String posAntigua = null;
    private String posActual;

    /**
     * Constructor del tablero
     */
    public Control() {
        iniciarTablero();
        Damas vista = new Damas();
        vista.setVisible(true);
        anadirActionEvents();
        movimientos = new ValidarMovimiento();
    }

    /**
     * Inicio el tablero con loss valores/fichas que lo pueden ocupar
     */
    private void iniciarTablero() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                tablero[x][y] = " ";
            }
        }

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                tablero[0][i] = "Black";
                tablero[2][i] = "Black";
                tablero[6][i] = "Red";
            }
            if (i % 2 != 0) {
                tablero[1][i] = "Black";
                tablero[5][i] = "Red";
                tablero[7][i] = "Red";
            }
        }
//		for (int x = 0; x < 8; x++) {
//			for (int y = 0; y < 8; y++) {
////				System.out.print(tablero[x][y]);
//			}
//			System.out.println();
//		}

    }

    /**
     * se llevan acabo los movimientos en el tablero,tomando en cuenta la
     * posicion antigua y actual
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        movimientos.comer = false;
        if (turnoJugadorUno == 'A') {
            posActual = getBotonPosicionString(e.getSource());

            if (posAntigua == null) {
                posAntigua = posActual;
            } else if (posAntigua != null) {
                posNueva = posActual;
                if (movimientos.esPosibleEsteMovimiento(tablero, posAntigua, posNueva)) {
                    cambiarDamas(posAntigua, posNueva);
                    if (movimientos.comer) {
                        boton(movimientos.location).setIcon(null);
                        movimientos.comer = false;
                    }
                    posNueva = null;
                    posAntigua = null;
//                    turnoMaquina();
//                    comprobarJaqueMateHaciaBlancas();
                }
                posNueva = null;
                posAntigua = null;
            }
        }

    }

    /**
     * Obtenemos la posicion de las damas en el tablero
     *
     * @param boton
     * @return la posicion de las tablas en modo de "" para que sea reconocible
     * por nuestro metodo JButton que reconoce la posicion
     */
    public String getBotonPosicionString(Object boton) {

        if (boton == Damas.C00) {
            return "00";
        } else if (boton == Damas.C01) {
            return "01";
        } else if (boton == Damas.C02) {
            return "02";
        } else if (boton == Damas.C03) {
            return "03";
        } else if (boton == Damas.C04) {
            return "04";
        } else if (boton == Damas.C05) {
            return "05";
        } else if (boton == Damas.C06) {
            return "06";
        } else if (boton == Damas.C07) {
            return "07";
        } else if (boton == Damas.C10) {
            return "10";
        } else if (boton == Damas.C11) {
            return "11";
        } else if (boton == Damas.C12) {
            return "12";
        } else if (boton == Damas.C13) {
            return "13";
        } else if (boton == Damas.C14) {
            return "14";
        } else if (boton == Damas.C15) {
            return "15";
        } else if (boton == Damas.C16) {
            return "16";
        } else if (boton == Damas.C17) {
            return "17";
        } else if (boton == Damas.C20) {
            return "20";
        } else if (boton == Damas.C21) {
            return "21";
        } else if (boton == Damas.C22) {
            return "22";
        } else if (boton == Damas.C23) {
            return "23";
        } else if (boton == Damas.C24) {
            return "24";
        } else if (boton == Damas.C25) {
            return "25";
        } else if (boton == Damas.C26) {
            return "26";
        } else if (boton == Damas.C27) {
            return "27";
        } else if (boton == Damas.C30) {
            return "30";
        } else if (boton == Damas.C31) {
            return "31";
        } else if (boton == Damas.C32) {
            return "32";
        } else if (boton == Damas.C33) {
            return "33";
        } else if (boton == Damas.C34) {
            return "34";
        } else if (boton == Damas.C35) {
            return "35";
        } else if (boton == Damas.C36) {
            return "36";
        } else if (boton == Damas.C37) {
            return "37";
        } else if (boton == Damas.C40) {
            return "40";
        } else if (boton == Damas.C41) {
            return "41";
        } else if (boton == Damas.C42) {
            return "42";
        } else if (boton == Damas.C43) {
            return "43";
        } else if (boton == Damas.C44) {
            return "44";
        } else if (boton == Damas.C45) {
            return "45";
        } else if (boton == Damas.C46) {
            return "46";
        } else if (boton == Damas.C47) {
            return "47";
        } else if (boton == Damas.C50) {
            return "50";
        } else if (boton == Damas.C51) {
            return "51";
        } else if (boton == Damas.C52) {
            return "52";
        } else if (boton == Damas.C53) {
            return "53";
        } else if (boton == Damas.C54) {
            return "54";
        } else if (boton == Damas.C55) {
            return "55";
        } else if (boton == Damas.C56) {
            return "56";
        } else if (boton == Damas.C57) {
            return "57";
        } else if (boton == Damas.C60) {
            return "60";
        } else if (boton == Damas.C61) {
            return "61";
        } else if (boton == Damas.C62) {
            return "62";
        } else if (boton == Damas.C63) {
            return "63";
        } else if (boton == Damas.C64) {
            return "64";
        } else if (boton == Damas.C65) {
            return "65";
        } else if (boton == Damas.C66) {
            return "66";
        } else if (boton == Damas.C67) {
            return "67";
        } else if (boton == Damas.C70) {
            return "70";
        } else if (boton == Damas.C71) {
            return "71";
        } else if (boton == Damas.C72) {
            return "72";
        } else if (boton == Damas.C73) {
            return "73";
        } else if (boton == Damas.C74) {
            return "74";
        } else if (boton == Damas.C75) {
            return "75";
        } else if (boton == Damas.C76) {
            return "76";
        } else if (boton == Damas.C77) {
            return "77";
        }
        return null;
    }

    /**
     * Cambiamos de dama es decir se cambia su posicion Antigua a nueva y la
     * casilla que ocupaba se aclara
     *
     * @param posAntigua
     * @param posNueva
     */
    private void cambiarDamas(String posAntigua, String posNueva) {
        cambiarEnString(posAntigua, posNueva);
        cambiarEnPantalla(posAntigua, posNueva);
    }

    /**
     * cambiamos el String respecto a las posiciones en la tabla
     *
     * @param posAntigua
     * @param posNueva
     */
    private void cambiarEnString(String posAntigua, String posNueva) {
        int xA = Character.getNumericValue(posAntigua.charAt(1));
        int yA = Character.getNumericValue(posAntigua.charAt(0));

        int xN = Character.getNumericValue(posNueva.charAt(1));
        int yN = Character.getNumericValue(posNueva.charAt(0));

        System.out.println(xA + " " + yA + " " + tablero[yA][xA]);
        System.out.println(xN + " " + yN + " " + tablero[yN][xN]);

        tablero[yN][xN] = tablero[yA][xA];
        tablero[yA][xA] = "";

    }

    /**
     * Anteriormente llevamos acabo el cambio pero este no se ha hecho en
     * pantalla, asi que se utiliza este metodo
     *
     * @param posAntigua
     * @param posNueva
     */
    private void cambiarEnPantalla(String posAntigua, String posNueva) {

        boton(posNueva).setIcon(boton(posAntigua).getIcon());
        boton(posAntigua).setIcon(null);

    }

    /**
     * La posicion que obtuvimos antes la reconocemos para llevar acabo cambios
     *
     * @param posicion
     * @return la posicion donde se encuentra el jugador
     */
    public JButton boton(String posicion) {
        if (posicion.equals("00")) {
            return Damas.C00;
        } else if (posicion.equals("01")) {
            return Damas.C01;
        } else if (posicion.equals("02")) {
            return Damas.C02;
        } else if (posicion.equals("03")) {
            return Damas.C03;
        } else if (posicion.equals("04")) {
            return Damas.C04;
        } else if (posicion.equals("05")) {
            return Damas.C05;
        } else if (posicion.equals("06")) {
            return Damas.C06;
        } else if (posicion.equals("07")) {
            return Damas.C07;
        } else if (posicion.equals("10")) {
            return Damas.C10;
        } else if (posicion.equals("11")) {
            return Damas.C11;
        } else if (posicion.equals("12")) {
            return Damas.C12;
        } else if (posicion.equals("13")) {
            return Damas.C13;
        } else if (posicion.equals("14")) {
            return Damas.C14;
        } else if (posicion.equals("15")) {
            return Damas.C15;
        } else if (posicion.equals("16")) {
            return Damas.C16;
        } else if (posicion.equals("17")) {
            return Damas.C17;
        } else if (posicion.equals("20")) {
            return Damas.C20;
        } else if (posicion.equals("21")) {
            return Damas.C21;
        } else if (posicion.equals("22")) {
            return Damas.C22;
        } else if (posicion.equals("23")) {
            return Damas.C23;
        } else if (posicion.equals("24")) {
            return Damas.C24;
        } else if (posicion.equals("25")) {
            return Damas.C25;
        } else if (posicion.equals("26")) {
            return Damas.C26;
        } else if (posicion.equals("27")) {
            return Damas.C27;
        } else if (posicion.equals("30")) {
            return Damas.C30;
        } else if (posicion.equals("31")) {
            return Damas.C31;
        } else if (posicion.equals("32")) {
            return Damas.C32;
        } else if (posicion.equals("33")) {
            return Damas.C33;
        } else if (posicion.equals("34")) {
            return Damas.C34;
        } else if (posicion.equals("35")) {
            return Damas.C35;
        } else if (posicion.equals("36")) {
            return Damas.C36;
        } else if (posicion.equals("37")) {
            return Damas.C37;
        } else if (posicion.equals("40")) {
            return Damas.C40;
        } else if (posicion.equals("41")) {
            return Damas.C41;
        } else if (posicion.equals("42")) {
            return Damas.C42;
        } else if (posicion.equals("43")) {
            return Damas.C43;
        } else if (posicion.equals("44")) {
            return Damas.C44;
        } else if (posicion.equals("45")) {
            return Damas.C45;
        } else if (posicion.equals("46")) {
            return Damas.C46;
        } else if (posicion.equals("47")) {
            return Damas.C47;
        } else if (posicion.equals("50")) {
            return Damas.C50;
        } else if (posicion.equals("51")) {
            return Damas.C51;
        } else if (posicion.equals("52")) {
            return Damas.C52;
        } else if (posicion.equals("53")) {
            return Damas.C53;
        } else if (posicion.equals("54")) {
            return Damas.C54;
        } else if (posicion.equals("55")) {
            return Damas.C55;
        } else if (posicion.equals("56")) {
            return Damas.C56;
        } else if (posicion.equals("57")) {
            return Damas.C57;
        } else if (posicion.equals("60")) {
            return Damas.C60;
        } else if (posicion.equals("61")) {
            return Damas.C61;
        } else if (posicion.equals("62")) {
            return Damas.C62;
        } else if (posicion.equals("63")) {
            return Damas.C63;
        } else if (posicion.equals("64")) {
            return Damas.C64;
        } else if (posicion.equals("65")) {
            return Damas.C65;
        } else if (posicion.equals("66")) {
            return Damas.C66;
        } else if (posicion.equals("67")) {
            return Damas.C67;
        } else if (posicion.equals("70")) {
            return Damas.C70;
        } else if (posicion.equals("71")) {
            return Damas.C71;
        } else if (posicion.equals("72")) {
            return Damas.C72;
        } else if (posicion.equals("73")) {
            return Damas.C73;
        } else if (posicion.equals("74")) {
            return Damas.C74;
        } else if (posicion.equals("75")) {
            return Damas.C75;
        } else if (posicion.equals("76")) {
            return Damas.C76;
        } else if (posicion.equals("77")) {
            return Damas.C77;
        }
        return null;
    }

    /**
     * Este metodo nos sirve para reconocer si la casilla esta vacia/blanca
     *
     * @param posicion
     * @return verdadero o falso
     */
// private boolean comprobarSiLaFichaEsBlanca(String posicion) {
//        int x = Character.getNumericValue(posicion.charAt(1));
//        int y = Character.getNumericValue(posicion.charAt(0));
//        if (!tablero[y][x].equals("")) {
//            return (tablero[y][x].charAt(0) == 'A') ? true : false;
//        }
//        return false;
//    }
    /**
     * Metodo para anadir el movimiento al evento que esta sucediendo
     */
    private void anadirActionEvents() {
        Damas.C00.addActionListener(this);
        Damas.C01.addActionListener(this);
        Damas.C02.addActionListener(this);
        Damas.C03.addActionListener(this);
        Damas.C04.addActionListener(this);
        Damas.C05.addActionListener(this);
        Damas.C06.addActionListener(this);
        Damas.C07.addActionListener(this);

        Damas.C10.addActionListener(this);
        Damas.C11.addActionListener(this);
        Damas.C12.addActionListener(this);
        Damas.C13.addActionListener(this);
        Damas.C14.addActionListener(this);
        Damas.C15.addActionListener(this);
        Damas.C16.addActionListener(this);
        Damas.C17.addActionListener(this);

        Damas.C20.addActionListener(this);
        Damas.C21.addActionListener(this);
        Damas.C22.addActionListener(this);
        Damas.C23.addActionListener(this);
        Damas.C24.addActionListener(this);
        Damas.C25.addActionListener(this);
        Damas.C26.addActionListener(this);
        Damas.C27.addActionListener(this);

        Damas.C30.addActionListener(this);
        Damas.C31.addActionListener(this);
        Damas.C32.addActionListener(this);
        Damas.C33.addActionListener(this);
        Damas.C34.addActionListener(this);
        Damas.C35.addActionListener(this);
        Damas.C36.addActionListener(this);
        Damas.C37.addActionListener(this);

        Damas.C40.addActionListener(this);
        Damas.C41.addActionListener(this);
        Damas.C42.addActionListener(this);
        Damas.C43.addActionListener(this);
        Damas.C44.addActionListener(this);
        Damas.C45.addActionListener(this);
        Damas.C46.addActionListener(this);
        Damas.C47.addActionListener(this);

        Damas.C50.addActionListener(this);
        Damas.C51.addActionListener(this);
        Damas.C52.addActionListener(this);
        Damas.C53.addActionListener(this);
        Damas.C54.addActionListener(this);
        Damas.C55.addActionListener(this);
        Damas.C56.addActionListener(this);
        Damas.C57.addActionListener(this);

        Damas.C60.addActionListener(this);
        Damas.C61.addActionListener(this);
        Damas.C62.addActionListener(this);
        Damas.C63.addActionListener(this);
        Damas.C64.addActionListener(this);
        Damas.C65.addActionListener(this);
        Damas.C66.addActionListener(this);
        Damas.C67.addActionListener(this);

        Damas.C70.addActionListener(this);
        Damas.C71.addActionListener(this);
        Damas.C72.addActionListener(this);
        Damas.C73.addActionListener(this);
        Damas.C74.addActionListener(this);
        Damas.C75.addActionListener(this);
        Damas.C76.addActionListener(this);
        Damas.C77.addActionListener(this);
    }
}
