package kocamanUğurlu;


import javax.swing.JButton;
import javax.swing.JLabel;

//actions:
//0=> do nothing
//1=> +10 points
//2=> -5 points
//3=> big prize
class Cell<T> {

    T action;
    Cell<T> next;
    Cell<T> prev;
    Cell<T> altCell;

    JButton btn;
    JLabel lbl;

    public Cell(T action) {
        this.action = action;
        next = null;
        prev = null;
        altCell = null;

    }

}

public class KocamanUğurlu_CellList<T> {

    Cell<T> head;
    Cell<T> tail;
    int size = 0;


    public KocamanUğurlu_CellList() {
        this.head = null;
        this.tail = null;

        this.size = 0;
    }

    public Cell<T> get(int index) {
        Cell<T> temp = head;
        

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void add(T action) {
        Cell<T> newCell = new Cell<>(action);
        if (head == null) {
            head = newCell;
            tail = newCell;

            size++;
            return;
        }
        tail.next = newCell;
        newCell.prev = tail;
        tail = newCell;

        size++;
    }

    public void fillrandom() {

        add((T)Integer.valueOf(0));
        for (int i = 0; i < 31; i++) {
            add((T)Integer.valueOf((int)(Math.random()*3)));
        }

    }

    public void addMovers() {
        this.get(3).altCell = this.get(8);
        this.get(6).altCell = this.get(4);
        this.get(9).altCell = this.get(13);
        this.get(11).altCell = this.get(5);
        this.get(14).altCell = this.get(17);
        this.get(18).altCell = this.get(8);
        this.get(20).altCell = this.get(26);
        this.get(23).altCell = this.get(19);
        this.get(27).altCell = this.get(22);
        this.get(28).altCell = this.get(30);

    }

    public T getAction(int index) {

        if (index == 1) {
            return head.action;
        }
        Cell<T> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp.action;

    }

}
