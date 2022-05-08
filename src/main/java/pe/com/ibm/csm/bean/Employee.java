package pe.com.ibm.csm.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable; 

/**
 * Employee
 * @author cguerra
 **/
 @XmlRootElement( name = "employee" ) 
 public class Employee implements Serializable{
	 
		private static final long serialVersionUID = 2548104558661770400L;
		
		@XmlElement
		private long id;
		
		@XmlElement
		private String nombres;
		
		@XmlElement
		private String apellidos;
		
		@XmlElement
		private int dni;
		
		@XmlElement
		private int edad;
	
		//Constructor: 
		public Employee(){			
		}
		
		public Employee( long id, String nombres, String apellidos, int dni, int edad ){
			   super();
			   this.id        = id;
			   this.nombres   = nombres;
			   this.apellidos = apellidos;
			   this.dni       = dni;
			   this.edad      = edad;
		}
	
		public String getNombres() {
			   return nombres;
		}

		public String getApellidos() {
			   return apellidos;
		}
		
		public int getDni() {
			   return dni;
		}

		public int getEdad() {
			   return edad;
		}
	
		public long getId() {
			   return id;
		}
		
		public void setNombres(String nombres) {
			   this.nombres = nombres;
		}
		
		public void setApellidos(String apellidos) {
			   this.apellidos = apellidos;
		}
	
		public void setDni(int dni) {
			   this.dni = dni;
		}
		
		public void setEdad(int edad) {
			   this.edad = edad;
		}

		public void setId(long id) {
			   this.id = id;
		}

		public static long getSerialversionuid() {
			   return serialVersionUID;
		}

 }
 
