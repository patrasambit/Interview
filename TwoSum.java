public class TwoSum {

    static boolean checkPair(int A[], int size, int x){
        for(int i = 0; i < (size-1); i++){
            for(int j = (i + 1); j < size; j++){
                if(A[i] + A[j] == x)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int A[] = { 0, -1, 2, -3, 1};
        int size = A.length;
        int x = -2;

        if(checkPair(A, size, x))
            System.out.println("True");
        else
            System.out.println("No");
    }
}
