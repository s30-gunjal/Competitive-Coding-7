class Logger {
    HashMap< String, Integer> map;
    public Logger() {
        map= new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(map.containsKey(message)){
            if(map.get(message) <= timestamp){
                map.put(message, timestamp+10);
                return true;
            }
            else return false;
        }
        map.put(message, timestamp+10);
        return true;
    }
}
//time- O(1) for every print
//space- O(n)
