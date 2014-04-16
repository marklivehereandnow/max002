/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.max;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author max
 */
public class Player {

//  A{文明,食物,资源,科技}={0,0,0,0}
    private int 文明;
    private int 食物;//請列出食物點數的計算方式
    //當我們要計算花費食物的時候要呼叫食物的副程式
    //
    //[農業0的值]=農業0的藍點數*1
    //[農業1的值]=農業1的藍點數*2
    //[農業2的值]=農業2的藍點數*3
    //[農業3的值]=農業3的藍點數*5
    //加總起來 回傳
    //[食物]=[農業0的值]+[農業1的值]+[農業2的值]+[農業3的值]
    //[農業0的藍點數]獲得方式
    //1.回合結束時每個在農業的黃點會生產一個符合該等級的藍點
    //2.事件獲得
    //3.侵略、戰爭獲得
    //4.黃牌獲得
    private int 拿過的時代A領袖牌數;

    public int get拿過的時代A領袖牌數() {
        return 拿過的時代A領袖牌數;
    }

    public void set拿過的時代A領袖牌數(int 拿過的時代A領袖牌數) {
        this.拿過的時代A領袖牌數 = 拿過的時代A領袖牌數;
    }
    private int 資源;
    private int 科技;
//政府的影響
    private int 內政點數;
    private int 軍事點數;

    //起始面板設置
    private int 農業;
    private int 農業0;
    private int 農業1;
    private int 農業2;
    private int 農業3;
    
    private int 礦場;
    private int 神廟;
    private int 實驗室;
    private int 戰士;
    private int 工人閒置區;
    private int 黃點工人供應區;
    private int 藍點資源供應區;
    
    

    public int get內政點數() {
        return 內政點數;
    }

    public void set內政點數(int 內政點數) {
        this.內政點數 = 內政點數;
    }

    public int get軍事點數() {
        return 軍事點數;
    }

    public void set軍事點數(int 軍事點數) {
        this.軍事點數 = 軍事點數;
    }

    public int get農業() {
        return 農業;
    }

    public void set農業(int 農業) {
        this.農業 = 農業;
    }

    public int get礦場() {
        return 礦場;
    }

    public void set礦場(int 礦場) {
        this.礦場 = 礦場;
    }

    public int get神廟() {
        return 神廟;
    }

    public void set神廟(int 神廟) {
        this.神廟 = 神廟;
    }

    public int get實驗室() {
        return 實驗室;
    }

    public void set實驗室(int 實驗室) {
        this.實驗室 = 實驗室;
    }

    public int get戰士() {
        return 戰士;
    }

    public void set戰士(int 戰士) {
        this.戰士 = 戰士;
    }

    public int get工人閒置區() {
        return 工人閒置區;
    }

    public void set工人閒置區(int 工人閒置區) {
        this.工人閒置區 = 工人閒置區;
    }

    public int get黃點工人供應區() {
        return 黃點工人供應區;
    }

    public void set黃點工人供應區(int 黃點工人供應區) {
        this.黃點工人供應區 = 黃點工人供應區;
    }

    public int get藍點資源供應區() {
        return 藍點資源供應區;
    }

    public void set藍點資源供應區(int 藍點資源供應區) {
        this.藍點資源供應區 = 藍點資源供應區;
    }



    private List<Card> 手上的牌;

    public Player() {
        文明 = 0;
        食物 = 0;
        資源 = 0;
        科技 = 0;
        手上的牌 = new ArrayList<Card>();
    }

    public int get文明() {
        return 文明;
    }
//實例 物件 對象
    public void set文明(int 文明) {
        this.文明 = 文明;
    }

    public void set起始(int 農業, int 礦場, int 實驗室, int 神廟, int 戰士, int 工人閒置區) {
        this.農業 = 農業;
        this.礦場 = 礦場;
        this.神廟 = 神廟;
        this.實驗室 = 實驗室;
        this.戰士 = 戰士;
        this.工人閒置區 = 工人閒置區;
    }

    public void set文明食物資源科技(int 文明, int 食物, int 資源, int 科技) {
        this.文明 = 文明;
        this.食物 = 食物;
        this.資源 = 資源;
        this.科技 = 科技;
    }

    public int get食物() {
        return 食物;
    }

    public void set食物(int 食物) {
        this.食物 = 食物;
    }

    public int get資源() {
        return 資源;
    }

    public void set資源(int 資源) {
        this.資源 = 資源;
    }

    public int get科技() {
        return 科技;
    }

    public void set科技(int 科技) {
        this.科技 = 科技;
    }

    public void do拿取(int 內政點數, Card 內政牌) {
        手上的牌.add(內政牌);
    }

    public void show手上的牌() {

        for (int k = 0; k < 手上的牌.size(); k++) {
            System.out.println(" " + 手上的牌.get(k));
        }
    }

    public void show() {
         System.out.print(" 手上的牌 " );
        show手上的牌();
        /*this.工人閒置區 = 工人閒置區;
         this.農業 = 農業;
         this.礦場 = 礦場;
         this.神廟 = 神廟;
         this.實驗室 = 實驗室;
         this.戰士 = 戰士;*/
        
        System.out.print("  農業=" + 農業);
        System.out.print("  礦場=" + 礦場);
        System.out.print("  神廟=" + 神廟);
        System.out.print("  實驗室=" + 實驗室);
        System.out.print("  戰士=" + 戰士);
        System.out.print("  工人閒置區=" + 工人閒置區);
        System.out.println("  " + toString());

    }

    @Override
    public String toString() {
        return "現有資源{" + "\u6587\u660e=" + 文明 + ", \u98df\u7269=" + 食物 + ", \u8cc7\u6e90=" + 資源 + ", \u79d1\u6280=" + 科技 + '}';
    }

}
