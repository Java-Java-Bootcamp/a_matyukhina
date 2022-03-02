public class Anagram {
    public boolean check(String first, String second) {
        char[] left = first.toLowerCase().toCharArray();
        char[] right = second.toLowerCase().toCharArray();

        int leftCounter = 0;
        int rightCounter = 0;

        for (int i = 0; i < left.length; i++) {
            if (left[i] != ' ') {
                leftCounter++;
            }
        }

        for (char c : right) {
            if (c != ' ') {
                rightCounter++;
            }
        }

        if (leftCounter != rightCounter) {
            return false;
        }
        boolean [] leftBool = new boolean[left.length];
        boolean [] rightBool = new boolean[right.length];
        for(int i = 0; i < left.length; i++){
            for(int j = 0; j < right.length; j++){
                if(left[i] == right[j] && !rightBool[j]){
                    leftBool[i] = true;
                    rightBool[j] = true;
                    break;
                }
            }
        }
        boolean ann = true;
        for(int i = 0; i< leftBool.length; i++){
            if(!leftBool[i]){
                ann = false;
            }
        }
        return ann;
    }
}
