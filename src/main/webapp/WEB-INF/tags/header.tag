<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="orientation" required="true"%>

<script src="/dist/test.js"></script>
<c:choose>
	<c:when test="${orientation eq 'horizontal'}">
	Software&nbsp;&nbsp;&nbsp;Hardware
	</c:when>
	<c:otherwise>
		Software<br />
		Hardware
	</c:otherwise>
</c:choose>