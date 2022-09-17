class Solution {
    public int romanToInt(String s) {
        String[] romanArr = s.split("");
        int sum = 0;
        
        for (int i=0; i<romanArr.length; i++) {
            int temp1 = trans(romanArr[i]);
            int temp2 = 0;
            
            if (i<romanArr.length-1) {
                temp2 = trans(romanArr[i+1]);
            }
            
            if(temp1 < temp2) {
                sum += temp2 - temp1;
                i++;
            } else {
                sum += temp1;
            }
        }
        
        return sum;
    }
    
    private int trans(String s) {
        
        int roman = 0;
        
        switch(s.toUpperCase()) {
            case "I": roman = 1; break;
            case "V": roman = 5; break;
            case "X": roman = 10; break;
            case "L": roman = 50; break;
            case "C": roman = 100; break;
            case "D": roman = 500; break;
            case "M": roman = 1000; break;
        }
        
        return roman;
    }
}