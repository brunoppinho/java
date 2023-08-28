package br.com.pinho.cursos.java.oo.exemplo;

public class DefinirSenha {

    public Conta execute(Conta conta, String senha) {
        ContaRepository repository = new ContaRepository();
        conta.setSenha(Criptografia.criptografar(senha));
        return repository.update(conta);
    }

}
