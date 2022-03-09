package lesson25;
import java.util.regex.Pattern;

public class Main {
    private static Pattern createRegexPattern(String listString) {
//        String regexString = "1234|12345";
        String regexString = listString.replace(",", "|");
        return Pattern.compile(regexString);
    }

    private static boolean isMsisdnValid(String msisdn) {
        if (msisdn == null) return false;
        return Pattern.compile("(70|77|55|99)[0-9]{7}").matcher(msisdn).matches();
    }

    public static void main(String[] args) {
        Pattern blacklistPattern = createRegexPattern("702034567, 504568734,709873625");

        String[]msidns = {"505067843","505982345","709064736","709453647","505968745","702034567"};
        String whiteList = "505982345,709064736,709453647";
        Pattern whiteListPattern = createRegexPattern(whiteList);
        boolean isWhiteListEmpty = whiteList == null || whiteList.isEmpty();
//        System.out.println(blacklistPattern.matcher("123456").lookingAt());
        for(int i = 0; i < msidns.length; i++){
            if(blacklistPattern.matcher(msidns[i]).lookingAt() && !((whiteListPattern.matcher(msidns[i]).lookingAt())||isWhiteListEmpty)) {
                System.out.println(msidns[i] + " нельзя продавать.");
            }else{
                System.out.println(msidns[i] + " можно продавать");
            }
        }
//        for(int i = 0; i < msidns.length; i++){
//            if(whiteListPattern.matcher(msidns[i]).lookingAt()){
//                System.out.println(msidns[i] + " можно продавать");
//            }else{
//                System.out.println(msidns[i] + " нельзя продавать");
//            }
//        }

    }

}