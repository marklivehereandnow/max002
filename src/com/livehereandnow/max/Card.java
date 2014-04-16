/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.max;

/**
 *
 * @author max
 */
public class Card implements CardType {

    int 編號;
    int 加權值;

    public int get加權值() {
        return 加權值;
    }

    public void set加權值(int 加權值) {
        this.加權值 = 加權值;
    }

    public Card(int 編號, String 卡名, int 時代, int 類型) {
        this.編號 = 編號;
        this.卡名 = 卡名;
        this.時代 = 時代;
        this.類型 = 類型;
    }

    public Card(int 編號, String 卡名, int 時代, int 類型, int 加權值) {
        this.編號 = 編號;
        this.卡名 = 卡名;
        this.時代 = 時代;
        this.類型 = 類型;
        this.加權值 = 加權值;
    }

    public Card() {
    }

    public int get編號() {
        return 編號;
    }

    public void set編號(int 編號) {
        this.編號 = 編號;
    }

    public String get卡名() {
        return 卡名;
    }

    public void set卡名(String 卡名) {
        this.卡名 = 卡名;
    }

    public int get時代() {
        return 時代;
    }

    public void set時代(int 時代) {
        this.時代 = 時代;
    }

    public int get類型() {
        return 類型;
    }

    // ver 0.7, by Mark, 2014-4-16
    public String get類型Name() {
        return CardType.CARD_TYPE_NAME[類型];
    }
    
    // ver 0.7, by Mark, 2014-4-16
    public String get卡名and類型Name() {
        return "[" + 卡名 + "-" + CardType.CARD_TYPE_NAME[類型] + "] ";
    }

    public void set類型(int 類型) {
        this.類型 = 類型;
    }

    //String 卡名;
    String 卡名;
    int 時代;//時代的值可能為0.1.2.3分別代表A.I.II.III
    int 類型;//0=領袖,1=奇蹟.2=黃牌

    @Override
    public String toString() {
        return 卡名 + "(" + 加權值 + ")";
    }

}
