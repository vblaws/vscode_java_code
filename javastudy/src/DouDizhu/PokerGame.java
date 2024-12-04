package DouDizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //方式1:利用序号排序
    //牌盒Map
    static HashMap<Integer, String> hm = new HashMap<>();
    //牌的序号
    static ArrayList<Integer> list = new ArrayList<>();


    //1.准备牌
    //写在外面只有一副牌,静态代码块(随着类的加载而加载)
    static {
        String[] color = {"♣", "♦", "♠", "♥"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int serialNumber = 1;
        //外层是颜色
        for (String j : number) {
            //内层是数字
            for (String i : color) {
                //进行拼接并且添加到集合中
                hm.put(serialNumber, j + i);
                list.add(serialNumber);
                serialNumber++;
            }
        }
       hm.put(serialNumber, "小王");
        list.add(serialNumber);
        hm.put(++serialNumber, "大王");
        list.add(serialNumber);
        System.out.println(hm);
        /*
        1=3♣, 2=3♦, 3=3♠, 4=3♥, 5=4♣, 6=4♦, 7=4♠, 8=4♥, 9=5♣, 10=5♦, 11=5♠, 12=5♥, 13=6♣, 14=6♦, 15=6♠, 16=6♥, 17=7♣, 18=7♦, 19=7♠, 20=7♥, 21=8♣, 22=8♦, 23=8♠, 24=8♥, 25=9♣, 26=9♦, 27=9♠, 28=9♥, 29=10♣, 30=10♦, 31=10♠, 32=10♥, 33=J♣, 34=J♦, 35=J♠, 36=
        大概效果
         */
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌,TreeSet,可排序,我们打扑克牌的时候也会排序
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int j = 0; j < list.size(); j++) {
            int serialNumber = list.get(j);
            if (j <= 2) {
                lord.add(serialNumber);
                continue;
            }
            if (j % 3 == 0) {
                player1.add(serialNumber);
            } else if (j % 3 == 1) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);
            }
        }
        //看牌
        lookPoker("底牌",lord);
        lookPoker("张1",player1);
        lookPoker("张2",player2);
        lookPoker("张3",player3);

    }

    //参数1:玩家名称
    //参数2:玩家的牌
    public static void lookPoker(String name, TreeSet<Integer> list) {
        System.out.print(name+"的牌:");
        list.forEach(x-> System.out.print(hm.get(x)+" "));
        System.out.println();
    }
}

