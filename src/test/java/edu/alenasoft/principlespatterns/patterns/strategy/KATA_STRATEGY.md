# Kata del Patrón Estrategia

## Problema
Tienes un sistema de pagos que soporta múltiples métodos de pago (por ejemplo, Tarjeta de Crédito, PayPal, Bitcoin) y quieres cambiar entre ellos dinámicamente.

## Solución
Usa el patrón Estrategia para encapsular los métodos de pago.

## Pasos
1. Crea una interfaz `PaymentStrategy`.
2. Implementa estrategias como `CreditCardPayment`, `PayPalPayment` y `BitcoinPayment`.
3. Crea una clase `PaymentContext` para usar las estrategias.
4. Cambia dinámicamente las estrategias en el código cliente.

## Ejemplo
- Cambia dinámicamente entre métodos de pago.
- Agrega nuevos métodos de pago sin modificar el código existente.