package graph;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BFSIterator implements Iterator{

    int index;
    private IGraph graph;

    BFSIterator(IGraph _graph) {
        this.graph = _graph;
    }

    @Override
    public boolean hasNext() {
return false;
    }

    @Override
    public Object next() {

        return false;
    }
}
