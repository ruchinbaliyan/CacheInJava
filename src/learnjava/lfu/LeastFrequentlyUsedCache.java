package learnjava.lfu;

import java.util.HashMap;
import java.util.Map;

public class LeastFrequentlyUsedCache implements Cache {
    int cacheSize=0;
    private Node front;
    private  Node back;
    private  Map<Long,Node> map = null;


    public LeastFrequentlyUsedCache(int size) {
        this.cacheSize =size;
        this.map =new HashMap<>();

    }

    public long getValue(long key)
    {
        if( map.get(key) == null)
        {
            return -1;
        }
        Node node = map.get(key);
        removeNode(node);
        node.frequency +=1;
        updateNodeList(node);

        return node.value;


    }

    public int getCurrentCacheSize() {
        return getCacheSize()- map.size();
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void putValue(long key , long value)
    {
        if(map.containsKey(key)){
            Node node = map.get(key);
            map.remove(key);
            removeNode(node);
            node = new Node(key,value,0);
            updateNodeList(node);
            map.put(key,node);

        }
        else {
            if(map.size()>=cacheSize){
                //delete first with least frequnecy
                Node item =map.get(front.key);
                map.remove(front.key);
                System.out.println(item.key + ","+item.value+" is removed due to cache overflow");
                removeNode(front);

            }
            Node node = new Node(key,value,0);
            updateNodeList(node);
            map.put(key,node);

        }
        System.out.println("cache Size remaining is : "+getCurrentCacheSize());

    }
    private void removeNode(Node node)
    {
        if(node.prev != null)
        {
            node.prev.next= node.next;


        }else{
            front = node.next;

        }
        if(node.next !=null)
        {
            node.next.prev =node.prev;

        }
        else{
            back =node.prev;

        }

    }
    private void updateNodeList(Node node)
    {
        if(back!=null && front!=null)
        {
             Node temp =front;
             while(temp!= null )
             {
                 if(temp.frequency > node.frequency){
                     if(temp ==front)
                     {
                         node.next = front;
                         temp.prev = node;
                         front = node;
                         break;

                     }
                     else{
                         node.next = temp;
                         temp.prev = node;
                         temp.prev.next = node;
                         node.prev = temp.prev;
                     }
                 }
                 else{
                     temp= temp.next;
                     if(temp == null){
                         back.next = node;
                         node.prev =back;
                         back =node;
                         node.next = null;
                         break;
                     }
                 }
             }

        }
        else{
            front=node;
            back=front;

        }

    }

}
