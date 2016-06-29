<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend>Formulario Ticket : ${opc}</legend>
			<form:form commandName="ticket" action="saveTicket" method="POST">

				<table>
				
				
				  <tr>
						<td>Inicio:</td>
						<td><form:input path="dateIni" id="dateIni" />
						<td />
					</tr>
					
						
				
				  <tr>
						<td>Final:</td>
						<td><form:input path="dateEn" id="dateEn" />
						<td />
					</tr>
					<tr>
				<td>Cliente:</td>
						<td><form:select path="customerId.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${customerId}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
				</tr>
					<tr>
						<td>Estado</td>
						<td><form:select path="statusTicket.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusTicket}" itemValue="typeCode"
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

