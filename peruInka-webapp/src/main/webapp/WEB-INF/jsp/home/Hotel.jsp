<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Hotel Peruinka

<br>
<a href="frmHotel">Nueva Hotel</a>
<br>
<display:table name="${listHotel}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombre" property="businessName" />
	<display:column title="RUC" property="ruc" />
	<display:column title="Direccion" property="address" />
	<display:column title="Telefono" property="phone" />
    <display:column title="Root" property="root" />
	<display:column title="Responsable" property="personId" />
	<display:column title="Estado" property="statusHotel.description" />
	<display:column title="OPC">
		<a href="editHotel?id_=${item.id}">Modificar</a>
		<a href="deleteHotel?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>