# Parcial Arep Primer corte

# Requerimientos
Construir un servicio WEB (puede usar Spark o Sockets) que reciba una lista de números y retorne una estructura JSON con: La lista de números ordenada.

Usted debe implementar el ordenamiento por medio de mergesort recursivo. Piense que este algoritmo se podría user para objetos de otro tipo.

Su diseño debe soportar la composición de nuevas operaciones sobre la lista para modificar servicios existentes o componer nuevos servicios. Por ejemplo, piense que en el futuro podemos solicitar que se creen nuevos servicios sobre la lista aumentando el API web, es decir,  debe ser fácilmente extensible.

Agregue una operación para calcular la sumatoria de la lista y modifique su programa para que la estructura Json contenga este valor.

El diseño del servidor debe tener en cuenta buenas prácticas de diseño OO.

Despliegue el servicio en Heroku.

Construya un cliente JAVA para probar el servicio en heroku.

El cliente y el servidor debe entregarlos en un proyecto estructurado con Maven.

El cliente debe traer "quemada" en el código fuente la url de su aplicación desplegada en Heroku.

Servidor en heroku:

    https://swilson-arep-parcial1.herokuapp.com/

Al acceder al link podra probar la funcionalidad, solo debe ingresar los números separados por comas.


## Running locally

Compile first time the project after downloaded.

    mvn package

To test the server with the local clientServer.

    mvn exec:java -D "exec.mainClass"="edu.escuelaing.arep.clientSer.EchoClient"

## Generate documentation.

In order to obtain the documentation of the project, you must execute the command:

    mvn javadoc:jar

An HTML documentation will be generated in /target/site/apidocs/index.html.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management.
* [Spark](http://sparkjava.com/) - Micro Framework For Creating Web Applications
* [Heroku](https://www.heroku.com/) - A cloud platform that lets companies build, deliver, monitor and scale apps

## Author

* **Willson Sneitder Melo Merchan** - Escuela Colombiana de Ingeniería Julio Garavito.

## License

* This project is under GNU General Public License - see [LICENSE](https://github.com/swilsonmelo/ArepParcial1/blob/master/LICENSE) to more info.
