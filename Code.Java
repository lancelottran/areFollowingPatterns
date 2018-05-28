boolean areFollowingPatterns(String[] strings, String[] patterns) {
    if(strings.length != patterns.length)
        return false;
    
    HashMap<String, String> dic = new HashMap<String, String>();
    
    for(int i = 0; i<strings.length; i++)
    {
        if(dic.containsKey(patterns[i])){
            if(!(dic.get(patterns[i]).equals(strings[i])))
                return false;
        }
        else if(dic.containsValue(strings[i])){
            return false;
        }
        else{
            dic.put(patterns[i], strings[i]);
        }
    }
    
    return true;
}
