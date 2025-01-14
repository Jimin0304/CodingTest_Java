import java.util.Arrays;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {
            String[] fileA = splitFileName(o1);
            String[] fileB = splitFileName(o2);
            
            int headCompare = fileA[0].compareTo(fileB[0]);
            if (headCompare != 0)
                return headCompare;
            
            return Integer.parseInt(fileA[1]) - Integer.parseInt(fileB[1]);
        });
        
        return files;
    }
    
    public String[] splitFileName(String name) {
        String[] file = new String[2];
        file[0] = name.split("\\d")[0].toUpperCase();
        file[1] = name.split("\\D+")[1];
        
        return file;
    }
}