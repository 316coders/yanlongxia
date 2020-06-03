class Solution2{
	 public List<String> generateParenthesis(int n)
{
 List<String> list = new LinkedList();
        dfs(list, new char[n * 2], n, n, 0, ' ');
        return list;
    }
    private void dfs(List<String> list, char[] chars, int left, int right, int index,char temp){
        if (left > right) return;
        if (left == 0 && right == 0) list.add(new String(chars));
        if (left > 0) dfs(list, chars, left - 1, right, index + 1, chars[index] = '(');
        if (right > 0) dfs(list, chars, left, right - 1, index + 1, chars[index] = ')');
    }
}