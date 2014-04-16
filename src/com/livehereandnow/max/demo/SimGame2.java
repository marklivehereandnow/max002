/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.max.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chenp_000
 */
public class SimGame2 {

    public static void main(String[] args) throws IOException {
        GameEngine ge = new GameEngine();

        InputStreamReader cin = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(cin);
        String cmd = "";
     //   int player=1;
        while (true) {
            System.out.print("player"+ge.get當前玩家()+" >> ");
            cmd = in.readLine();
//            System.out.println("system >>> " + cmd);
            System.out.print("system >>> " );
            if (!ge.doCmd(cmd)) {
                System.out.println("? unknown command\n\n");
                System.out.println("    --- available commands: help, hint, change-turn, take-card ");
            } else {
                System.out.println("");
            }

        }
    }

}
