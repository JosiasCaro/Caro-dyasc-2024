package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestMarcador {

    @Test
    public void consultarElMarcadorYQueSeaCeroCero() {
        Marcador marcador = new Marcador();

        String puntaje = marcador.obtenerGame();

        assertThat(puntaje).isEqualTo("0-0");
    }

}
