package Cardplay;

import java.util.ArrayList;

import java.util.Collections;

public class doudizhu {
    public static void main(String[] args) {
        //建立集合，存储牌堆
        ArrayList<String> poker=new ArrayList<>();
        //使用两个数组存储花色与数字
        String [] colors=new String[]{"♠","♦","♣","♥"};
        String [] numbers=new String[]{"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for(String color:colors)
        {
            for(String number:numbers)
            {
                poker.add(color+number);
            }
        }
        //将大小王放入
        poker.add("MaxJoker");
        poker.add("MinJoker");
        //System.out.println(poker);
        /*
        重新洗牌
        使用Collections中的静态方法
        static void shuffle(List<?> list)中默认随机源对指定列表进行置换
         */
        Collections.shuffle(poker);
        System.out.println(poker);

        /*
        3.发牌
        定义四个集合分别代表三个玩家以及牌底堆
         */
        ArrayList<String> play01=new ArrayList<>();
        ArrayList<String> play02=new ArrayList<>();
        ArrayList<String> play03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        /**
         * 遍历poker集合，获取每一张牌
         * 使用poker集合索引%3给玩家发牌;
         * 剩余三张为底牌
         */
        //首先判断底牌
        for(int i=0;i<poker.size();i++)
        {
            //获取每一张牌
            String s=poker.get(i);
            if(i>=51)
            {
                dipai.add(s);
            }
            else if(i%3==0)
            {
                play01.add(s);
            }
            else if(i%3==1)
            {
                play02.add(s);
            }
            else
            {
                play03.add(s);
            }
        }

        System.out.println(play01);
        System.out.println(play02);
        System.out.println(play03);
        System.out.println(dipai);


    }
}
