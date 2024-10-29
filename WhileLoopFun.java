public class WhileLoopFun {

    public WhileLoopFun() {
    }
    public void printDigits(int number) {
        String numberToString = String.valueOf(number);
        int numberLength = numberToString.length();
        while(numberLength > 0){
            System.out.println(numberToString.substring(numberLength - 1, numberLength));
            numberLength --;
        }
    }  
    public int countLetter(String word, String letter) {
        int wordLength = word.length();
        int letterCount = 0, currentLetter = 0;
        while(currentLetter < wordLength){
            if(word.substring(currentLetter, currentLetter + 1).equals(letter)){
                letterCount ++;
            }
        currentLetter ++;
        }
        return letterCount;
    }  

    public int maxDoubles(int number, int threshold) {
        int max = number, count = 0;
        while(max * 2 <= threshold){
            max = max * 2;
            count ++;
        }
        return count;
    }  

    public boolean isPrime(int number) {
        int numberCount = 2;
        if(number == 1){
            return false;
        }
        while(numberCount < number){
            if(number % numberCount == 0){
                return false;
            }
            numberCount ++;
        } 
        return true;
    }  
}
