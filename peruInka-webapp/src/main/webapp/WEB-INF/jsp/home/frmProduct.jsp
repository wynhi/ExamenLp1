<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend>Formulario Producto : ${opc}</legend>
			<form:form commandName="product" action="saveProduct" method="POST">

				<table>
					<tr>
						<td>Nombre:</td>
						<td><form:input path="productName" id="productName" />
						<td />
					</tr>
					<tr>
						<td>Precio:</td>
						<td><form:input path="price" id="price" />
						<td />
					</tr>
					<tr>
						<td>Descripcion:</td>
						<td><form:input path="description" id="description" />
						<td />
					</tr>
				
					<tr>
						<td>Atributo:</td>
						<td><form:input path="attribute" id="attribute" />
						<td />
					</tr>
					<tr>
						<td>Estado</td>
						<td><form:select path="statusProduct.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusProduct}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>	
					<tr>
						<td>Responsable</td>
						<td><form:select path="hotel">
								<option value="">Seleccione</option>
								<form:options items="${hotel}" itemValue="id"
									itemLabel="Name" />
							</form:select></td>
					</tr>		
					<tr>
						<td>Tipo de Producto:</td>
						<td><form:input path="productType" id="productType" />
						<td />
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


