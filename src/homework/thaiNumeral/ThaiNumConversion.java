package homework.thaiNumeral;

/**
 * Created by thatchai on 12/8/15.
 */
public class ThaiNumConversion {
    public static void main (String[] args) {
        System.out.println(new ThaiNumConversion().convert(args[0]));
    }


    //1
    //9
    //10
    //11
    //12
    //20
    //21
    //30
    //31
    //32
    //100
    //101
    //110

    public String convert(String numString){
        int num = Integer.parseInt(numString);
        StringBuilder sb = new StringBuilder();
        int times = 0;

        String[] numInThai = new String[] { "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด","แปด", "เก้า", "สิบ", "ยี่สิบ"/*, "สิบเอ็ด"*/ };
        int[] ints = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20/*, 11*/ };

        String[] digitsInThai = new String[] { "", "", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน"};

        for (int i = ints.length - 1; i >= 0; i--) {
            times =  num/ ints[i];
            num %= ints[i];
            while (times > 0) {
                if(numString.length() > 1 && ints[i]==1 && num == 0){
                    sb.append("เอ็ด");
                }else{
                    sb.append(numInThai[i]);
                }

                times--;
            }
        }
        return sb.toString();
    }
}
