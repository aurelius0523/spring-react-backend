

<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
  <jsp:directive.attribute name="book" type="your.package.Book" required="true" />
  <h1>${book.title}</h1>
  <span>${book.summary}</span>
  
  
</jsp:root>