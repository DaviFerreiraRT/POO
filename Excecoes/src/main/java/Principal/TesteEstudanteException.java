package Principal;
import Estudante.Estudante;
import Exceptions.*;
import Turma.Turma;

/**
 *
 * @author davif
 */
public class TesteEstudanteException  {

    public static void main(String[] args) throws EstudanteNuloException {
 
        try {
            Estudante e1 = new Estudante();
            Estudante e2 = new Estudante();
            Estudante e5 = new Estudante("Davi",'M',45);
            //Turma t1 = new Turma(null);
            Turma t2 = new Turma("OO");
            
            //2.matricular(null);
            t2.pesquisar(45);
            t2.trancar(e5);
            t2.matricular(e5);
            

        } catch (NomeTurmaException e) {
            System.out.println(e.getMessage());
            e.TipoDoErro();
        } catch (EstudanteInexistenteException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getEstudante());
            e.TipoDoErro();
        } catch (EstudanteNuloException e ){
            System.out.println(e.getMessage());
            e.TipoDoErro();
        } catch (MatriculaInexistenteException e ){
            System.out.println(e.getMessage());
            e.TipoDoErro();

            }
         catch (Exception e ){
            System.out.println("Erro desconhecido!");
        }
        finally{
            System.out.println("Codigo finalizado!");
        }
    }
}
