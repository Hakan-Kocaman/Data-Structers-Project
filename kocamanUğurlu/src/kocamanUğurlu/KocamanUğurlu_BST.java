package kocamanUğurlu;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


/**
 *
 * @author ahmet
 * @param <T>
 */
public class KocamanUğurlu_BST <T extends Comparable<T>> {
    KocamanUğurlu_BSTNode <KocamanUğurlu_Player> root;

    public KocamanUğurlu_BST(KocamanUğurlu_BSTNode<KocamanUğurlu_Player> root) {
        this.root = root;
    }
    
    
    
    void insert(KocamanUğurlu_Player newData){
        KocamanUğurlu_BSTNode<KocamanUğurlu_Player> newNode=new KocamanUğurlu_BSTNode(newData);
        if(root==null){
            root=newNode;
        }else{
            KocamanUğurlu_BSTNode <KocamanUğurlu_Player> temp =root;
            
            while(temp!=null){
                if(newData.compareTo(temp.data)>0){
                    if(temp.right==null){
                        temp.right=newNode;
                        return;
                    }
                    temp=temp.right;
                      
                }
                else if(newData.compareTo(temp.data)<0){
                    if(temp.left==null){
                        temp.left=newNode;
                        return;
                    }
                    temp=temp.left;
                      
                }else{
                    return;
                }
            }
        }
    }
    void traverseInOrder(KocamanUğurlu_BSTNode<KocamanUğurlu_Player> node , KocamanUğurlu_CellList<KocamanUğurlu_Player> list){
        
    if (node == null) {
        return;
    }

   
    traverseInOrder(node.left, list);

 
    list.add(node.data);

    
    traverseInOrder(node.right, list);
    }
    KocamanUğurlu_Player findMin(){
        
        if(root==null){return null;}
        KocamanUğurlu_BSTNode <KocamanUğurlu_Player> temp = root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.data;
        
    }
    KocamanUğurlu_Player findMax(){
        if(root==null){return null;}
        KocamanUğurlu_BSTNode <KocamanUğurlu_Player> temp = root;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp.data;
        
    }
}
