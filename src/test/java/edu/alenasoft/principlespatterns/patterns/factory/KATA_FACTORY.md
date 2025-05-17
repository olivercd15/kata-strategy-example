# Kata del Patrón Fábrica

## Problema
Necesitas crear diferentes tipos de formas (por ejemplo, Círculo, Cuadrado, Rectángulo) pero quieres centralizar la lógica de creación de objetos.

## Solución
Usa el patrón Fábrica para encapsular la creación de objetos.

## Pasos
1. Crea una interfaz `Shape`.
2. Implementa las clases `Circle`, `Square` y `Rectangle`.
3. Crea una clase `ShapeFactory` para generar formas según la entrada.
4. Usa la fábrica en el código cliente.

## Ejemplo
- Creación centralizada de formas.
- Agrega fácilmente nuevas formas sin modificar el código existente.