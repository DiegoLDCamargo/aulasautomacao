public class LoginPO {

    private String usuario;
    private int senha;
    //construtor
    public LoginPO(String usuario,int senha){
        this.usuario = usuario;
        this.senha = senha;
    }
     // Void é um método sem retorno
     public void efetuarLogin(){
        if (usuario.equals("Diego") && senha==123){
            System.out.println(senha);
            System.out.println("Login efetuado!");
        } else {
            System.out.println("Login Falhou!");
        }
     }

     public int getPosicao(){
        return 3;
     }

     public String getNome(){
        return "Diego";
     }
 }
