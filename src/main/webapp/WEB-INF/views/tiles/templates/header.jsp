<style>
header {
	background: #63B176;
	color: #FFFFFF;
	left: 0;
	right: 0;
	padding : 0 0 0 0 !important;
}

.menu-inner {
	display: grid;
	grid-template-rows: repeat(1, 1fr);
	grid-template-columns: repeat(3, 1fr);
	padding: 0px 200px 0px 200px;
}

.menu-title {
	grid-column: 1/2;
}

.menu-items {
	grid-column: 2/4;
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
		<nav class=menu-items>
			<a href="/react"><i>React</i></a>
		</nav>
	</div>
</header>