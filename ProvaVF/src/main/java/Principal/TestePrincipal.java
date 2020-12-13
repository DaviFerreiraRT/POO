package Principal;

import Excecoes.*;
import Negocio.*;

/**
 *
 * @author davif
 */
public class TestePrincipal {

    public static void main(String[] args) {

        try {
            CompanhiaAerea c = new CompanhiaAerea("VoeMais", 123456);
            c.adquirir(new Aeronave("pt500", "carga", 5));
            c.adquirir(new Aeronave("pt501", "passageiro", 3));
            c.liberarAterrissagem("pt500");
            c.revisar(0);

        } catch (CodigoNaoEncontradoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (IdadeInexistenteException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Erro desconhecido!");
            e.printStackTrace();
        } finally {
            System.out.println("Programa finalizado!");

        }

    }
}
