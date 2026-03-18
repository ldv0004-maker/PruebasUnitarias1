package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ
    @Test
    @DisplayName("Reto 1: Nombre vacío debe ser rechazado")
    public void testNombreVacio() {
        boolean resultado = validador.validarNombre("");
        assertFalse(resultado, "Error: El sistema aceptó un nombre vacío");
    }

    @Test
    @DisplayName("Reto 2: Password de 8 caracteres debe ser válida")
    public void testPasswordJusta() {
        boolean resultado = validador.validarPassword("12345678");
        assertTrue(resultado, "Error: El sistema rechazó una contraseña válida");
    }

    @Test
    @DisplayName("Reto 3: Password corta debe ser rechazada")
    public void testPasswordCorta() {
        boolean resultado = validador.validarPassword("Admin");
        assertFalse(resultado, "Error: El sistema aceptó una contraseña corta");
    }

    @Test
    @DisplayName("Reto 4: Email sin arroba debe ser rechazado")
    public void testEmailIncorrecto() {
        boolean resultado = validador.validarEmail("usuario.gmail.com");
        assertFalse(resultado, "Error: El sistema aceptó un email inválido");
    }

    @Test
    @DisplayName("Reto 5: Edad mínima (16) debe ser aceptada")
    public void testEdadLimite() {
        boolean resultado = validador.validarEdad(16);
        assertTrue(resultado, "Error: El sistema rechazó una edad válida");
    }
}