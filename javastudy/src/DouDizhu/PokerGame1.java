package DouDizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame1 {
    //排序方法2:给每一张牌计算价值
    //斗地主控制台版3步
    //1.准备牌
    //2.洗牌
    //3.发牌
    //♣,♦,♠,♥
    //3,4,5,6,7,8,9,10,J,Q,K,A,2
    //main方法当启动入口
    //牌盒pokerBox
    //此时我们需要把牌和序号形成对应关系就可以了，不需要排序,所以就不需要使用TreeMap,使用HashMap就可以了
    static ArrayList<String> pokerBox = new ArrayList<>();
    //创建一个集合,用来添加牌的价值
    static HashMap<String, Integer> hm = new HashMap<>();

    //1.准备牌
    //写在外面只有一副牌,静态代码块(随着类的加载而加载)
    static {
        String[] color = {"♣", "♦", "♠", "♥"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //外层是颜色
        for (String j : color) {
            //内层是数字
            for (String i : number) {
                //进行拼接并且添加到集合中
                pokerBox.add(j + i);
            }
        }
        pokerBox.add(" 大王");
        pokerBox.add(" 小王");
        /*
        1=3♣, 2=3♦, 3=3♠, 4=3♥, 5=4♣, 6=4♦, 7=4♠, 8=4♥, 9=5♣, 10=5♦, 11=5♠, 12=5♥, 13=6♣, 14=6♦, 15=6♠, 16=6♥, 17=7♣, 18=7♦, 19=7♠, 20=7♥, 21=8♣, 22=8♦, 23=8♠, 24=8♥, 25=9♣, 26=9♦, 27=9♠, 28=9♥, 29=10♣, 30=10♦, 31=10♠, 32=10♥, 33=J♣, 34=J♦, 35=J♠, 36=
        大概效果
         */
        //指定牌的价值
        //牌上的数字到Map集合中判断是否存在
        //存在,获取价值
        //不存在,本身的数字就是价值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("大王", 50);
        hm.put("小王", 100);
    }

    public PokerGame1() {
        //洗牌
        Collections.shuffle(pokerBox);
        //发牌,TreeSet,可排序,我们打扑克牌的时候也会排序
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int j = 0; j < pokerBox.size(); j++) {
            if (j <= 2) {
                lord.add(pokerBox.get(j));
                continue;
            }
            if (j % 3 == 0) {
                player1.add(pokerBox.get(j));
            } else if (j % 3 == 1) {
                player2.add(pokerBox.get(j));
            } else {
                player3.add(pokerBox.get(j));
            }
        }
        //排序

        //看牌
        order(lord);
        order(player1);
        order(player2);
        order(player3);
        lookPoker("底牌", lord);
        lookPoker("张1", player1);
        lookPoker("张2", player2);
        lookPoker("张3", player3);

    }

    //参数1:玩家名称
    //参数2:玩家的牌
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + "的牌");
        System.out.println(list);
    }

    //看牌
    //利用牌的价值排序
    //参数:集合
    public void order(ArrayList<String> list) {
        //Arrays.sort
        list.sort(new Comparator<String>() {
            @Override
            //o1准备插入的
            //o2已经在集合内的
            public int compare(String o1, String o2) {
                //o1价值
                String color1 = o1.substring(0, 1);
                int score1 = getValue(o1);
                //o2价值
                String color2 = o2.substring(0, 1);
                int score2 = getValue(o2);
                //比较o1和o2价值
                int i = score1 - score2;
                //然后如果价值相同，比较花色，如果价值不同直接返回i
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    public int getValue(String poker) {
        String number = poker.substring(1);
        return hm.containsKey(number) ? hm.get(number) : Integer.parseInt(number);
    }
}

