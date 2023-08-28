package br.com.pinho.cursos.java.oo.exemplo;

import java.util.Base64;

public class Criptografia {

    public static String criptografar(String senha) {
        return Base64.getEncoder().encodeToString(senha.getBytes());
    }

    public static String descriptografar(String senhaCriptografada) {
        byte[] decodedBytes = Base64.getDecoder().decode(senhaCriptografada);
        return new String(decodedBytes);
    }
}
