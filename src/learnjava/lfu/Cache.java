package learnjava.lfu;

public interface Cache {

    public long getValue(long key);
    public void putValue(long key,long value);
    public int getCurrentCacheSize();
    public int getCacheSize();

}
