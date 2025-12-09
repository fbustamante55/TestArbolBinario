# TestArbolBinario

Implementación de un Árbol Binario de Búsqueda (BST) en Java que permite realizar diversas operaciones sobre la estructura de datos.

## 📋 Descripción

Este proyecto implementa un árbol binario de búsqueda con operaciones básicas y avanzadas, incluyendo inserción, eliminación, recorrido y transformación de nodos. El árbol mantiene la propiedad de que todos los valores en el subárbol izquierdo son menores que el nodo raíz, y todos los valores en el subárbol derecho son mayores.

## 🚀 Características

- **Inserción de nodos**: Inserta valores manteniendo la propiedad del árbol binario de búsqueda
- **Recorrido en orden**: Imprime los valores del árbol de forma ordenada (izquierda-raíz-derecha)
- **Eliminación de hojas**: Elimina todos los nodos hoja del árbol
- **Eliminación de nodos específicos**: Elimina un nodo con un valor determinado
- **Multiplicación de valores**: Multiplica todos los valores del árbol por un factor (10)

## 🏗️ Estructura del Proyecto

```
TestArbolBinario/
├── TestArbolBinario/
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/
│   │               └── mycompany/
│   │                   └── testarbolbinario/
│   │                       ├── ArbolBinario.java    # Clase principal del árbol
│   │                       ├── Nodo.java            # Clase que representa un nodo
│   │                       └── TestArbolBinario.java # Clase de prueba
│   └── pom.xml                                      # Configuración Maven
└── README.md                                         # Este archivo
```

## 📦 Requisitos

- **Java**: Versión 23 o superior
- **Maven**: Versión 3.6.0 o superior

## 🔧 Instalación

1. Clona el repositorio o descarga el proyecto
2. Asegúrate de tener Java 23 y Maven instalados
3. Navega al directorio del proyecto:
```bash
cd TestArbolBinario
```
4. Compila el proyecto con Maven:
```bash
mvn clean compile
```

## ▶️ Ejecución

Para ejecutar el programa, primero navega al directorio del proyecto:

```bash
cd TestArbolBinario
mvn exec:java
```

O compila y ejecuta manualmente:

```bash
cd TestArbolBinario
mvn clean package
java -cp target/TestArbolBinario-1.0-SNAPSHOT.jar com.mycompany.testarbolbinario.TestArbolBinario
```

## 📝 Uso

El programa de prueba (`TestArbolBinario`) realiza las siguientes operaciones:

1. **Crea un árbol** e inserta los valores: `50, 20, 80, 15, 30, 60, 40, 90, 75, 33, 82`
2. **Imprime el árbol original** (recorrido en orden)
3. **Elimina todas las hojas** del árbol
4. **Imprime el árbol** después de eliminar las hojas
5. **Elimina el nodo con valor 30**
6. **Imprime el árbol** después de eliminar el nodo 30
7. **Multiplica todos los valores por 10**
8. **Imprime el árbol final**

### Ejemplo de uso programático

```java
ArbolBinario arbol = new ArbolBinario();

// Insertar valores
arbol.insertar(50);
arbol.insertar(20);
arbol.insertar(80);

// Imprimir el árbol
arbol.imprimir();

// Eliminar hojas
arbol.eliminarHojas();

// Eliminar un nodo específico
arbol.eliminarNodo(20);

// Multiplicar todos los valores por 10
arbol.multiplicarPor10();
```

## 🧩 Clases Principales

### `Nodo`
Representa un nodo del árbol binario con:
- `valor`: El valor almacenado en el nodo
- `izquierda`: Referencia al hijo izquierdo
- `derecha`: Referencia al hijo derecho

### `ArbolBinario`
Clase principal que implementa las operaciones del árbol:
- `insertar(int valor)`: Inserta un nuevo valor en el árbol
- `imprimir()`: Imprime el árbol en orden (in-order traversal)
- `eliminarHojas()`: Elimina todos los nodos hoja
- `eliminarNodo(int valor)`: Elimina un nodo específico
- `multiplicarPor10()`: Multiplica todos los valores por 10

## 📊 Complejidad

- **Inserción**: O(log n) en promedio, O(n) en el peor caso
- **Eliminación**: O(log n) en promedio, O(n) en el peor caso
- **Recorrido**: O(n) donde n es el número de nodos
- **Eliminación de hojas**: O(n)

## 👤 Autor

**Fabia**

## 📄 Licencia

Este proyecto está disponible bajo la licencia por defecto.

