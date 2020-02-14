package com.code;

import com.bean.Node;

import java.util.ArrayList;
import java.util.List;

public abstract class LeetCode {
    //用于临时存储路径
    private StringBuilder sb = new StringBuilder();
    private List<String> res = new ArrayList<>();

    //生成根节点
    private Node root = new Node("");

    /**
     * 遍历树
     *
     * @param digits 数字
     * @return
     */
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        char[] chars = digits.toCharArray();
        List<List<String>> lists = new ArrayList<>();
        for (char c : chars) {
            //获取节点
            List<String> char2String = char2String(c);
            if(char2String!=null){
                lists.add(char2String);
            }
        }

        if(lists.size()>0){
            //生成树
            tree(root, lists, 0);
        }

        return ergodicTree(root);
    }

    //遍历树
    private List<String> ergodicTree(Node tree) {
        getCode(tree, tree.c, sb);
        return res;
    }

    private void getCode(Node node, String str, StringBuilder sb) {

        StringBuilder stringBuilder = new StringBuilder(sb);
        stringBuilder.append(str);

        if (node.nodes.size() > 0) {
            for (Node n : node.nodes) {
                getCode(n, n.c, stringBuilder);
            }
        } else {
            res.add(stringBuilder.toString());
        }

    }

    //生成树
    private void tree(Node node, List<List<String>> lls, int index) {

        List<String> cl = lls.get(index);
        for (String c : cl) {
            node.nodes.add(new Node(c));
        }
        index++;
        if (index < lls.size()) {
            for (Node n : node.nodes) {
                tree(n, lls, index);
            }
        }
    }

    //可以使用数据库 动态修改
    public abstract List<String> char2String(char c);


}
