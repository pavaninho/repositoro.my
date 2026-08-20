package br.edu.unifio.ecommerce.entidades;

//import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructorArg
//@AllArgsConstructor

public class Categoria {
    private Short id;
    private String nome;
    private String descriçao;
}
