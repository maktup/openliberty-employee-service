package pe.com.ibm.csm.bean;

import java.util.List;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * Employee
 * @author ListEmployee
 **/
 @RegisterRestClient
 @Schema( name = "ListEmployee", description = "POJO que representa una lista de la entidad Empleado." )
 public class ListEmployee{

	    @Schema( required = true )
	    private List<Employee> listEmployees;
	
	    public List<Employee> getListEmployees(){
		 	  return listEmployees;
	    }
	
	    public void setListEmployees( List<Employee> listEmployees ){
		       this.listEmployees = listEmployees;
	    }
		 
 }
