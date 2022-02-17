import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
   public List<Object> list;
   @BeforeEach
   public void setUP(){
       list = new MyArrayList<>();
       for (int i = 0 ; i <100 ;i++){
           list.add(new Object());
       }
   }
    @org.junit.jupiter.api.Test
    void get() {

    }

    @Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void remove() {
       assertEquals(true,list.remove(1));
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(100,list.size());
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
    }

    @org.junit.jupiter.api.Test
    void contains() {
    }

    @org.junit.jupiter.api.Test
    void quickSort() {
    }
}