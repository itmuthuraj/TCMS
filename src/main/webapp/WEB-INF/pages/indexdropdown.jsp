<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cascading Dropdown List with Ajax in Spring MVC Framework and Spring Data JPA</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){

	$('#comboboxCourse').on('change', function(){
		var courseId = $(this).val();
		$.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/demo/loadBatchByCourse/' + courseId,
			success: function(result) {
				var result = JSON.parse(result);
				var s = '';
				for(var i = 0; i < result.length; i++) {
					s += '<option value="' + result[i].id + '">' + result[i].name + '</option>';
				}
				$('#comboboxBatch').html(s);
			}
		});
	});


	/* $('#comboboxState').on('change', function(){
		var stateId = $(this).val();
		$.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/demo/loadCitiesByState/' + stateId,
			success: function(result) {
				var result = JSON.parse(result);
				var s = '';
				for(var i = 0; i < result.length; i++) {
					s += '<option value="' + result[i].id + '">' + result[i].name + '</option>';
				}
				$('#comboboxCity').html(s);
			}
		});
	});
 */


});
</script>
</head>
<body>

	<form>
		<table>
			<tr>
				<td>Course</td>
				<td>
					<select id="comboboxCourse" style="width:200px">
					<option value="">Select a Course</option>
						<c:forEach var="course" items="${courses }">
							<option value="${course.id}">${course.name }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>Batch</td>
				<td>
					<select id="comboboxBatch" style="width:200px"></select>
				</td>
			</tr>
			
		</table>
	</form>

</body>
</html>