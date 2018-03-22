package graph;

import java.util.Iterator;
import java.util.List;

public class UndirectedGraph implements IUndirectedGraph{
    private Graph graph;

    public UndirectedGraph() {
        this.graph = new Graph();
    }

    @Override
    public void addEdge(Node _node1, Node _node2) {
        Arc arc1 = new Arc(_node1,_node2,null);
        Arc arc2 = new Arc(_node2,_node1,null);
        graph.addArc(arc1);
        graph.addArc(arc2);
    }

    @Override
    public boolean hasEdge(Node _node1, Node _node2) {
        return graph.hasArc(_node1, _node2);
    }

    @Override
    public void addNode(Node _node) {
        graph.addNode(_node);
    }

    @Override
    public List<Node> getAllNodes() {
        return graph.getAllNodes();
    }

    @Override
    public int getNbNodes() {
        return graph.getNbNodes();
    }

    @Override
    public List<Node> getAdjNodes(Node _n) {
        return graph.getAdjNodes(_n);
    }

    @Override
    public Iterator<Node> creerBFSIterator(Node n) {
        return new BFSIterator(this.graph);
    }

    @Override
    public String toString() {
        return graph.toString();
    }
}
