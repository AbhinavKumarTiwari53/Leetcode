class Solution {
    public int maximumLength(String s) {
        s+='-';
        Map<String, Integer> cnt = new TreeMap<String, Integer>();
        int ind=0;
        StringBuilder toAdd=new StringBuilder("");
        while(ind+1<s.length()){
            if(s.charAt(ind)!=s.charAt(ind+1)){
                toAdd.append(s.charAt(ind));
                cnt.put(toAdd.toString(), cnt.getOrDefault(toAdd.toString(), 0)+1);
                toAdd=new StringBuilder("");
            }else{
                toAdd.append(s.charAt(ind));
            }
            ind+=1;
        }
        List<String> lis = cnt.keySet().stream().collect(Collectors.toList());
        int ans=0;
        for(int i=0; i<lis.size(); i++){
            int occur=cnt.get(lis.get(i));
            if(occur>=3){
                if(ans<lis.get(i).length()){
                    ans=lis.get(i).length();
                }
            }else if(occur==2){
                if(ans<lis.get(i).length()-1){
                    ans=lis.get(i).length()-1;
                }
            }else{
                if(i+1<lis.size()){
                    if(lis.get(i+1).startsWith((lis.get(i).charAt(0))+"")){
                        if(lis.get(i).length()>ans){
                            ans=lis.get(i).length();
                        }
                    }else{
                        if(lis.get(i).length()>=3){
                            if(lis.get(i).length()-2>ans){
                                ans=lis.get(i).length()-2;
                            }
                        }
                    }
                }else{
                    if(lis.get(i).length()>=3){
                        if(lis.get(i).length()-2>ans){
                            ans=lis.get(i).length()-2;
                        }
                    }
                }
            }
        }
        return ans<=0?-1:ans;
    }
}