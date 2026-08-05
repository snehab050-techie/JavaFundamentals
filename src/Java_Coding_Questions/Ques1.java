package Java_Coding_Questions;

//find first non-repeating character in a String
public class Ques1 {
    static void main() {
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
    }
}
