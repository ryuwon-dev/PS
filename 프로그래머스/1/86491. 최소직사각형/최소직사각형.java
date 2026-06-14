class Solution {
    public int solution(int[][] sizes) {
        int maxLongSide = 0;
        int maxShortSide = 0;

        for (int[] size : sizes) {
            int longSide = Math.max(size[0], size[1]);
            int shortSide = Math.min(size[0], size[1]);

            maxLongSide = Math.max(maxLongSide, longSide);
            maxShortSide = Math.max(maxShortSide, shortSide);
        }

        return maxLongSide * maxShortSide;
    }
}

// 입력이 들어오면 세로길이, 가로길이 측정