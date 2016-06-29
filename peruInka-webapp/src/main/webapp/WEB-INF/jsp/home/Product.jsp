<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Productos Peruinka

<br>
<a href="frmProduct">Nuevo Producto</a>
<br>
<display:table name="${listProduct}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombre" property="productName" />
	<display:column title="Precio" property="price" />
	<display:column title="Descripcion" property="description" />
	<display:column title="Atributo" property="attribute" />
    <display:column title="Tipo de Producto" property="productType" />
    <display:column title="Responsable" property="createBye" />
    <display:column title="fecha de creacion" property="dateCreated" />
    <display:column title="fecha de Actualización" property="dateLasUpdated" />
    <display:column title="Responsable" property="lastUpdatedBy" />
    <display:column title="Version" property="Version" />
	<display:column title="Pertenece a" property="hotel.description" />
	<display:column title="Estado" property="statusProduct.description" />
	<display:column title="OPC">
		<a href="editProduct?id_=${item.id}">Modificar</a>
		<a href="deleteProduct?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>