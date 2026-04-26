# pa2_api_p6_rg

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/pa2_api_p6_rg-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- RESTEasy Classic JSON-B ([guide](https://quarkus.io/guides/rest-json)): JSON-B serialization support for RESTEasy Classic
- Hibernate ORM with Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplify your persistence code for Hibernate ORM via the active record or the repository pattern
- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing Jakarta REST and more
- JDBC Driver - PostgreSQL ([guide](https://quarkus.io/guides/datasource)): Connect to the PostgreSQL database via JDBC

## Provided Code

### Hibernate ORM

Create your first JPA entity

[Related guide section...](https://quarkus.io/guides/hibernate-orm)


[Related Hibernate with Panache section...](https://quarkus.io/guides/hibernate-orm-panache)


### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)

Ejemplos de Scopes en Quarkus:

@Application Scope: 
Servicio de productos: maneja listar, crear y actualizar productos en toda la app
Servicio de ventas: procesa todas las ventas del sistema
Servicio de autenticación: valida usuarios en cada login
Servicio de inventario: controla el stock global de productos
Servicio de notificaciones: envía mensajes 
Servicio de configuración: lee variables globales del sistema
Servicio de reportes: genera reportes generales reutilizados

@Dependent
Validador de venta: se crea cada vez que se procesa una venta
Calculador de descuento: calcula descuentos por cada compra
Generador de factura: creacion de una factura diferente por cada venta
Procesador de pago: maneja una transacción específica
Formateador de datos: convierte datos fechas, monedas, etc
Validador de formularios: valida datos ingresados por el usuario
Calculador de impuestos: calcula impuestos para cada compra

@Singleton 
Conexión a API externa 
Contador global de visitas o ventas.
Gestor de configuración cargada al inicio.
Servicio de monitoreo del sistema.
Gestor de logs del sistema (una única instancia que registra todo)
Administrador de caché global (almacena datos compartidos)
Gestor de recursos del sistema (maneja conexiones o recursos únicos)