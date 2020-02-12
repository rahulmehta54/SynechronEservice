<jsp:include page="menu.jsp" />
<body>
	<%-- <font color="red">${errorMessage}</font>
	<form method="post" action="/login">
		Email : <input type="email" name="emailIId" /> Password : <input
			type="password" name="password" /> <input type="submit" />
	</form> --%>

	<div class="container h-100">
		
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
				<div class="d-flex justify-content-center">
					<div class="brand_logo_container">
						<img
							src="https://cdn.shopify.com/s/files/1/0092/3120/4403/files/playboy_logo_2_1200x1200.jpg?v=1563709632"
							class="brand_logo" alt="Logo">
					</div>
				</div>
				
						
				<div class="d-flex justify-content-center loginf">
					<form method="post" action="/login">
						<div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="email" name="emailIId"
								class="form-control input_user" value="" placeholder="Email">
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="password"
								class="form-control input_pass" value="" placeholder="Password">
						</div>

						<div class="d-flex justify-content-center mt-3 login_container">
							<button type="submit" name="button" class="btn login_btn">Login</button>
						</div>
					</form>
				</div>

				<div class="mt-4">
					<div class="d-flex justify-content-center links">
						Don't have an account? <a href="/signup" class="ml-2">Sign Up</a>
					</div>
					<div class="d-flex justify-content-center links">
					<span><font color="black">${errorMessage}</font></span>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>