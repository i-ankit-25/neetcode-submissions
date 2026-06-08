class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char ch = board[i][j];
                if(ch == '.'){
                    continue;
                }
                if(rows[i].contains(ch)){
                    return false;
                } else {
                    rows[i].add(ch);
                }
                if(columns[j].contains(ch)){
                    return false;
                } else {
                    columns[j].add(ch);
                }
                if(boxes[i/3 * 3 + j/3].contains(ch)){
                    return false;
                } else {
                    boxes[i/3 * 3 + j/3].add(ch);
                }
            }
        }
        return true;
    }
}
