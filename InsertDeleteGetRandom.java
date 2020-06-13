class RandomizedSet {

    /** Initialize your data structure here. */
    List<Integer> nums;
    Map<Integer,Integer> positions;
    public RandomizedSet() {
    nums=new ArrayList();
    positions=new HashMap();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
      if(positions.containsKey(val))
          return false;
      nums.add(val);
     positions.put(val,nums.size()-1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!positions.containsKey(val))
            return false;
        int pos=positions.get(val);
        nums.set(pos,nums.get(nums.size()-1));
        positions.put(nums.get(pos),pos);
        nums.remove(nums.size()-1);
        positions.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
       return nums.get((int)(Math.random()*nums.size())); 
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */