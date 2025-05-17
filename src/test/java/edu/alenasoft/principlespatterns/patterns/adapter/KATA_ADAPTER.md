# Kata del Patrón Adaptador

## Problema
Tienes un sistema heredado que proporciona la temperatura en Fahrenheit, pero tu nuevo sistema requiere Celsius. Modificar el sistema heredado no es una opción.

## Solución
Usa el patrón Adaptador para convertir Fahrenheit a Celsius sin cambiar el sistema heredado.

## Pasos
1. Crea una interfaz `TemperatureProvider` para el nuevo sistema.
2. Implementa una clase `LegacyTemperatureService` que proporcione Fahrenheit.
3. Crea una clase `Adapter` para convertir Fahrenheit a Celsius.
4. Usa el adaptador en el código cliente.

## Ejemplo
- El sistema heredado proporciona la temperatura en Fahrenheit.
- El adaptador la convierte a Celsius para el nuevo sistema.