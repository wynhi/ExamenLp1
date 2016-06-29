<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<%-- <c:set var="authentication" value="${sessionScope['SPRING_SECURITY_CONTEXT'].authentication}" /> --%>
<%-- <c:set var="user" value="${authentication.details}" /> --%>


<script type="text/javascript">
contextPath = "<%=request.getContextPath()%>";
</script>

<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
        <div class="container">
        	
<%--           	<a class="brand" href="<%=request.getContextPath()%>/home/dashboard.html"><img alt="" src="<%=request.getContextPath()%>/images/logo_elecciones.jpg" width="200" height="40"> </a> --%>
		
			<div class="btn-group pull-right">
	            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
	            	<i>
	            	<img class="icon-user" src="..." width="25" height="25"/>
	            	</i>
					${user.userName}
					<span class="caret"></span>
	            </a>
	            <ul class="dropdown-menu">
	              <li><a href="#" onclick="">Editar Usuario</a></li>
	              <li class="divider"></li>
	              <li><a href="<%=request.getContextPath()%>/logout">logout</a></li>
	            </ul>
			</div>

<!-- 			<div class="navbar-search pull-right"> -->
<!-- 				<input type="text" class="search-query span3" id="header_search_input" placeholder="Buscar"> -->
<!-- 			</div> -->
			<form class="navbar-search pull-right" action="<%=request.getContextPath()%>/profile/dashboard.html" method="post" name="profileFormHeader">
				<!--	Search for players, teams and fields	-->
				<input type="hidden" name="playerId">
			</form>
			
			<div class="nav-collapse">
				<nav class="nav">
					<ul class="nav">
						<li <c:if test="${menuHeader eq 'home'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/home/dashboard.html">Home</a></li>
						<li <c:if test="${menuHeader eq 'home'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/home/hotel.html">Hotel</a></li>
						<li <c:if test="${menuHeader eq 'home'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/home/product.html">Producto</a></li>
						<li <c:if test="${menuHeader eq 'home'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/home/customer.html">Cliente</a></li>
						<li <c:if test="${menuHeader eq 'home'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/home/ticket.html">Ticket</a></li>
						<li <c:if test="${menuHeader eq 'home'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/home/ticket.html">Ticket Description</a></li>
						<li <c:if test="${menuHeader eq 'admin'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/admin/dashboard.html">Admin</a></li>
						<li <c:if test="${menuHeader eq 'userSystem'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/admin/userSystem.html">Usuario</a></li>

					</ul>
				</nav>
			</div>
		</div>
	</div>
</div>
