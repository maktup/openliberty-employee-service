
Para el TEST LOCAL ejecutar:

OPERACIÓN => 'getEmpleados': 
http://localhost:9080/openliberty-employee-service/ibm/employeeService/getEmpleados

OPERACIÓN => 'getEmpleadosPorId': 
http://localhost:9080/openliberty-employee-service/ibm/employeeService/getEmpleadosPorId/3

--------------------------------------------------------------------------------

En archivo de configuración está en la RUTA: 

src\main\liberty\config\server.xml





# Build
mvn clean package && docker build -t com.javabullets.javaee8/javaee8 .

# RUN

docker rm -f javaee8 || true && docker run -d -p 8080:8080 -p 4848:4848 --name javaee8 com.javabullets.javaee8/javaee8 
