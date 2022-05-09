package pe.com.ibm.csm.service.imp;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponseSchema;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import pe.com.ibm.csm.bean.Employee;
import pe.com.ibm.csm.bean.ListEmployee;
import pe.com.ibm.csm.service.EmployeeService;

/**
 * EmployeeServiceImp
 * @author cguerra
 **/
 @RequestScoped
 @Path( "employeeService" )
 public class EmployeeServiceImp implements EmployeeService{
	
	   /**
	    * getEmpleados
	    * @param  Employee objEmp
	    * @return Response
	    **/ 
	    @GET   
	    @Path( "/getEmpleados" )
	    @Produces( MediaType.APPLICATION_JSON )	    
	    @APIResponse(
	            responseCode = "404",
	            description  = "Error en el envio de datos",
	            content      = @Content( mediaType = MediaType.APPLICATION_JSON ) )
	    @APIResponseSchema( 
	    		value               = ListEmployee.class,
	            responseDescription = "Proceso Exitoso.",
	            responseCode        = "200")
	    @Operation(
	            summary     = "Operacion que obtiene la lista completa de Empleados.",
	            description = "Operacion que obtiene la lista completa de Empleados." )	
	    public Response getEmpleados(){ 
		       System.out.println( "------ INICIO [getEmpleados]" );
	    	
		       List<Employee> listaEmp = new ArrayList<Employee>();
			   Employee       objEmp   = null;
			
			   try{
				   objEmp = new Employee();
				   objEmp.setId( 1 );
				   objEmp.setNombres( "IVAN ARTURO" );
				   objEmp.setApellidos( "FRANCISCO SILVA" );
				   objEmp.setDni( 42814133 );
				   objEmp.setEdad( 35 );
				   listaEmp.add( objEmp );
					
				   objEmp = new Employee();
				   objEmp.setId( 2 );
				   objEmp.setNombres( "PAOLO MARIO" );
				   objEmp.setApellidos( "VERA TUDELA" );
				   objEmp.setDni( 41816133 );
				   objEmp.setEdad( 39 );
				   listaEmp.add( objEmp );
					
			   }
			   catch( Exception e ){
			          e.printStackTrace();
			   }
			   finally{
				       System.out.println( "------ FIN [getEmpleados]" );
			   }
			   		
			   return Response.ok( listaEmp ).build(); 
		}  
	  	    
	   /**
	    * getEmpleados
	    * @param  long idParam
	    * @return Response
	    **/
	    @GET
		@Path( "/getEmpleadosPorId/{id}")
		@Produces( { MediaType.APPLICATION_JSON } )
	    @APIResponse(
	            responseCode = "404",
	            description  = "Error en el envio de datos",
	            content      = @Content( mediaType = MediaType.APPLICATION_JSON ) )
	    @APIResponseSchema( 
	    		value               = Employee.class,
	            responseDescription = "Proceso Exitoso.",
	            responseCode        = "200")
	    @Operation(
	            summary     = "Operacion que obtiene un registro de Empleados en base al ID ingresado.",
	            description = "Operacion que obtiene un registro de Empleados en base al ID ingresado." )	
		public Response getEmpleadosPorId( @PathParam( "id" ) String id ){  
		       System.out.println( "------ INICIO [getEmpleadosPorId], PARAMETRO: [" + id + "]" );
		        
			   Employee objEmp = null;
				
			   try{
				   objEmp = new Employee();
				   objEmp.setId( Integer.parseInt( id.trim() ) );
				   objEmp.setNombres( "MARTIN PATRICIO" );
				   objEmp.setApellidos( "CALAGUA DIAS" );
				   objEmp.setDni( 42814133 );
				   objEmp.setEdad( 35 );			
			   }
			   catch( Exception e ){
					  e.printStackTrace();
			   }
			   finally{
				       System.out.println( "------ FIN [getEmpleadosPorId]" );
			   }			   		
			    		
			   return Response.ok( objEmp ).build(); 
		}
 }

