package Validaciones;

import org.example.validaciones.UsuarioValidacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    //Preparo la prueba
    UsuarioValidacion usuarioValidacion;

    @BeforeEach //palabra reservada que le da funcionalidad al metodo de la prueba (Preparar la prueba para ejecutarla)

    public void configurarPruebas(){
        System.out.printf("Estoy ejecuntando la prueba");
        this.usuarioValidacion=new UsuarioValidacion();
    }
    @Test //para ejecutarlas
    public void validarNombreFallaPorNombreCorto(){

    }

    @Test
    public void validarNombreFallaPorCaracteres(){

    }
    @Test
    public void validarNombreCorrecto(){

    }
}