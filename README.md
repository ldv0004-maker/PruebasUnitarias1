# Validador de Registro - Instituto

Este proyecto contiene pruebas unitarias para un sistema de validación de registro de usuarios. Se utiliza **JUnit 5** para comprobar que los datos ingresados cumplen con las reglas de negocio.

---

## 💻 Funcionalidad

La clase `ValidadorRegistro` valida los datos de un usuario según las siguientes reglas:

- **Nombre:** No puede estar vacío.
- **Contraseña:** Debe tener al menos 8 caracteres.
- **Email:** Debe tener un formato válido (debe incluir `@`).
- **Edad:** Debe ser mayor o igual a 16 años.

---

## 🧪 Pruebas Unitarias

Las pruebas están en `ValidadorRegistroTest.java` y cubren los siguientes casos:

| Reto | Caso de prueba | Resultado esperado |
|------|----------------|------------------|
| 1    | Nombre vacío (`""`) | Rechazado (`false`) |
| 2    | Contraseña de 8 caracteres (`"12345678"`) | Aceptada (`true`) |
| 3    | Contraseña corta (`"Admin"`) | Rechazada (`false`) |
| 4    | Email sin arroba (`"usuario.gmail.com"`) | Rechazado (`false`) |
| 5    | Edad mínima (16 años) | Aceptada (`true`) |

Ejemplo de test:

```java
@Test
@DisplayName("Reto 1: Nombre vacío debe ser rechazado")
public void testNombreVacio() {
    boolean resultado = validador.validarNombre("");
    assertFalse(resultado, "Error: El sistema aceptó un nombre vacío");
}
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/b443f75c-072c-487f-84da-a5d6dae5add7" />
