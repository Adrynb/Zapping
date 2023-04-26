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

}