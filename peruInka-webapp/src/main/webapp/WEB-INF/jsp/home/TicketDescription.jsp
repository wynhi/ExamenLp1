<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>
Descripcion del Ticket

<br>
<a href="frmTicket">Ticket Description</a>
<br>
<display:table name="${listTicketDescription}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Producto" property="productId.description" />
	<display:column title="Ticket" property="ticketId.description" />
	<display:column title="Cantidad" property="quantity" />
	<display:column title="Precion Unitario" property="priceUnitary" />
    <display:column title="Precion Total" property="priceAll" />
    <display:column title="Comentario" property="comment" />
    <display:column title="Estado" property="statusTicketDescription.description" />
	<display:column title="Responsable" property="createBye" />
	<display:column title="fecha de creacion" property="dateCreated" />
    <display:column title="fecha de Actualización" property="dateLasUpdated" />
    <display:column title="Responsable" property="lastUpdatedBy" />
    <display:column title="Version" property="Version" />	<display:column title="OPC">
		<a href="editTicketDescription?id_=${item.id}">Modificar</a>
		<a href="deleteTicketDescription?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>

