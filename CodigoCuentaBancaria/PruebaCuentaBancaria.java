

import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class PruebaCuentaBancaria {

        @Test
        public void testConsignar(){
            CuentaBancaria cuenta = new CuentaBancaria();
            cuenta.consignar(1000.0);
            assertEquals(1000.0, cuenta.getSaldo());
        }

        @Test
        public void testConsignarValorNegativo(){
            CuentaBancaria cuenta = new CuentaBancaria();
            cuenta.consignar(-1000.0);
            assertEquals(0.0, cuenta.getSaldo());
        }


}
