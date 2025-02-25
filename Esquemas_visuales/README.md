# Clases necesarias

  - Principal
  - Maquina
  - Terminal
  - Tiket
  - Ubiacion planta (mapa de parquing)
  - Deposito

# Distribución

## Principlas

Encargada de crear una *instancia* de la `MAQUINA` del parking, pasándola el **precio/minuto** como un double

## Maquina

Tiene incorparado la `terminal` con la que el usuario interectuara para acciones como **APARCAR** O **SACAR VIECULO**

### Composición 

La **`Maquina`** tendra acceso a :

| Función| Descripción|
|--------|------------|
| `La terminal` | Pudiendo controlar el funcionamiento de la maquina|
| `Deposito` | Control de la cantidad de monedas y billetes de cada tipo disponibles en la máquina|
|ArrayList| Almacena los `tiquets` generados|
| `Plano del camping` | Matriz en el que se ve la disponibilidad del parquing (poniendo 0 donde esta bacio y si esta ocupado aparece el **ID** del tiquet)|

![Ejemplo diseño](anexos/Captura.PNG)

## Tiquet

Presenta informacccion al salir del parquing como : 
````
información: un identificador único, matrícula del coche, fecha/hora de entrada y UBICACIÓN (planta/plaza) asignada
````
