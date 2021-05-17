class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals(null)) return 0;
        char[] chars = s.toCharArray();

        //      List<Character> list = Arrays.asList(chars); // this does not compile,
       // List<char[]> asList = Arrays.asList(chars); // because this DOES compile.

        //List<Character> temp = new ArrayList<Character>();
        //for (char c : chars) {
       //     temp.add(c);
        //    
       // }
       // System.out.println("temp  "+ temp.toString());
       //       pwwkwew 
        //    sb    pw
        //  
       // a b c a b c b b
      //  0 1 2 3 4 5 6 7
        
        int res = 0;
       
        /*for(int i = 0; i < s.length(); i++){
             if(!s.contains(String.valueOf(chars[i]))){
                 System.out.println("tempte i yokmuş "+ String.valueOf(chars[i])); 
                 
             }   
        }*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);        
            if(!sb.toString().contains(String.valueOf(c))){   
               
                    sb.append(c);
                    res++;
                    
                    System.out.println("buradayiz selamke  ");
                    System.out.println("char degeri:  " + String.valueOf(c)); 
                    System.out.println("sb nin ici: " + sb.toString());
                    System.out.println("res: " + res);
                     System.out.println("-----------------------------------------");
 
            }
            else{
                    System.out.println("resin 1. hali: " + res);
                    res = sb.length();
                    System.out.println("resin 2. hali: " + res);
                    sb.setLength(0);
                    System.out.println("buradayiz karisti  ");
                    System.out.println("char degeri:  " + String.valueOf(c)); 
                    System.out.println("sb nin ici: " + sb.toString());
                    System.out.println("res: " + res);
                    System.out.println("-----------------------------------------");
            }
        }
         
        return res;
    }
}