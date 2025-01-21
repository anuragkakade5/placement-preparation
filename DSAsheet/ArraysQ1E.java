

                    import java.util.*;
                    
                    class Pair {
                        public int min;
                        public int max;
                    }
                    
                    class Main {
                        static Pair getMinMax(int arr[], int n) {

                            Pair minmax = new Pair();
                            Arrays.sort(arr);
                            minmax.min = arr[0];
                            minmax.max = arr[n - 1];
                            return minmax;
                        }
                    
                        public static void main(String[] args) {
                            int arr[] = { 22, 14, 8, 17, 35, 3};
                            int n = arr.length;

                            Pair minmax = getMinMax(arr, n);

                            System.out.println("Minimum element is " + minmax.min);
                            System.out.println("Maximum element is " + minmax.max);
                        }
                    }
              
    

