 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:choose>
 <c:when test="${mode == 'MODE_HOME'}">
 	<div class="container invisivle-at-first" id="homeDiv">
	  <div class="jumbotron text-center">
	  	<h3>Welcome Spring Boot</h3>
	  </div>
	</div>
 </c:when>
 	<c:when test="${mode == 'MODE_TASKS'}">
 		<div class="container text-center invisible-at-first" id="taskDiv">
 	<h3>Employee Listing</h3>
				<hr>
	  	<div class="table-responsive">
	  		<table class="table table-striped table-bordered text-left">
	  			<thead>
	  				<tr>
	  				 	<!-- <th>Id</th> -->
	  				 	<th>Name</th>
	  				 	<th>Surname</th>
	  				 	<th>Salary</th>
	  				</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach var="task" items="${tasks}">
	  					<tr>
	  						<!--<td>${task.id}</td> -->
	  						<td>${task.employee_name}</td>
	  						<td>${task.employee_surname}</td>
	  						<td>${task.employee_salary}</td>
	  						<td><a href="update-task?id=${task.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
	  						<td><a href="delete-task?id=${task.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
	  						
	  					</tr>
	  				</c:forEach>
	  			</tbody>
	  		</table>
	  	</div>
</div> 
 	</c:when>
 	<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
 		<div class="container text-center">
	<h3>Employee Record</h3>
	<hr>
	<form class="form-horizontal" method="POST" action="save-task">
					<input type="hidden" name="id" value="${task.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employee_name" value="${task.employee_name}"/>
						</div>				
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Surname</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employee_surname" value="${task.employee_surname}"/>
						</div>				
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Salary</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employee_salary" value="${task.employee_salary}"/>
						</div>				
					</div>	
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>	
<c:when test="${mode == 'MODE_HOME'}">
 	<div class="container invisivle-at-first" id="homeDiv">
	  <div class="jumbotron text-center">
	  	<h3>Welcome Spring Boot</h3>
	  </div>
	</div>
 </c:when>
 	<c:when test="${mode == 'MODE_DEPARTMENT'}">
 		<div class="container text-center invisible-at-first" id="taskDiv">
 	<h3>Department Listing</h3>
				<hr>
	  	<div class="table-responsive">
	  		<table class="table table-striped table-bordered text-left">
	  			<thead>
	  				<tr>
	  				 	<!-- <th>Id</th> -->
	  				 	<th>Name</th>
	  				 	<th>Description</th>
	  				 	
	  				</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach var="task" items="${tasks}">
	  					<tr>
	  						<!--<td>${task.id}</td> -->
	  						<td>${task.department_name}</td>
	  						<td>${task.department_description}</td>
	  					
	  						<td><a href="update-department?id=${task.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
	  						<td><a href="delete-department?id=${task.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
	  						
	  					</tr>
	  				</c:forEach>
	  			</tbody>
	  		</table>
	  	</div>
</div> 
 	</c:when>
 	<c:when test="${mode == 'MODE_NEW_DEPARTMENT' || mode == 'MODE_UPDATE_DEPARTMENT'}">
 		<div class="container text-center">
	<h3>Department Record</h3>
	<hr>
	<form class="form-horizontal" method="POST" action="save-department">
					<input type="hidden" name="id" value="${task.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="department_name" value="${task.department_name}"/>
						</div>				
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Description</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="department_description" value="${task.department_description}"/>
						</div>				
					</div>
					
					
					
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>	
 <c:when test="${mode == 'MODE_MEETINGS'}">
 		<div class="container text-center invisible-at-first" id="taskDiv">
 	<h3>Meetings Listing</h3>
				<hr>
	  	<div class="table-responsive">
	  		<table class="table table-striped table-bordered text-left">
	  			<thead>
	  				<tr>
	  				 	<!-- <th>Id</th> -->
	  				 	<th>Name</th>
	  				 	<th>Description</th>
	  				 	
	  				</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach var="task" items="${tasks}">
	  					<tr>
	  						<!--<td>${task.id}</td> -->
	  						<td>${task.meetings_name}</td>
	  						<td>${task.meetings_description}</td>
	  						
	  						<td><a href="update-meetings?id=${task.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
	  						<td><a href="delete-meetings?id=${task.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
	  						
	  					</tr>
	  				</c:forEach>
	  			</tbody>
	  		</table>
	  	</div>
</div> 
 	</c:when>
 	<c:when test="${mode == 'MODE_NEW_MEETINGS' || mode == 'MODE_UPDATE_MEETINGS'}">
 		<div class="container text-center">
	<h3>Meetings Record</h3>
	<hr>
	<form class="form-horizontal" method="POST" action="save-meetings">
					<input type="hidden" name="id" value="${task.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="meetings_name" value="${task.meetings_name}"/>
						</div>				
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Description</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="meetings_description" value="${task.meetings_description}"/>
						</div>				
					</div>
					
					
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>	

	</c:choose>