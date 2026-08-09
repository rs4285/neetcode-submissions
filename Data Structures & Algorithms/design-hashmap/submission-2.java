class MyHashMap {
    
    int[] map;
    boolean[]  exsists;
    public MyHashMap() {
        map = new int[10000001];
        exsists = new boolean[10000001];
    }
    
    public void put(int key, int value) {
        map[key] = value;
        exsists[key] = true;
    }
    
    public int get(int key) {
        if(exsists[key]){
            return map[key];
        }
        return -1;
    }
    
    public void remove(int key) {
        exsists[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */