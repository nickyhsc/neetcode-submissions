class MyHashMap {
    ArrayList<Integer> keyList;
    ArrayList<Integer> valList;

    //help func-----
    private int getIndex(int key){
        return keyList.indexOf(key);
    }
    //---------------

    public MyHashMap() {
        keyList = new ArrayList<>();
        valList = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(keyList.contains(key)){
            valList.set(getIndex(key), value);
        }else{
            keyList.add(key);
            valList.add(value);
        }
    }
    
    public int get(int key) {
        if(!keyList.contains(key)) return -1;
        return valList.get(getIndex(key));
    }
    
    public void remove(int key) {
        if(keyList.contains(key)){
            int rmInd = getIndex(key);
            keyList.remove(rmInd);
            valList.remove(rmInd);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */