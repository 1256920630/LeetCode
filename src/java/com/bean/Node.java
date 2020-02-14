package com.bean;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public String c;
    public List<Node> nodes;

    public Node(String c) {
        this.c = c;
        nodes = new ArrayList<>();
    }

}
