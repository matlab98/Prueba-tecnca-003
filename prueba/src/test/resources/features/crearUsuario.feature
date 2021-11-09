Feature: Crear Usuario

  @Creacion
  Scenario Outline: Registrar usuario
    Given se abre la pagina web uTest

    Examples:
      | nombre | apellido | fecha de nacimiento | correo                     | ciudad | codigo postal | pais     | movil  | modelo movil | os movil    | computador OS | version pc | lenguaje pc | contrasena |
      | Hilder | Arrieta  | 19990613            | harrietaruiz19@outlook.com | Bogota | 111151        | Colombia | Huawei | Ascend       | Android 6.0 | Windows       | 10 64-bit  | Spanish     | Alfa9913.  |
