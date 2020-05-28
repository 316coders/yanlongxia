public class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0;i<J.length();i++)
        {
            String a = J.substring(i,i+1);
            for (int j = 0;j<S.length();j++){
                String b = S.substring(j,j+1);
                if(a.equals(b))
                    result++;
            }
        }
        J.substring(0,1);
        return result;
    }
}

