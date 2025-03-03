package algprg;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.prepend(10);
        list.prepend(5);
        list.append(20);
        list.prepend(30);
        list.append(20);
        list.append(25);

        System.out.println("Find 20: " + list.find(20));

        LinkedList.LinkedElement e = list.start;
        System.out.println("\n\r");
        do {
            System.out.println(e);
            e = e.next;
        } while (e != null);

        list.removeVal(20);

        e = list.start;
        System.out.println("\n\r");
        do {
            System.out.println(e);
            e = e.next;
        } while (e != null);
    }
}

class LinkedList {
    public LinkedElement start;

    public void prepend(int val) {
        start = new LinkedElement(val, start);
    }

    public void append(int val) {
        if (start == null) {
            start = new LinkedElement(val, null);
        } else {
            LinkedElement e = start;
            while (e.next != null) {
                e = e.next;
            }
            e.next = new LinkedElement(val, null);
        }
    }

    public LinkedElement find(int val) {
        LinkedElement e = start;
        do {
            if (e.value == val) return e;
            e = e.next;
        }
        while (e != null && e.value != val);
        return e;
    }

    public void removeVal(int val) {
        LinkedElement e = start;
        LinkedElement prev = null;

        if (e == null) return;
        do {
            if (e.value == val) {
                if (prev != null) {
                    prev.next = e.next;
                }
            }
            prev = e;
            e = e.next;
        } while (e != null);
    }

    static class LinkedElement {
        public LinkedElement next;
        public int value;

        public LinkedElement(int val, LinkedElement linkTo) {
            value = val;
            next = linkTo;
        }

        @Override
        public String toString() {
            return "LinkedElement{" +
                    "next=" + (next != null ? "hashCode:"+next.hashCode() : "null") +
                    ", value=" + value +
                    '}';
        }
    }
}