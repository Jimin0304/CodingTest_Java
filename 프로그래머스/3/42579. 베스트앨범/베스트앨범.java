import java.util.*;

class Solution {
    class Music {
        private int index;
        private int play;
        private String genre;
        private int genreTotalPlay;
        
        public Music(int index, int play, String genre, int genreTotalPlay) {
            this.index = index;
            this.play = play;
            this.genre = genre;
            this.genreTotalPlay = genreTotalPlay;
        }
        
        public int getIndex() { return this.index; }
        public int getPlay() { return this.play; }
        public String getGenre() { return this.genre; }
        public int getGenreTotalPlay() { return this.genreTotalPlay; }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        Music[] arr = new Music[genres.length];
        
        // 각 장르별 총 재생 수
        for (int i = 0; i < genres.length; i++) {
            if (map.containsKey(genres[i])) {
                int cnt = map.get(genres[i]);
                map.put(genres[i], cnt + plays[i]);
            }
            else {
                map.put(genres[i], plays[i]);
            }
        }
        
        // music 정보 따로 저장 후 정렬
        for (int i = 0; i < genres.length; i++) {
            arr[i] = new Music(i, plays[i], genres[i], map.get(genres[i]));
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.getGenreTotalPlay() == o2.getGenreTotalPlay()) {
                if (o1.getPlay() == o2.getPlay())
                    return o1.getIndex() - o2.getIndex();
                return o2.getPlay() - o1.getPlay();
            }
            return o2.getGenreTotalPlay() - o1.getGenreTotalPlay();
        });
        
        // 한 장르 당 2개까지
        List<Integer> result = new ArrayList<>();
        String now = arr[0].getGenre();
        int cnt = 1;
        result.add(arr[0].getIndex());
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getGenre().equals(now) && cnt < 2) {
                result.add(arr[i].getIndex());
                cnt++;
            }
            else if (!arr[i].getGenre().equals(now)) {
                now = arr[i].getGenre();
                cnt = 1;
                result.add(arr[i].getIndex());
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}