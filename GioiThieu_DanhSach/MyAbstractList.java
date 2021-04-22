
public abstract class MyAbstractList<E> implements MyList<E> {
    public int size = 0;
    public MyAbstractList() {

    }
    public MyAbstractList(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(i, objects[i]);
        }
    }

    @Override
    public void add(E e){
        add(size, e);
    } 

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override 
    public boolean remove(E e) {
        if ( indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }
}
