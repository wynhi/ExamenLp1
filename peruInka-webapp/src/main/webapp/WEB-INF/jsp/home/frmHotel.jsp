<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend>Formulario Hotel : ${opc}</legend>
			<form:form commandName="hotel" action="saveHotel" method="POST">

				<table>
					<tr>
						<td>Nombre:</td>
						<td><form:input path="businessName" id="businessName" />
						<td />
					</tr>
					<tr>
						<td>Ruc:</td>
						<td><form:input path="ruc" id="ruc" />
						<td />
					</tr>
					<tr>
						<td>Direccion:</td>
						<td><form:input path="address" id="address" />
						<td />
					</tr>
				
					<tr>
						<td>Telefono:</td>
						<td><form:input path="phone" id="phone" />
						<td />
					</tr>
                               
                   <tr>
						<td>Responsable</td>
						<td><form:select path="personId">
								<option value="">Seleccione</option>
								<form:options items="${person}" itemValue="id"
									itemLabel="Name" />
							</form:select></td>
					</tr>
                               
					<tr>
						<td>Estado</td>
						<td><form:select path="statusHotel.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusHotel}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>

                       <tr>
						<td>Root:</td>
						<td><form:input path="root" id="root" />
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


