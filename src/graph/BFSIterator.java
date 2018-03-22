package graph;

import java.util.*;

// parcours en largeur
public class BFSIterator implements Iterator{

    Node currentNode = null;
    private IGraph graph;
    ArrayList<Node> alreadySeenNode = new ArrayList<>();
    LinkedList<Node> file = new LinkedList<>();

    BFSIterator(IGraph _graph, Node _node) {
        this.graph = _graph;
        this.alreadySeenNode.add(_node);
        file.push(_node);
    }

    @Override
    public boolean hasNext() {
        for (Node friend : graph.getAdjNodes(file.peekFirst())) {
            if (!isAlreadyDone(friend)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object next() {
        return false;
    }

    private boolean isAlreadyDone(Node n) {
        for (Node tmp : alreadySeenNode) {
            if (tmp == n) {
                return true;
            }
        }
        return false;
    }
}
