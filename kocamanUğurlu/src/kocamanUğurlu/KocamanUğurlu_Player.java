package kocamanUğurlu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ahmet
 */
public class KocamanUğurlu_Player implements Comparable<KocamanUğurlu_Player>{
    private String name;
    private String level;
    private int score;
    
public KocamanUğurlu_Player(String name,String level,int score){
    this.name=name;
    this.level=level;
    this.score=score;
}public KocamanUğurlu_Player(String name){
    this.name=name;
    this.level=null;
    this.score=0;
}

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(KocamanUğurlu_Player o) {
        return Integer.compare(this.score, o.score);
    }

}

