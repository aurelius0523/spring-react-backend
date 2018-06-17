<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<style>
ul.todo-list>li {
	margin: 4px
}

h6>i>a {
	text-decoration: none;
}
</style>

<body>
	<h2>A relatively simple Spring Boot project running Apache Tiles.</h2>
	<h3>What was done in Spring:</h3>
	<ul class="todo-list">
		<li><i>Apache Tiles</i></li>
		<li><i>package.json to handle ES6 transpilation</i></li>
		<li><i>Utilized <strong>builders</strong> in Eclipse to automatically transpile js on modification
		</i></li>
		<li><i>JSP Tag Files - it allows some pretty neat JS overriding/props passing. Basically functions more like a component</i></li>
		<li><i>Added Emmet!</i></li>
		<li><i>JUnit</i></li>
		<li><i>Applied <a href="https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html">Maven Standard Directory Layout</a></i></li>
	</ul>

	<h3>What was done but scrapped/failed</h3>
	<ul class="todo-list">
		<li><i>Webpack. Still figuring out how to separate js bundles</i></li>
		<li><i>Sitemesh 3. It's not actively maintained and Java Configuration seems buggy</i></li>
		<li><i>Styled-components. I'd prefer that over CSS/LESS/SASS but have not idea how to make it work in non-JSX project</i></li>
		<li><i>LESS. Too much effort to add .less and all the conversion script for a small, non-npm project</i></li>
	</ul>

	<h6>
		<i>You wonder why is the Footer not stickied to the bottom? Try removing contents in sites like <a href="http://www.baeldung.com/">Baeldung</a> and <a href="https://reactjs.org">React</a></i> ;)
	</h6>
</body>
