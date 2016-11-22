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
	
	
	/*Login/Registro/Modificación	de	usuario
	Permiten	registrar	y	modificar	un	usuario	en	el	sistema.	También	se	debe	permitir	la	
	identificación	mediante	usuario/password.
	Registro	de	catálogo
	Permite	el	registro	de	un	nuevo	catálogo	vacío	(sin	ítems)
	Asignar	categoría/s	a	catálogo
	Asigna	una	o	varias	categorías	a	un	catálogo.	Si	la	categoría	no	existiese	ya	en	el	
	sistema	entonces	sería	registrada	antes	de	la	asignación.
	Añadir	(cargar)	ítems	en	catálogo
	Dado	un	fichero	CSV	(mediante	su	path)	y	un	catálogo,	el	método	carga	los	datos	
	como	ítems	del	catálogo.	Si	el	catálogo	ya	tuviese	datos,	los	nuevos	ítems	serán	
	añadidos.
	Eliminar	ítem/s	de	catálogo
	Elimina	un	item	o	una	lista	de	ítems	del	catálogo
	Buscar	ítem/s	en	catálogo	(criterios)
	Devuelve	una	lista	de	ítems	de	un	catálogo	que	verifican	los	criterios	de	búsqueda	
	establecidos	como	parámetro*/

}
