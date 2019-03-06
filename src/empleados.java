
public class empleados {
	private int ID;
	private String nombre;
	private String app;
	private String dir;
	private int telef;
	
	public empleados(int ID, String nombre, String app, String dir, int telef) {
		this.ID=ID;
		this.nombre=nombre;
		this.app=app;
		this.dir=dir;
		this.telef=telef;
		
	}
	
	public int numero_elementos(String nombre) {
		return nombre.length();
	}
	
	public String cad_mayus(String app) {
		return app.toUpperCase();
	}
	
	public int IDxCinco(int ID) {
		return ID*5;
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public int getTelef() {
		return telef;
	}

	public void setTelef(int telef) {
		this.telef = telef;
	}
}
