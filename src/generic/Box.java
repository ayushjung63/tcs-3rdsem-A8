package generic;

public class Box<T> {

    T data;

    public void add(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}
