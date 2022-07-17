<%@page import="java.util.List"%>
<%@page import="ar.com.codoacodo.dto.Producto"%>
<html>
	<head>
		<link href="<%=request.getContextPath()%>/bootstrap.min.css" rel="stylesheet" type="text/css">
	</head>

	<body>
		<!-- ACA VA EL NAVBAR -->
		<%@include file="navbar.jsp" %>
		<main>
			<div class="container">
				<section>
					<h1>Listado</h1>
					<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">ID</th>
					      <th scope="col">NOMBRE</th>
					      <th scope="col">PRECIO</th>
					      <th scope="col">C&Oacute;ODIGO</th>
					      <th scope="col">&nbsp;</th>
					    </tr>
					  </thead>
					  <%
					  //codigo java
					  //obtener el listado desde el request
					  //se guardo bajo el nombre listado
					  List<Producto> listado = (List<Producto>)request.getAttribute("listado");
					  %>
					  <tbody>
					  <!-- ESTO SE REPITE TANTA CANTIDAD DE VECES COMO ARTICULOS TENGA -->
					  <%
					  for( Producto unProducto : listado) {
					  %>
					    <tr class="table-dark">
					      <th scope="row"> <%=unProducto.getIdProducto()%>     </th>
					      <td><%=unProducto.getNombre()%></td>
					      <td><%=unProducto.getPrecio()%></td>
					      <td><%=unProducto.getCodigo()%></td>
					      <td>
					      	<a class="btn btn-danger" href="<%=request.getContextPath()%>/api/EliminarController?id=<%=unProducto.getIdProducto()%>" role="button">Eliminar</a> | 
					      	<a class="btn btn-warning" href="<%=request.getContextPath()%>/api/EditarController?id=<%=unProducto.getIdProducto()%>" role="button">Editar</a>
					      </td>
					    </tr>
					    <%
					  	 }
					    %>
					  </tbody>
					</table>
				</section>
			</div>
		</main>
	</body>
</html>