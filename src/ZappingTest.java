import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @Test
     void CanalOrigen0(){
        Zapping canal = new Zapping();
        int canales = canal.Canales(0, 0);
        assertEquals(0, canales);
    }

    @Test
    void CanalOrigen1(){
        Zapping canal = new Zapping();
        int canales = canal.Canales(1,2);
        assertEquals(1, canales);
    }
    @Test
    void CanalOrigen2(){
        Zapping canal = new Zapping();
        int canales = canal.Canales(10, 30);
        assertEquals(20, canales);
    }

    @Test
    void CanalReverse1(){
        Zapping canal = new Zapping();
        int canales = canal.Canales(2,99);
        assertEquals(2, canales);
    }

    @Test
    void CanalReverse2(){
        Zapping canal = new Zapping();
        int canales = canal.Canales(5,63);
        assertEquals(41, canales);
    }

    @Test
    void canalReverse3(){
        Zapping canal = new Zapping();
        int canales = canal.Canales(63, 5);
        assertEquals(41, canales);
    }




}