package Java_Coding_Questions;

public class Ques1 {
    static void main() {

        //find first non-repeating character in a String
        String name = "wiiwssdom";
        //output = i
        char[] arr = name.toCharArray();

        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("The first non repeating char is: "+arr[i]);
                break;
            }
        }

        // Find duplicate element in array
        int[] numArr = {10,78,91,10,91};

        for(int i=0;i<numArr.length;i++){
            int count = 0;
            for(int j=0;j<numArr.length;j++) {
                if (numArr[i] == numArr[j]) {
                    count++;
                }
                if (count > 1) {
                    System.out.println("Duplicate element is: " + numArr[i]);
                    break;
                }
            }
        }
    }
}
