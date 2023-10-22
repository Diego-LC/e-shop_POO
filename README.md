# Evidencia 8: caso - tienda online e-shop - programación orientada a objetos

### Objetivo: desarrollar un diagrama de clases UML a partir de la descripción de un contexto problema, en particular para un sistema de compras en línea.

### Contexto:

El objetivo es representar los elementos del dominio problema (ej: cliente, usuario web, cuenta, carrito de compras, producto, pedido, pago, etc.) y las relaciones entre ellos. Podría utilizarse como un elemento común entre analistas del negocio, ejecutivos comerciales y desarrolladores de software.

Cada cliente está vinculado exactamente a una cuenta, una cuenta no puede existir sin un cliente asociado.

Un carrito de compras está asociado a una única cuenta, dicho carrito no puede existir sin estar vinculado a una cuenta.

El cliente puede registrarse como usuario de la web para poder comprar artículos en línea. No se requiere que el cliente sea obligatoriamente un usuario de la web para hacer las compras (las compras también se pueden realizar por otros medios, ej: teléfono o mediante pedidos desde catálogos). El usuario web puede estar en uno de los siguientes estados: nuevo, activo, bloqueado temporalmente o prohibido, y estar vinculado a un carrito de compras.

La cuenta también esta compuesta de los pedidos de los clientes. Es posible que el cliente no tenga pedidos. Cada pedido puede referirse a varios medios de pago o posiblemente ninguno. Cada medio pago está relacionado exactamente con una cuenta.

Cada pedido tiene el estado actual del pedido. Dichos estados pueden ser: nuevo, creado, despachado, recibido, cerrado. Tanto el pedido como el carrito de la compra están asociados con familias de productos que estás asociados a un producto específico. Cada familia de productos está relacionado exactamente con un producto. Un producto puede estar asociado a muchas familias de productos o a ninguno.

 ---

1.) Identifique las principales clases del contexto descrito.

```
clase Cliente
clase Cuenta
clase CarritoDeCompras
clase UsuarioWeb
clase Pedido
Clase MedioDePago
clase Producto
clase FamiliaDeProductos
clase Estado
```

2.) Identifique las clases que se relacionen entre sí, y el tipo de relación identificada.

3.) Para las relaciones que se requiera, identifique las multiplicidades asociadas.

- **Cliente**
  -  Tiene una asociación con "Cuenta" con multiplicidad 1 y puede tener una asociación opcional con "UsuarioWeb" con multiplicidad 0..1.

- **Cuenta**
  - Tiene una asociación de dependencia con cliente de multiplicidad 1, una composición con "Pedido" con multiplicidad 0..* y una composición con "MedioPago" con multiplicidad 1..*.

- **CarritoDeCompras**
  - Tiene una asociación con "Cuenta" con multiplicidad 1.

- **UsuarioWeb**
  - Atributos: Estado (enumeración: Nuevo, Activo, Bloqueado Temporalmente, Prohibido).
  - Relaciones: Tiene una asociación con "CarritoDeCompras" con multiplicidad 0..1.

- **Pedido**
  - Atributos: EstadoActual (enumeración: Nuevo, Creado, Despachado, Recibido, Cerrado).
  - Relaciones: Tiene una composición con "FamiliaDeProductos" con multiplicidad 0..* y una asociación con "MedioPago" con multiplicidad 0..*.

- **FamiliaDeProductos**
  - Tiene una asociación de agregación con "Producto" con multiplicidad 0..*.

- **Producto**
  - Atributos: Ninguno específico.

- **MedioPago**
  - Tiene una asociación con "Cuenta" con multiplicidad 1.

4.) Construya una primera versión de su diagrama de clases, usando Visual Paradigm.

![uml-diagram](https://github.com/Diego-LC/e-shop_POO/blob/main/UML%20Class%20diagram%20e-shop.png)

![IntelliJ-screenshot](https://github.com/Diego-LC/e-shop_POO/blob/main/e-shop%20IntelliJ%20screenshot.png)
