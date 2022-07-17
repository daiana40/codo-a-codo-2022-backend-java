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
					<h1>Alta</h1>
					<!-- JSP -->
					<form method="POST"
						action="<%=request.getContextPath()%>/CreateController">
						<div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">Nombre</label>
						  <input name="nombre" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Precio</label>
						  <input name="precio" type="number" class="form-control" id="exampleFormControlTextarea1">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Im&aacute;gen</label>
						  <input name="imagen" type="file" class="form-control" id="exampleFormControlTextarea1">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">C&oacute;digo</label>
						  <input name="codigo" type="text" class="form-control" id="exampleFormControlTextarea1" maxlength="7">
						</div>
						<button class="btn btn-success">
							Dar de Alta
						</button>
					</form>
				</section>
			</div>
		</main>
	</body>
</html>