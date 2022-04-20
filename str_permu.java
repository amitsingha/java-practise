public class str_permu {

    public static void stringPermutation(String str, String permutation){
        //System.out.println("Out loop : "+str);
        if (str.length() == 0) {
            System.out.println(permutation);
        }

        for (int i = 0; i < str.length(); i++) {
            //System.out.println(i+str);
            char c = str.charAt(i);
            String s = str.substring(0,i) + str.substring(i+1);
            //System.out.println("c : "+c+i+" S : "+s);
            //return;
            //System.out.println("Before function: "+permutation);
            stringPermutation(s, permutation+c);
            //System.out.println("After funtion: "+i);
        }
        //System.out.println("Out world!");
    }
    public static void main(String[] args) {
        stringPermutation("abc", "");
    }
}
