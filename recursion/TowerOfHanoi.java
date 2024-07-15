class TowerOfHanoi{
    public static void main(String[] args) {
        towerHanoi(3,'A','B','C');
    }
    public static void towerHanoi(int n, char start, char mid, char end){
        if(n==1){
            System.out.println("Move block form "+start+" to "+end);
            return;
        }
        towerHanoi(n-1, start, end, mid);
        System.out.println("Move block from "+start+" to "+end);
        towerHanoi(n-1, mid, start, end);
    }
}