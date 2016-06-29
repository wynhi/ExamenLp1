<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>
Ticket PeruInka

<br>
<a href="frmTicket">Ticket Nuevo</a>
<br>
<display:table name="${listTicket}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Dato de Inicio" property="dateIni" />
	<display:column title="Dato Final" property="dateEn" />
	<display:column title="Cliente" property="customerId.description" />
	<display:column title="Estado" property="statusTicket.description" />
	<display:column title="Responsable" property="createBye" />
	<display:column title="fecha de creacion" property="dateCreated" />
    <display:column title="fecha de Actualización" property="dateLasUpdated" />
    <display:column title="Responsable" property="lastUpdatedBy" />
    <display:column title="Version" property="Version" />	<display:column title="OPC">
		<a href="editTicket?id_=${item.id}">Modificar</a>
		<a href="deleteTicket?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>