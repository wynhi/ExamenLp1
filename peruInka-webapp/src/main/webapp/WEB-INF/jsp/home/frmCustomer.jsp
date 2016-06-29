<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend>Formulario Cliente : ${opc}</legend>
			<form:form commandName="customer" action="saveCustomer" method="POST">

				<table>
				<tr>
				<td>Empresa</td>
						<td><form:select path="enterpriceId.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${enterpriceId}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
				</tr>
				<tr>
						<td>Responsable</td>
						<td><form:select path="personId">
								<option value="">Seleccione</option>
								<form:options items="${personId}" itemValue="id"
									itemLabel="description" />
							</form:select></td>
					</tr>
					
					<tr>
						<td>Estado</td>
						<td><form:select path="statusCustomer.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusCustomer}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>	
					<tr>
						<td>Responsable</td>
						<td><form:select path="person">
								<option value="">Seleccione</option>
								<form:options items="${person}" itemValue="id"
									itemLabel="Name" />
							</form:select></td>
					</tr>		
				
                     <tr>
						<td>Responsable :</td>
						<td><form:input path="createBye" id="createBye" />
						<td />
					</tr>
					
		          <tr>
						<td>fecha de creacion:</td>
						<td><form:input path="dateCreated" id="dateCreated" />
						<td />
					</tr>
					 <tr>
						<td>fecha de Actualización :</td>
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

