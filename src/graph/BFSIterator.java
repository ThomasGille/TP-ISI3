package graph;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BFSIterator implements Iterator{

    int index;
    private Map<Node,List<Arc>> adjacence;

    BFSIterator(Map<Node,List<Arc>> map) {
        this.adjacence = map;
    }

    @Override
    public boolean hasNext() {
        return adjacence.get(index).size() >= 0;
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return adjacence.get(index++);
        }
        return null;
    }
}
