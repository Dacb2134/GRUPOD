# **Gestión de Cárcel - Aplicación de Escritorio**

Este proyecto es una aplicación de escritorio desarrollada en **Java** para la gestión de cárceles, enfocada en la administración de reclusos, asistencias y actividades. La aplicación utiliza **NetBeans** como IDE, **MySQL** como base de datos, y se basa en la arquitectura MVC.

---

## **Requisitos del Sistema**

### **Software necesario:**
- **Java Development Kit (JDK):** Versión 8 o superior.
- **NetBeans IDE:** Versión 12.5 o superior.
- **MySQL Server:** Versión 8.0 o superior.
- **MySQL Workbench:** (opcional, para administrar la base de datos).
- **Git:** Para clonar el repositorio si se usa un sistema de control de versiones.

### **Hardware recomendado:**
- Procesador: Intel Core i3 o superior.
- Memoria RAM: 8 GB.
- Espacio en disco: 1 GB libre.

---

## **Instrucciones para Abrir el Proyecto**

### **1. Configurar el Entorno**
1. **Instalar el JDK**  
   Asegúrate de que el **Java Development Kit (JDK)** esté instalado. Puedes descargarlo desde [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) o utilizar un OpenJDK.

2. **Instalar NetBeans IDE**  
   Descarga e instala **NetBeans IDE** desde su [página oficial](https://netbeans.apache.org/). Asegúrate de configurar el IDE para trabajar con el JDK instalado.

3. **Instalar MySQL Server y Workbench**  
   - Descarga e instala **MySQL Server** desde su [página oficial](https://dev.mysql.com/downloads/).  
   - Configura una instancia de MySQL con un usuario y contraseña. Anota estas credenciales, ya que las necesitarás más adelante.  
   - (Opcional) Usa **MySQL Workbench** para gestionar la base de datos de forma gráfica.

4. **Configurar las Variables de Entorno (opcional)**  
   - Asegúrate de que la variable `JAVA_HOME` apunte al directorio de instalación del JDK.

---

### **2. Clonar o Descargar el Proyecto**
1. **Clonar el Repositorio (si está en GitHub):**  
   ```bash
   git clone https://github.com/tu-usuario/gestion-carcel.git
   cd gestion-carcel
   
### **3. Crear la Base de Datos

Usa **MySQL Workbench** o la línea de comandos de MySQL para crear la base de datos. Por ejemplo:

```sql
CREATE DATABASE gestion_carcel;
```

### Ejecutar el Script de la Base de Datos

Importa el archivo `script_base_datos.sql` que se encuentra en la carpeta del proyecto (`/database/`). Puedes hacerlo con:

1. **MySQL Workbench**: Usa la opción para importar scripts SQL.
2. **Línea de comandos**: Ejecuta el siguiente comando (ajusta la ruta según tu sistema):

```bash
mysql -u tu_usuario -p gestion_carcel < /ruta/a/script_base_datos.sql
```

### Configurar el Archivo de Conexión a la Base de Datos

1. Dentro del proyecto, localiza y edita el archivo `DatabaseConnection.java` (ubicado en `/src/com/proyecto/db/`).
2. Actualiza las credenciales y parámetros de conexión según tu configuración local:

```java
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_carcel";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_contraseña";
}
```

### Ejecutar el Proyecto

1. Asegúrate de que tu servidor MySQL esté activo y que la base de datos esté configurada correctamente.
2. En **NetBeans**, selecciona el proyecto y haz clic en **Run** para ejecutar la aplicación.
