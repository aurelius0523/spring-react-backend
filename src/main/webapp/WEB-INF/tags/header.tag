<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="orientation" required="true"%>
<%@ attribute name="cssOverride"%>

<script src="/static/dist/test.js"></script>

<style>
.test {
	color: blue;
}
</style>

<div class="test">
	<c:choose>

		<c:when test="${orientation eq 'horizontal'}">
	Software&nbsp;&nbsp;&nbsp;Hardware
	</c:when>
		<c:otherwise>
		Software<br />
		Hardware
	</c:otherwise>

	</c:choose>
</div>

<style>
@import
"${cssOverride}"
</style>
