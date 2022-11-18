import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {
    Banco nuBank = new Banco("NuBank");

    @Test
    void getNome() {
        assertEquals(nuBank.getNome(), "NuBank");
    }

    @Test
    void getContas() {
        Conta conta1 = new ContaCorrente(new Cliente("jose"));
        Conta conta2 = new ContaCorrente(new Cliente("maria"));
        Conta conta3 = new ContaCorrente(new Cliente("joao"));
        nuBank.addConta(conta1);
        nuBank.addConta(conta2);
        nuBank.addConta(conta3);

        assertAll("nuBank.getContas()",
                ()->assertEquals(nuBank.getContas().get(0),conta1 ),
                ()->assertEquals(nuBank.getContas().get(1),conta2 ),
                ()->assertEquals(nuBank.getContas().get(2),conta3 )
        );
    }

    @Test
    void setContas() {
    }
}