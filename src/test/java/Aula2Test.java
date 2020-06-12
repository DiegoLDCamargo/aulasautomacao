import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Aula2Test {
    @Test
    public void aula2(){
        LoginPO login = new LoginPO("Diego" , 123);
        login.efetuarLogin();

        //Criando objeto Lista de strings
        List<String> nomes = new ArrayList<String>();
        nomes.add("Nathalia");
        nomes.add("Maria");
        nomes.add("Nathalia");
        nomes.add("Lays");
        nomes.add("Diego");

        // Contador que percorre toda lista iniciando do 0
        for(int cont = 0 ; cont < nomes.size(); cont ++){
            if( nomes.get(cont).contains(login.getNome())){
                System.out.println("Encontrei meu nome!");
                // para de percorrer a lista assim que o nome na lista for encontrado
                break;
            }
            System.out.println("Nome não foi encontrado!");
        }
    }
}
