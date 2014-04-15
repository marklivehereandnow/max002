/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.max.demo;

import com.livehereandnow.max.Card;
import com.livehereandnow.max.CardType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author chenp_000
 */
public class GameEngine {

    private List<Card> ageA內政牌;
    private List<Card> cardRow;
    private List<Card> player1Cards;
    private List<Card> player2Cards;
    

    int player;

    public int getPlayer() {
        return player;
    }

    public List<Card> getAgeA內政牌() {
        return ageA內政牌;
    }

    public void showStatus() {
        System.out.println("=== Card Row ===");

        System.out.print("Value 1: ");
        for (int k = 0; k < 5; k++) {
            System.out.print("[" + cardRow.get(k).get卡名() + "] ");
        }
        System.out.println();
        System.out.print("Value 2: ");
        for (int k = 5; k < 9; k++) {
            System.out.print("[" + cardRow.get(k).get卡名() + "] ");
        }
        System.out.println();
        System.out.print("Value 3: ");
        for (int k = 9; k < 13; k++) {
            System.out.print("[" + cardRow.get(k).get卡名() + "] ");
        }
        System.out.println();

    }

    public void changeTurn() {
        if (player == 1) {
            player = 2;
            return;
        }
        if (player == 2) {
            player = 1;
            return;
        }

    }

    public GameEngine() {
        player = 1;

        ageA內政牌 = new ArrayList<>();
        cardRow = new ArrayList<>();

        // init Age A cards
        ageA內政牌.add(new Card(0, "亞歷山大大帝", 0, CardType.領袖, 100));
        ageA內政牌.add(new Card(1, "亞里士多得", 0, CardType.領袖, 950));
        ageA內政牌.add(new Card(2, "凱薩", 0, CardType.領袖, 999));
        ageA內政牌.add(new Card(3, "摩西", 0, CardType.領袖, 300));
        ageA內政牌.add(new Card(4, "漢摩拉比", 0, CardType.領袖, 130));
        ageA內政牌.add(new Card(5, "亞歷山大圖書館", 0, CardType.奇蹟, 250));
        ageA內政牌.add(new Card(6, "巨人像", 0, CardType.奇蹟, 50));
        ageA內政牌.add(new Card(7, "空中花園", 0, CardType.奇蹟, 500));
        ageA內政牌.add(new Card(8, "金字塔", 0, CardType.奇蹟, 900));
        ageA內政牌.add(new Card(15, "富饒之土", 0, CardType.黃牌, 200));
        ageA內政牌.add(new Card(16, "工程天才", 0, CardType.黃牌, 850));
        ageA內政牌.add(new Card(17, "藝術作品", 0, CardType.黃牌, 1));
        ageA內政牌.add(new Card(18, "節儉", 0, CardType.黃牌, 150));
        ageA內政牌.add(new Card(19, "荷馬", 0, CardType.黃牌, 600));
        ageA內政牌.add(new Card(20, "建築工地", 0, CardType.黃牌, 630));
        ageA內政牌.add(new Card(21, "愛國主義", 0, CardType.黃牌, 529));
        ageA內政牌.add(new Card(22, "革新思想", 0, CardType.黃牌, 774));
        ageA內政牌.add(new Card(23, "建築工地", 0, CardType.黃牌, 630));
        ageA內政牌.add(new Card(24, "愛國主義", 0, CardType.黃牌, 529));
        ageA內政牌.add(new Card(25, "革新思想", 0, CardType.黃牌, 774));

        // shuffle cards
        Collections.shuffle(ageA內政牌);
        
        // only take first 13 cards and discard others
        for (int k = 0; k < 13; k++) {
            cardRow.add(ageA內政牌.get(k));
        }
    }

    public List<Card> getCardRow() {
        return cardRow;
    }

    public boolean doCmd(String cmd) throws IOException {
        String cleanCmd = cmd.toLowerCase().trim();
        switch (cleanCmd) {
            case "help": {
                System.out.println("basic rules");
                return true;
            }
            case "hint": {
                System.out.println("to show what user can do now");
                return true;
            }

            case "status": {
//                System.out.println("to show game status");

                showStatus();
                return true;
            }
            case "version": {
                System.out.println("to show this application version info ---");
                return true;
            }
            case "change-turn": {
                this.changeTurn();
                System.out.println("change turn to player" + this.getPlayer());

                return true;
            }

            default:
                if (cmd.startsWith("take-card")) {
                    System.out.println("perfrom action 拿取");
                    return true;
                }
                return false;
        }
    }

}
