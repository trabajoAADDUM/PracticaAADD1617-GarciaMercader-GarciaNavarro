package controlador;

public class Controlador {
	
	public void login() {}
	public void registro() {}
	public void modificarUsuario() {}
	public void registrarCatalogo() {}
	public void registrarCategoria() {}
	public void asignarCategoriaCatalogo() {}
	public void asignarCategoriaCatalogo(List<Catalogo> catalogos) {}
	public void cargarItems(Catalogo catalogo) {}
	public void cargarItems(CSV fichero) {}
	public void eliminarItem() {}
	public void eliminarItem(List<Item> items) {}
	public void buscarItems() {}
	
	
	/*Login/Registro/Modificaci�n	de	usuario
	Permiten	registrar	y	modificar	un	usuario	en	el	sistema.	Tambi�n	se	debe	permitir	la	
	identificaci�n	mediante	usuario/password.
	Registro	de	cat�logo
	Permite	el	registro	de	un	nuevo	cat�logo	vac�o	(sin	�tems)
	Asignar	categor�a/s	a	cat�logo
	Asigna	una	o	varias	categor�as	a	un	cat�logo.	Si	la	categor�a	no	existiese	ya	en	el	
	sistema	entonces	ser�a	registrada	antes	de	la	asignaci�n.
	A�adir	(cargar)	�tems	en	cat�logo
	Dado	un	fichero	CSV	(mediante	su	path)	y	un	cat�logo,	el	m�todo	carga	los	datos	
	como	�tems	del	cat�logo.	Si	el	cat�logo	ya	tuviese	datos,	los	nuevos	�tems	ser�n	
	a�adidos.
	Eliminar	�tem/s	de	cat�logo
	Elimina	un	item	o	una	lista	de	�tems	del	cat�logo
	Buscar	�tem/s	en	cat�logo	(criterios)
	Devuelve	una	lista	de	�tems	de	un	cat�logo	que	verifican	los	criterios	de	b�squeda	
	establecidos	como	par�metro*/

}
