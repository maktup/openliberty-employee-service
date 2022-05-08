package pe.com.ibm.csm.service.imp;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pe.com.ibm.csm.bean.Employee;
import pe.com.ibm.csm.service.EmployeeService;

/**
 * EmployeeServiceImp
 * @author cguerra
 **/
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
	    public Response getEmpleados(){ 
		       System.out.println( "------ INICIO [ getEmpleados]" );
	    	
		       List<Employee> listaEmp = new ArrayList<Employee>();
			   Employee       objEmp   = null;
			
			   try{
				   objEmp = new Employee();
				   objEmp.setId( 1 );
				   objEmp.setNombres( "MARTIN PATRICIO" );
				   objEmp.setApellidos( "CALAGUA DIAS" );
				   objEmp.setDni( 42814133 );
				   objEmp.setEdad( 35 );
				   listaEmp.add( objEmp );
					
				   objEmp = new Employee();
				   objEmp.setId( 2 );
				   objEmp.setNombres( "CESAR RICARDO" );
				   objEmp.setApellidos( "GUERRA ARNAIZ" );
				   objEmp.setDni( 41816133 );
				   objEmp.setEdad( 39 );
				   listaEmp.add( objEmp );
					
			   }
			   catch( Exception e ){
			          e.printStackTrace();
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
		public Response getEmpleadosPorId( @PathParam( "id" ) String id ){  
		       System.out.println( "------ INICIO [ getEmpleadosPorId], PARAMETRO: [" + id + "]" );
		        
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
			    		
			   return Response.ok( objEmp ).build(); 
		}

 }

