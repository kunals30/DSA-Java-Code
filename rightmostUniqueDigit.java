class rightmostUniqueDigit{

    static int rightMost(int[] arr, int n){
        for(int i=n-1; i>=0; i--){
            boolean isUnique = true;
            for(int j=0; j<n; j++){
                if(arr[j] == arr[i] && i != j){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique == true){
                return arr[i];
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,4,4};

        int result = rightMost(arr, 7);

        System.out.println("The rigthmost unique number in array:"+ result);
    }
}