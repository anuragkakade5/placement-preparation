package Problem_Statment;

import java.util.* ;

// https://chatgpt.com/share/67a4c2d4-d028-8013-aabc-45a1029562c3

public class CubeSumPair {
    
	public static int countCubeSumPairs(int n) {
		// Write your code here.
	if(n==1) return 1;

    ArrayList<Integer> arr = new ArrayList<>();
    int i=0;
    while(i*i*i<=n){
    arr.add(i*i*i);     
      i++;
    }
	int A = arr.size()-1;
	int B =0;
	int count = 0;
	while(B<=A){
		if(arr.get(B)+arr.get(A)==n){
        	if(A==B && A>=1){
              count++;
          	}
        else if(B==0 && A>=1){
            count++;
        }
  		else if(B!=0 && A!=B && A>=1){
      	count+=2;
  }
A--;
B++;
 }    
else if(arr.get(A)+arr.get(B)<n){
    B++;
}
else if(arr.get(A)+arr.get(B)>n){
    A--;
}
}
if(count==0){
    return 0;
}
else{
    return count;
}


	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int result = countCubeSumPairs(n);
        System.out.println("Number of ways to express " + n + " as sum of two cubes: " + result);
    }
}

 // Time complexity: O(n^(3/2))
