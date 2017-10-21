<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</div>

<!--end-main-container-part-->

<!--Footer-part-->

<div class="row-fluid">
  <div id="footer" class="span12"> 2017 &copy; Hobbs Tech.</div>
</div>

<!--end-Footer-part-->

<script src="<c:url value="/static/js/excanvas.min.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.min.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.ui.custom.js"/>"></script> 
<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.flot.min.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.flot.resize.min.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.peity.min.js"/>"></script> 
<script src="<c:url value="/static/js/fullcalendar.min.js"/>"></script> 
<script src="<c:url value="/static/js/matrix.js"/>"></script> 
<script src="<c:url value="/static/js/matrix.dashboard.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.gritter.min.js"/>"></script> 
<script src="<c:url value="/static/js/matrix.interface.js"/>"></script> 
<script src="<c:url value="/static/js/matrix.chat.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.validate.js"/>"></script> 
<script src="<c:url value="/static/js/matrix.form_validation.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.wizard.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.uniform.js"/>"></script> 
<script src="<c:url value="/static/js/select2.min.js"/>"></script> 
<script src="<c:url value="/static/js/matrix.popover.js"/>"></script> 
<script src="<c:url value="/static/js/jquery.dataTables.min.js"/>"></script> 
<script src="<c:url value="/static/js/matrix.tables.js"/>"></script> 

<script type="text/javascript">
  // This function is called from the pop-up menus to transfer to
  // a different page. Ignore if the value returned is a null string:
  function goPage (newURL) {

      // if url is empty, skip the menu dividers and reset the menu selection to default
      if (newURL != "") {
      
          // if url is "-", it is this page -- reset the menu:
          if (newURL == "-" ) {
              resetMenu();            
          } 
          // else, send page to designated URL            
          else {  
            document.location.href = newURL;
          }
      }
  }

// resets the menu selection upon entry to this page:
function resetMenu() {
   document.gomenu.selector.selectedIndex = 2;
}
</script>
</body>
</html>
