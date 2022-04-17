import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class
CustomTest {
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node2 = aVLTree0.find((int) '4');
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete(103);
    aVLTree0.insert((int) (byte) 13);
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int) (short) 3);

    try {
      aVLTree0.delete(10);
      fail("Expecting null pointer exception");
    }catch(NullPointerException ignored){

    }
  }

  @Test(timeout = 4000)
  public void test00() throws Throwable {
    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert((-3243));
    aVLTree0.insert(1776);
    aVLTree0.delete(660);
    aVLTree0.insert(3);
    aVLTree0.insert((-792));
    aVLTree0.delete((-792));
    AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
    aVLTree0.delete((-937));
    AVLTree.Node aVLTree_Node1 = aVLTree_Node0.left;
    aVLTree_Node0.left = aVLTree_Node1;
    aVLTree0.insert((-453));
    aVLTree_Node0.left.key = (-1468);
    aVLTree_Node0.height = 392;
    aVLTree_Node0.key = (-796);
    aVLTree_Node1.height = (-937);
    aVLTree_Node0.height = (-792);
    aVLTree_Node0.height = 663;
    aVLTree_Node0.key = (-792);
    aVLTree0.insert(392);
    aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test009() throws Throwable {
    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(13);
    aVLTree0.insert(53);
    aVLTree0.insert(25);
    aVLTree0.insert(83);
    try {
      aVLTree0.delete(53);
      aVLTree0.delete(25);
      aVLTree0.delete(83);
      fail("Null pointer exception");
    }catch(NullPointerException ignored){

    }
  }
}

