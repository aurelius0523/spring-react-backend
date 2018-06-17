<style>
header {
	background: #63B176;
	color: #FFFFFF;
	left: 0;
	right: 0;
	padding: 0 0 0 0 !important;
	height: 73px;
}

.menu-inner {
	display: grid;
	grid-template-rows: repeat(1, 1fr);
	grid-template-columns: repeat(3, 1fr);
	padding: 0px 300px 0px 300px;
}

.menu-title {
	grid-column: 1/2;
}

.list-items {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
}

.list-items_item {
	float: left;
}

.list-items_item:hover {
	background-color: #545454
}

.menu-items {
	grid-column: 2/4;
	height: 100%;
}

.menu-items_item {
	font-size: 1.1rem;
	text-decoration: none;
	color: #FFFFFF;
	padding: 25px;
	text-align: center;
	display: block;
}

a.home-link {
	color: #FFFFFF;
	text-decoration: none;
}
</style>

<header>
	<div class="menu-inner">
		<h2>
			<a class="home-link" href="/">Spring Boot</a>
		</h2>
		<nav class="menu-items">
			<ul class="list-items">
				<li class="list-items_item"><a class="menu-items_item" href="/react">React</a></li>
				<li class="list-items_item"><a class="menu-items_item" href="${pageContext.request.contextPath}/">Home</a></li>
				<li class="list-items_item"><a class="menu-items_item" href="${pageContext.request.contextPath}/springmvc">SpringMVC</a></li>
				<li class="list-items_item"><a class="menu-items_item" href="${pageContext.request.contextPath}/apachetiles">ApacheTiles</a></li>
			</ul>
		</nav>
	</div>
</header>