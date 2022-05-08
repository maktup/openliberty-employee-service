
********************************************************
********************* [TEST LOCAL] *********************
********************************************************
OPERACIÓN => 'getEmpleados': 
http://localhost:9080/openliberty-employee-service/ibm/employeeService/getEmpleados

OPERACIÓN => 'getEmpleadosPorId': 
http://localhost:9080/openliberty-employee-service/ibm/employeeService/getEmpleadosPorId/1


********************************************************
******************** [TEST DOCKER] *********************
********************************************************
$ docker build -t openliberty-employee-service .
$ docker run -i --rm -p 9080:9080 openliberty-employee-service
$ curl http://localhost:9080/openliberty-employee-service/ibm/employeeService/getEmpleados
$ curl http://localhost:9080/openliberty-employee-service/ibm/employeeService/employeeService/getEmpleadosPorId/1


----------------------------------------------------------------------------------------------------------------------------------------------

En archivo de CONFIGURACIÓN está en la RUTA:   src\main\liberty\config\server.xml

