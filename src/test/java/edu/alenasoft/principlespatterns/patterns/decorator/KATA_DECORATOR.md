# Kata del Patrón Decorador

## Problema
Tienes un editor de texto que soporta texto básico pero necesita características adicionales como negrita, cursiva y subrayado sin modificar la clase base.

## Solución
Usa el patrón Decorador para agregar dinámicamente características al texto.

## Pasos
1. Crea una interfaz `Text` con un método `render()`.
2. Implementa una clase `PlainText`.
3. Crea decoradores como `BoldText`, `ItalicText` y `UnderlineText`.
4. Combina decoradores en el código cliente.

## Ejemplo
- Agrega dinámicamente negrita, cursiva o subrayado al texto.
- Combina múltiples decoradores para un formato complejo.