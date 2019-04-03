package Cardplay;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 1.存牌;
 *      使用HashMap存储52张牌;
 *      使用List记录索引;
 *
 * 2.洗牌.
 *      将索引使用shuffel洗牌;
 * 3.发牌.
 *      遍历索引,将每个索引存储在玩家的容器中，排序;
 *     根据索引，在Map中查找牌
 *
 * 4.看牌
 *      根据索引输出牌;
 */

public class SortDoudizhu {
    public static void main(String[] args) {
        //牌堆
        HashMap<Integer,String> map=new HashMap<>();

        //记录索引
        ArrayList<Integer> pokerIndex=new ArrayList<>();


        String [] colors=new String[]{"♠","♦","♣","♥"};
        String [] numbers=new String[]{"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //存牌

        int index=0;
        map.put(index,"Joker");
        pokerIndex.add(index);
        index++;
        map.put(index,"SmallJoker");
        pokerIndex.add(index);
        index++;
        /**
         * 必须先遍历color
         * 保证索引由小到大对应牌为由大到小;
         */
        for (String number: numbers) {
            for (String color : colors) {
                map.put(index,number+color);
                pokerIndex.add(index);
                index++;
            }
        }
        //System.out.println(map);

        //洗牌
        Collections.shuffle(pokerIndex);

        //发牌
        ArrayList<Integer> play01=new ArrayList<>();
        ArrayList<Integer> play02=new ArrayList<>();
        ArrayList<Integer> play03=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();

        for(int i=0;i<pokerIndex.size();i++)
        {
            //获取每一张牌
            Integer card=pokerIndex.get(i);
            if(i>=51)
            {
                dipai.add(card);
            }
            else if(i%3==0)
            {
                play01.add(card);
            }
            else if(i%3==1)
            {
                play02.add(card);
            }
            else
            {
                play03.add(card);
            }
        }

        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(dipai);

        //看牌
        ShowCard("周润发",map,play01);
        ShowCard("刘德华",map,play02);
        ShowCard("黎明",map,play03);
        ShowCard("底牌",map,dipai);


    }

    public static void ShowCard(String name,HashMap<Integer,String> map,ArrayList<Integer> player)
    {
        System.out.print(name+":");
        for (Integer integer : player) {
            System.out.print(map.get(integer)+" ");
        }
        System.out.println();
    }




}
