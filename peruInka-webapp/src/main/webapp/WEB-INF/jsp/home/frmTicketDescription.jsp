<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend>Descripcion Ticket : ${opc}</legend>
			<form:form commandName="ticketDescription" action="saveTicketDescription" method="POST">

				<table>
				
				
			<tr>
				<td>Producto:</td>
						<td><form:select path="productoId.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${productoId}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
				</tr>
			<tr>
				<td>Ticket:</td>
						<td><form:select path="ticketId.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${ticketId}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
				</tr>
				     <tr>
						<td>Cantidad :</td>
						<td><form:input path="quantity" id="quantity" />
						<td />
					</tr>
		     <tr>
						<td>Precio Unitario :</td>
						<td><form:input path="priceUnitary" id="priceUnitary" />
						<td />
					</tr>
		     <tr>
						<td>Total :</td>
						<td><form:input path="priceAll" id="priceAll" />
						<td />
					</tr>
		     <tr>
						<td>Comentario :</td>
						<td><form:input path="comment" id="comment" />
						<td />
					</tr>
				
				
				<tr>
						<td>Estado</td>
						<td><form:select path="statusTicketDescription.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusTicketDescription}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>
                     <tr>
						<td>Responsable :</td>
						<td><form:input path="createBye" id="createBye" />
						<td />
					</tr>
					
		          <tr>
						<td>fecha creacion:</td>
						<td><form:input path="dateCreated" id="dateCreated" />
						<td />
					</tr>
					 <tr>
						<td>fecha  Actualización :</td>
						<td><form:input path="dateLasUpdated" id="dateLasUpdated" />
						<td />
					</tr>
					
				
				   <tr>
						<td>Responsable</td>
						<td><form:input path="lasUpdatedBy" id="lasUpdatedBy" />
						<td />
					</tr>
			 <tr>
						<td>Version:</td>
						<td><form:input path="version" id="version" />
						<td />
					</tr>
					<tr>
						<td colspan="2"><button type="submit" class="btn btn-success">Guardar</button>
						<td />
					</tr>
				</table>

				<%-- DNI: <form:input path="dni" id="dni"/><br> --%>

				<input type="hidden" name="opc" id="opc" value="${opc}">
				<br>


			</form:form>


		</div>
	</div>
</div>

