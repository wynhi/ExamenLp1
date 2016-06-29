<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Clientes de  Peruinka

<br>
<a href="frmCustomer">Nuevo Cliente</a>
<br>
<display:table name="${listCustomer}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Empresa" property="enterpriceId.description" />
	<display:column title="Encargado" property="personId.description" />
	<display:column title="Responsable" property="createBye" />
    <display:column title="fecha de creacion" property="dateCreated" />
    <display:column title="fecha de Actualización" property="dateLasUpdated" />
    <display:column title="Responsable" property="lastUpdatedBy" />
    <display:column title="Version" property="Version" />
	<display:column title="Estado" property="statusCustomer.description" />
	<display:column title="OPC">
		<a href="editCustomer?id_=${item.id}">Modificar</a>
		<a href="deletCustomer?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>