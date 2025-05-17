# Kata del Patrón Compuesto

## Problema
Necesitas representar un sistema de archivos donde los archivos y las carpetas puedan ser tratados de manera uniforme. Operaciones como calcular el tamaño total o mostrar la estructura deben funcionar para ambos.

## Solución
Usa el patrón Compuesto para tratar archivos y carpetas como una única jerarquía.

## Pasos
1. Crea una interfaz `FileSystemComponent` con métodos comunes.
2. Implementa las clases `File` y `Folder`.
3. Usa una estructura compuesta en el código cliente para gestionar archivos y carpetas.

## Ejemplo
- Los archivos y carpetas se tratan de manera uniforme.
- El tamaño total y la estructura se calculan de forma recursiva.