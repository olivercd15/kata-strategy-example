# Kata del Patrón Singleton

## Problema
Necesitas una única instancia de un gestor de configuración para gestionar los ajustes de la aplicación de forma global.

## Solución
Usa el patrón Singleton para garantizar una única instancia.

## Pasos
1. Crea una clase `ConfigurationManager` con un constructor privado.
2. Agrega un método estático para obtener la única instancia.
3. Usa el singleton en el código cliente para gestionar los ajustes.

## Ejemplo
- Instancia única del gestor de configuración.
- Acceso global a los ajustes de la aplicación.