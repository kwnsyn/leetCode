class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = false;
        String[] ransomNoteArr = ransomNote.split("");
        String[] magazineArr = magazine.split("");
        
        for(int i=0; i<ransomNoteArr.length; i++) {
            for(int j=0; j<magazineArr.length; j++) {
                if(ransomNoteArr[i].equals(magazineArr[j])) {
                    ransomNoteArr = removeElement(ransomNoteArr, i);
                    magazineArr = removeElement(magazineArr, j);
                    i-=1;
                    break;
                }
            }
            
            if(ransomNoteArr.length == 0) {
                result = true;
                break;
            }
        }
        
        return result;
    }
    
    private static String[] removeElement(String[] array, int index) {
        String[] copyArr = new String[array.length - 1];
        
        System.arraycopy(array, 0, copyArr, 0, index);
        System.arraycopy(array, index +1, copyArr, index, array.length-1-index);
        
        return copyArr;
    }
}