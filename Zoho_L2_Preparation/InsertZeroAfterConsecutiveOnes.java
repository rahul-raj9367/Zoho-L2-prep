/*
Insert 0 after consecutive (K times) of 1 is found
*/
class InsertZeroAfterConsecutiveOnes {
	  public static String insertZeroAfterConsecutiveOnes(String input, int k) {
        StringBuilder result = new StringBuilder();
        int countConsecutiveOnes=0;

        for(char ch:input.toCharArray()){
            if(ch=='1'){
                countConsecutiveOnes++;
                result.append(ch);
                if(countConsecutiveOnes==k){
                    result.append('0');
                    countConsecutiveOnes=0;
                }
            }else{
                result.append(ch);
                countConsecutiveOnes=0;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "1100011111000111";
        int k = 3;    //110001110110001110
        String output = insertZeroAfterConsecutiveOnes(input, k);
        System.out.println(output); 
    }
}