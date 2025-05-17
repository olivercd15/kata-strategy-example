# Aplicando patron estrategia a Kata

## 1. ¿Cuáles de las siguientes son desventajas de usar la herencia para proporcionar el comportamiento de Duck? (Seleccione todas las que correspondan).

❌ A. El código se duplica en todas las subclases.
❌ B. Los cambios de comportamiento en tiempo de ejecución son difíciles.
❌ C. No podemos hacer que los patos bailen.
❌ D. Es difícil obtener conocimiento de todos los comportamientos de los patos.
❌ E. Los patos no pueden volar y graznar al mismo tiempo.
❌ F. Los cambios pueden afectar involuntariamente a otros patos.


## 2. Hay muchos factores que pueden impulsar el cambio. Enumera algunas razones por las que has tenido que cambiar el código de tus aplicaciones (incluimos un par de las nuestras para ayudarte a empezar).

Respuestas:

- Errores o bugs reportados en producción.
- Comportamientos singulares de  nuevas clases.
- Para adaptarse a nuevos requerimientos del cliente.
- Para mejorar el rendimiento a la hora de aplicar nuevos cambios.


## 3. Con nuestro nuevo diseño, ¿qué harías si necesitaras añadir vuelo propulsado por cohetes a la app SimUDuck?

- Crea una clase FlyRocketPowered que implemente la interfaz FlyBehavior.


## 4. ¿Se te ocurre alguna clase que pueda usar el comportamiento Quack que no sea el de un pato?

- Ejemplos de clases no relacionadas con Duck que podrían usar QuackBehavior
- Crear una clase para Ganso que pueda ocupar el QuackBehavior (no es un pato)





