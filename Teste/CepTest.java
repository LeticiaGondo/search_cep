import com.cep.service.cep.models.Cep;
import org.junit.Test;

import static org.junit.Assert.*;

public class CepTest {

    @Test
    public void getCep() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCep() {
        Cep cep = new Cep();
        cep.setCep("123");
    }

    @Test
    public void getLogradouro() {
    }

    @Test
    public void setLogradouro() {
    }

    @Test
    public void getComplemento() {
    }

    @Test
    public void setComplemento() {
    }

    @Test
    public void getBairro() {
    }

    @Test
    public void setBairro() {
    }

    @Test
    public void getLocalidade() {
    }

    @Test
    public void setLocalidade() {
    }

    @Test
    public void getUf() {
    }

    @Test
    public void getUnidade() {
    }

    @Test
    public void setUnidade() {
    }

    @Test
    public void getIbge() {
    }

    @Test
    public void setIbge() {
    }

    @Test
    public void getGia() {
    }

    @Test
    public void setGia() {
    }

    @Test
    public void isErro() {
    }

    @Test
    public void setErro() {
    }
}