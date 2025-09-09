# JAVA0078_M4_InventarioConProductos

Este proyecto implementa un sistema básico de inventario para una tienda, con gestión de productos y operaciones como agregar, buscar, eliminar y listar productos.

## Estructura del proyecto

```
JAVA0078_M4_InventarioConProductos/
├── src/
│  └── cl/
│       ├── Main.java
│       ├── clases/
│       │   ├── Producto.java
│       │   └── Inventario.java
│       └── test/
│           └── InventarioTest.java
├── Java como Lenguaje de Programacion Empresarial.pdf
└── README.md
```

## Requisitos

- **Java 17** o superior  
- **STS / Eclipse** con soporte para JUnit 5

---

## Compilación y ejecución de la aplicación

1. Importa el proyecto en STS como **Java Project**.
2. Asegúrate de que el JDK del proyecto sea **17 o superior**.
3. Agrega las librerías necesarias:
   - **JUnit 5** (desde `Build Path > Add Libraries > JUnit`)
4. Ejecuta la clase **`Main`** (`src/cl/Main.java`) con la opción *Run* del IDE.  
   Esto iniciará el menú interactivo en la consola integrada del IDE.

---

## Ejecución de pruebas en STS / Eclipse

1. Haz clic derecho sobre la clase de prueba (`InventarioTest.java`).
2. Selecciona:
   ```
   Run As > JUnit Test
   ```
3. El IDE ejecutará todas las pruebas y mostrará los resultados en la **vista JUnit**.
   - ✅ Las pruebas que pasen aparecerán en verde.
   - ❌ Las que fallen aparecerán en rojo, mostrando mensajes y stacktrace.

---

## Ejemplo de uso de la aplicación

1. Al iniciar la aplicación, se crean 5 productos y se agregan al inventario.
2. El menú permite:  
   - Agregar productos  
   - Buscar productos  
   - Eliminar productos  
   - Listar productos disponibles  
   - Salir  

```
Producto agregado exitosamente
Producto agregado exitosamente
Producto agregado exitosamente
Producto agregado exitosamente
Producto agregado exitosamente

=== MENÚ ===
1. Agregar producto
2. Buscar producto
3. Eliminar producto
4. Listar productos
5. Salir
Seleccione una opción: 4

Productos en inventario:
Producto [id=P001, nombre=Televisor, precio=250000, cantidad=10]
Producto [id=P002, nombre=Refrigerador, precio=450000, cantidad=5]
Producto [id=P003, nombre=Lavadora, precio=300000, cantidad=3]
Producto [id=P004, nombre=Microondas, precio=60000, cantidad=15]
Producto [id=P005, nombre=Notebook, precio=550000, cantidad=7]

=== MENÚ ===
1. Agregar producto
2. Buscar producto
3. Eliminar producto
4. Listar productos
5. Salir
Seleccione una opción: 3
Ingrese ID del producto a eliminar: P003
Producto eliminado correctamente
```

---

## Autor

- Laura Duhalde 