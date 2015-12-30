package homework.poker;

import java.util.*;
//java -cp /Users/taro/homework/out/production/HomeWork/ homework.poker.Poker AS AD AH AD KD
/**
 * Created by thatchai on 12/21/15.
 */
public class Poker {
    public static void main(String[] args) throws NumberFormatException {
        System.out.println(new Poker().poke(args));
    }

    public String poke(String[] arr){
        Map<Integer, List<String>> numMap = new HashMap<Integer, List<String>>();
        Set<String> suitSet = new HashSet<String>();

        for(int i=0; i<arr.length; i++){
            String card = arr[i];
            String rank = card.substring(0, card.length()-1);
            String suit = card.substring(card.length()-1);

            int numOfRank = rankToNum(rank);//switch case method

            if(!numMap.containsKey(numOfRank)) {
                List suitList = new ArrayList<String>();
                suitList.add(suit);
                numMap.put(numOfRank, suitList);
            }else{
                List suitList = numMap.get(numOfRank);
                suitList.add(suit);
                numMap.put(numOfRank, suitList);
            }

            if(!suitSet.contains(suit)) {
                suitSet.add(suit);
            }
        }

        int maxSize = 0;
        int countSize2 = 0;
        Iterator<Integer> it = numMap.keySet().iterator();
        while(it.hasNext()){
            Integer rank = it.next();
            int size = numMap.get(rank).size();

            if(size == 2)
                ++countSize2;

            if(size >= maxSize)
                maxSize = size;
        }

        List<Integer> sortedRankList = getSortedRank(numMap);// sort rank method

        if(maxSize == 4)
            return "Four of a kind";
        else if(maxSize == 3) {
            if(countSize2 > 0)
                return "Full House";
            else
                return "Three of a kind";
        }else if(maxSize ==2){
            if(countSize2 > 1){
                return "Two pair";
            }else{
                return "One pair";
            }
        }

        String straight = straight(sortedRankList);// straight method
        String flush = flush(suitSet);// flush method

        if( !straight.trim().equals("") || !flush.trim().equals("") ){
            return straight + " " + flush;
        }else if(maxSize == 1){
            int num = sortedRankList.get(sortedRankList.size()-1);
            String rank = numToRank(num);//method numToRank
            String suite = numMap.get(num).get(0);
            return "High Card " + rank + suite;
        }

        return "Not found";
    }

    private List<Integer> getSortedRank(Map<Integer, List<String>> map){
        List<Integer> list = new ArrayList<Integer>();
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            Integer i = it.next();
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }

    private  String straight(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if(i < list.size()-1){
                int current = list.get(i).intValue();
                int next = list.get(i+1).intValue();
                if(next - current != 1)
                    return "";
            }
        }
        return list.get(list.size()-1)==14 ? "Royal Straight" : "Straight";
    }

    private  String flush(Set<String> set){
       return set.size() == 1 ? "Flush" : "";
    }

    private Integer rankToNum(String rank){
        switch (rank){
            case "J" : return 11;
            case "Q" : return 12;
            case "K" : return 13;
            case "A" : return 14;
            default: return Integer.parseInt(rank);
        }
    }

    private String numToRank(Integer num){
        switch (num){
            case 11 : return "J";
            case 12 : return "Q";
            case 13 : return "K";
            case 14 : return "A";
            default: return num.toString();
        }
    }

}

//    private String[] suitOfCard = new String[]{"SPADES", "HEARTS", "CLUBS", "DIAMONDS"};
//    private String[] suitsOfCard = new String[]{"S", "H", "C", "D"};
//
//    private String[] numsOfCard = new String[]{"9", "10", "11", "12", "13", "14"};
//    private String[] ranksOfCard = new String[]{"9", "10", "J", "Q", "K", "A"};
//
//    private int[] groupRanks = new int[6];
//    private List<Integer> groupRanksList = new ArrayList<Integer>();
//
//    private String[] wordList = new String[]{"One pair", "Two pair", "Three of a kind", "Straight", "Flush"
//            , "Full House", "Four of a kind", "Straight Flush", "Royal Straight Flush"};
