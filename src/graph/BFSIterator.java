package graph;

import java.util.*;

// parcours en largeur
public class BFSIterator implements Iterator{

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
        return !file.isEmpty();
    }

    @Override
    public Object next() {
        addNeighboursNodes(); // neighbours in file
        return file.pop(); // return first element
    }

    private boolean isAlreadyDone(Node n) {
        for (Node tmp : alreadySeenNode) {
            if (tmp.getID() == n.getID()) {
                return true;
            }
        }
        return false;
    }

    private void addNeighboursNodes() {
        for (Node friend : graph.getAdjNodes(file.peekFirst())) {
            if (!isAlreadyDone(friend)) {
                file.addLast(friend);
                alreadySeenNode.add(friend);
            }
        }
    }
}
