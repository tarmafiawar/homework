package homework.thaiNumeral2;

/**
 * Created by thatchai on 12/8/15.
 */
//compile  : shift + cmd + fn + F9
//java -cp /Users/taro/homework/out/production/HomeWork/ homework.thaiNumeral2.ThaiNumConversion2 2014

public class ThaiNumConversion2 {
    public static void main(String[] num) throws NumberFormatException {
        System.out.println(new ThaiNumConversion2().convert(num[0]));
    }

    String[] prefixAndSuffixDigit = new String[]{"", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า"};
    String[] wordEachDigit = new String[]{"", "", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน"};

    public String convert(String numString) throws NumberFormatException {
        int beforePoint = 0;
        int afterPoint = 0;
        String beforePointString = "";
        String afterPointString = "";
        try{
            if(numString.contains(".")){
                beforePointString = numString.substring(0, numString.indexOf("."));
                afterPointString = numString.substring(numString.indexOf(".")+1);
                beforePoint = Integer.parseInt(beforePointString);
                afterPoint = Integer.parseInt(afterPointString);

            }else{
                beforePoint = Integer.parseInt(numString);
                beforePointString = numString;
            }

        }catch(NumberFormatException ex){
//            throw new NumberFormatException("Please specific int value.");
            return "Please specific int value.";
        }

        if(afterPoint>99)
//            throw new NumberFormatException("Decimal is more than 99.");
            return "Decimal can not more than 99.";

        StringBuilder sb = new StringBuilder();
        boolean isMinus = false;
        if(beforePointString.startsWith("-")){
            beforePointString = beforePointString.replace("-","");
            isMinus = true;
        }

        int lengthOfBefore = beforePointString.length();
        int lengthOfAfter = afterPointString.length();

        int firstDigitOfBefore = Integer.parseInt(beforePointString.substring(0, 1));
        int otherDigitOfBefore = beforePointString.length() > 1 ? Integer.parseInt(beforePointString.substring(1)) : Integer.parseInt(beforePointString);

        if(beforePoint == 0)
            return new String("ศูนย์บาท");

        if(lengthOfBefore >= 8){
            String wordForEach = (firstDigitOfBefore == 0) ? "" : wordEachDigit[lengthOfBefore%6];
            sb.append(prefixAndSuffixDigit[firstDigitOfBefore]).append(wordForEach).append(convert(String.valueOf(otherDigitOfBefore)));

        }else if(lengthOfBefore >= 3){
            String wordForEach = (firstDigitOfBefore == 0) ? "" : wordEachDigit[lengthOfBefore];

            sb.append(prefixAndSuffixDigit[firstDigitOfBefore]).append(wordForEach).append(convert(String.valueOf(otherDigitOfBefore)));
        }else if(lengthOfBefore == 2){//หลักสิบ
            String wordForEach = (firstDigitOfBefore == 0) ? "" : wordEachDigit[lengthOfBefore];
            String lastWord = prefixAndSuffixDigit[otherDigitOfBefore];

            sb.append(prefixAndSuffixDigit[firstDigitOfBefore]).append(wordForEach).append(lastWord);
        }else if(lengthOfBefore == 1){//หลักหน่วย
            sb.append(prefixAndSuffixDigit[otherDigitOfBefore]);

        }

        if(!sb.toString().contains("บาท"))
            sb.append("บาท");

        if(!afterPointString.isEmpty()){
            int firstDigitOfAfter = Integer.parseInt(afterPointString.substring(0, 1));
            int otherDigitOfAfter = afterPointString.length() > 1 ? Integer.parseInt(afterPointString.substring(1)) : Integer.parseInt(afterPointString);

            if(lengthOfAfter == 2){//หลักสิบ
                String wordForEach = (firstDigitOfAfter == 0) ? "" : wordEachDigit[lengthOfAfter];
                String lastWord = prefixAndSuffixDigit[otherDigitOfAfter];

                sb.append(prefixAndSuffixDigit[firstDigitOfAfter]).append(wordForEach).append(lastWord);
            }else if(lengthOfAfter == 1){//หลักหน่วย
                sb.append(prefixAndSuffixDigit[otherDigitOfAfter]);

            }

            sb.append("สตางค์");
        }

        return (isMinus ? "ลบ" : "") + sb.toString().replace("สองสิบ", "ยี่สิบ").replace("สิบหนึ่ง","สิบเอ็ด").replace("หนึ่งสิบ","สิบ");
    }
}
