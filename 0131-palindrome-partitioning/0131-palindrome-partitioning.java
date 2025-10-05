class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> output = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        pp(0, ds, output, s);
        return output;
    }
    public boolean cp(String str, int i, int j){
        while(i <= j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public void pp(int idx, List<String> ds, List<List<String>> output, String str){
        if(idx == str.length()){
            output.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i < str.length(); i++){
            if(cp(str, idx, i)){
                ds.add(str.substring(idx, i + 1));
                pp(i+1, ds, output, str);
                ds.remove(ds.size()-1);
            }
        }
    }
}