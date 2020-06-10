# language: es

  Característica: Crear un usuario simulando el modulo de registro mediante servicios

    @ConsultarUsuario
    Esquema del escenario: crear un usuario y actualizar sus datos
      Dado que ana se registra con <correo> y <contrasena>
      Cuando ingresa y actualiza su <nombre> y <trabajo>
      Entonces verifica la informacion ingresada

      Ejemplos:
            |    correo         | contrasena | nombre  |   trabajo        |
            | eve.holt@reqres.in| cityslicka |Eve Holt | StatusCode Weekly|
