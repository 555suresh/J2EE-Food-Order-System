<%-- 
    Document   : navbar2
    Created on : Feb 1, 2015, 2:25:42 PM
    Author     : Suresh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    .span3-my {
   
    margin-left: -75px!important;
}

.navbar .nav {
    
    margin: 0px 160px 0px 0px !important;
}

#headerSection:hover {
    background:none!important;
    border-bottom: 0px solid #DEDEDE;
    padding:8px 50px 0px;
    font-size:  30px;
    
}
li a:hover{
    font-size: 20px;
 color: #000;
}
</style>
<div id="headerSection">
	<div class="container">
            
            <div class="span3-my">
                
                <h2 class="cntr"><i class="icon-phone-sign"></i> 450-635-5236</h2>
                <h5 class="cntr">Order now !!!! </h5> 
                
            </div>
            
           
            
          
            <div class="navbar" style="margin-top: 20px;">
			<div class="nav-collapse">
				<ul class="nav">
					<li class="active"><a href="index.jsp">Home	</a></li>
                                        <li><a href="menu.jsp">Menu</a></li>
                                        <li><a href="myres.jsp">My recipe</a></li>
					<li><a href="order.jsp">Order</a></li>					
                                        <li><a href="about.jsp">about us</a></li>
					<li><a href="contact.jsp">contact us</a></li>
                                        <li><a class="btn" data-toggle="modal" href="#myModal" >User</a></li>
					<li><a href="#logout">Logout</a></li>
					
                                       
				</ul>
			</div>
			<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
		</div>
	</div>
	</div>
<%@include file="login.jsp" %>