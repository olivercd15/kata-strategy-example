# Kata del Patrón Observador

## Problema
Tienes un sistema de precios de acciones donde múltiples clientes necesitan ser notificados cada vez que el precio cambia.

## Solución
Usa el patrón Observador para notificar a los clientes sobre los cambios.

## Pasos
1. Crea una clase `Stock` con un precio y una lista de observadores.
2. Implementa una interfaz `Observer` y observadores concretos como `MobileApp` y `WebApp`.
3. Notifica a los observadores cada vez que el precio de las acciones cambie.

## Ejemplo
- Los cambios en el precio de las acciones activan notificaciones para todos los observadores.
- Agrega o elimina observadores dinámicamente.