public class TesteEstudanteException {
    public static void main(String[] args) throws EstudanteNuloException {
        try {
            Estudante e1 = new Estudante();
            Estudante e2 = new Estudante();
            Estudante e5 = new Estudante("Davi",'M',45);
            //TurmaLista t1 = new TurmaLista(null);
            TurmaLista t2 = new TurmaLista("OO");
            //2.matricular(null);
            //t2.pesquisar(55);
            t2.trancar(e5);
            t2.matricular(e5);
            
            

        } catch (NomeTurmaException e) {
            System.out.println(e.getMessage());
            e.TipoDoErro();
        } catch (EstudanteInexistenteException e) {
            System.out.println(e.getMessage());
            e.TipoDoErro();
        } catch (EstudanteNuloException e ){
            System.out.println(e.getMessage());
            e.TipoDoErro();
        } catch (Exception e ){
            System.out.println("Erro desconhecido!");
        }
        finally{
            System.out.println("Codigo finalizado!");
        }
    }
}
