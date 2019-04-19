package week_3.task_1;

/**
 * Created by it170692gda on 06.03.17.
 */
public class LinkedList {

    private int size = 0;
    private Node header;
    private Node tail;

    public LinkedList() {

    }

    public void add(Integer data) {
        //PUT YOUR CODE HERE
        Node node = new Node();
        node.setData(data);
        if (tail == null) {
            header = node;
            tail = node;
        } else {
            //tail.next = node;
            tail.setNext(node);
            tail = node;
        }
        size++;
        //PUT YOUR CODE HERE
    }


    public Integer get(int index) {
        //PUT YOUR CODE HERE
        if (size() == 0 || index > size()-1 || index < 0) {
            return null;
        }
        Node t = header;
        int i = 0;
        while (i < index) {
            t = t.getNext();
            i++;
        }
        return t.getData();
        //PUT YOUR CODE HERE
    }

    public boolean delete(int index) {
        //PUT YOUR CODE HERE
        if (size() == 0 || index > size()-1 || index < 0) {
            return false;
        }

        if (index == 0) {
            header = header.getNext();
            size--;
            return true;
        }

        Node t = header;
        int i = 0;
        while (i < index-1) {
            t = t.getNext();
            i++;
        }
        if (tail == t.getNext()) {
            tail = t;
        }
        t.setNext(t.getNext().getNext());
        size--;
        return true;
        //PUT YOUR CODE HERE
    }

    public int size() {
        //PUT YOUR CODE HERE
        return this.size;
        //PUT YOUR CODE HERE
    }
}

