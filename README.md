IMPORTANTE: Leer [Versión de herramientas](#versión-de-herramientas)
# Alquiler de Vehículos (completo)

Descripción general
Se pretende desarrollar una aplicación que permita calcular los precios de alquileres de una agencia de alquiler de vehículos. Cada vehículo se identifica unívocamente por medio de su patente.

La agencia alquila a sus clientes distintos tipos de vehículos, tanto para transporte de personas como de carga. En la actualidad los vehículos alquilados por la agencia son coches, microbuses, furgoneta de carga y camiones.

El precio del alquiler de cualquier vehículo tiene un precio base que depende de los días de alquiler a razón de $500 por día.

En el caso de un coche , al precio base se le suma la cantidad de $100 por plaza disponible por día. Así por ejemplo un Chery QQ con 4 cinturones de seguridad posee 4 plazas. Mientras que un Honda Civic con 5 cinturones de seguridad otorga 5 plazas.
Si el coche pertenece a una categoría premium el precio de las plazas es de $150.
Cualquier coche puede ser blindado, en tal caso al precio total de dicho coche se le suma un 15%.
El precio de los microbuses se calcula como el de todos los vehículos pero con base $1500 por día más un monto extra fijo de $500 independientemente de los días de alquiler.
Para los vehículos de carga  se cobra el precio base más  $300 * PMA (PMA = peso máximo autorizado en toneladas).
Los camiones no tienen precio base sino que cuestan un costo fijo de $30000 independientemente de los días de alquiler.

Se pide para la agencia de vehículos:
Poder registrar vehículos con su patente para que se puedan alquilar. No se pueden registrar 2 vehículos con igual patente.
Poder agregarle clientes (Los mismos tendrán un número de cliente autogenerado e incremental desde 1)
Dado un cliente, asignarle un alquiler. Se alquila un vehículo en una cantidad de días determinados (mínimamente 1 día y no se pueden alquilar de forma fraccionada, es decir se alquilan 1,2,3,4 ó X días. Son valores enteros)
Luego se le debe poder pedir el precio de dicho alquiler.
El precio total de todos los alquileres de un cliente.
El precio total de todos los alquileres de la empresa.
Hacer a MANO ALZADA: Diagrama de Clases del Modelo de Dominio resultante.
Hacer a MANO ALZADA:  Diagrama de Secuencias del punto 5.


## Versión de herramientas

| Herramienta | Version |
|-------------|---------|
| mvn         | 3.6.3   |
| java        | 11.0.7  |
| IntelliJ    | 2019.3  |

