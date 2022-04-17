import org.junit.Test;

import static org.junit.Assert.*;

public class
TestCheck {
  @Test(timeout = 4200)
  public void testa() throws Throwable {
    AVLTree avLTREE1 = new AVLTree();
    AVLTree.Node n1 = avLTREE1.find((int) '4');
    AVLTree.Node n2 = avLTREE1.getRoot();
    avLTREE1.delete(103);
    avLTREE1.insert((int) (byte) 13);
    AVLTree.Node n4 = avLTREE1.getRoot();
    avLTREE1.insert((int) (int) 3);

    try {
      avLTREE1.delete(10);
      fail("Null pointer exception expected");
    }
    catch(NullPointerException ignored){
    }
  }

  @Test(timeout = 4200)
  public void testb() throws Throwable {
    try {
      AVLTree avLTREE1 = new AVLTree();
      avLTREE1.insert((-3243));
      avLTREE1.insert(1776);
      avLTREE1.delete(660);
      avLTREE1.insert(3);
      avLTREE1.insert((-792));
      avLTREE1.delete((-792));
      AVLTree.Node aVLTreeND1 = avLTREE1.getRoot();
      avLTREE1.delete((-937));
      AVLTree.Node aVLTreeNode1 = aVLTreeND1.left;
      aVLTreeND1.left = aVLTreeNode1;
      avLTREE1.insert((-453));
      aVLTreeND1.left.key = (-1468);
      aVLTreeND1.height = 392;
      aVLTreeND1.key = (-796);
      aVLTreeNode1.height = (-937);
      aVLTreeND1.height = (-792);
      aVLTreeND1.height = 663;
      aVLTreeND1.key = (-792);
      avLTREE1.insert(392);
      avLTREE1.getBalance(aVLTreeND1);
    }
    catch(NullPointerException ne){
      fail("fail");
    }
  }

  @Test(timeout = 4200)
  public void testC() throws Throwable {
    AVLTree aVLTREE = new AVLTree();
    aVLTREE.insert(13);
    aVLTREE.insert(53);
    aVLTREE.insert(25);
    aVLTREE.insert(83);
    try {
      aVLTREE.delete(53);
      aVLTREE.delete(25);
      aVLTREE.delete(83);
      fail("Null pointer exception occured");
    }catch(NullPointerException ignored){

    }
  }
}

