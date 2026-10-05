class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int curr = 0;
        for(int i=0; i<operations.length; i++){
            boolean isNum = true;
            int num = 0;
            try{
                num = Integer.parseInt(operations[i]);
            }catch(NumberFormatException e){
                isNum = false;
            }

            if(isNum){
                scores[curr] = num;
                curr++;
            }else{
                switch(operations[i]){
                    case "+":
                        scores[curr] = scores[curr-1] + scores[curr-2];
                        curr++;
                        break;
                    case "D":
                        scores[curr] = scores[curr-1]*2;
                        curr++;
                        break;
                    case "C":
                        curr--;
                        break;
                }
            }
        }
        int totalSum = 0;
        for(int i=0; i<curr; i++){
            totalSum += scores[i];
        }
        return totalSum;
    }
}