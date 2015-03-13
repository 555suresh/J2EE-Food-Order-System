<%-- 
    Document   : about
    Created on : Feb 1, 2015, 9:11:20 PM
    Author     : Suresh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>my res</title>
        <%@include  file="Import/head.jsp" %>
        <style>
            body{background-image: url(); 
                 background-size: 2500px;}

            .element {
                border-radius:0px!important;
            }
            img{width: 260px; height: 180px;}


        </style>

    </head>
    <body>
        <%@include  file="Import/navbar2.jsp" %>


        <div class="container">


            <div class="row"style="margin-top: 150px;">	


                <div class="span12 cntr">
                    <h2 style="color: #ffffff;">Let's make your food</h2>
                    <p style="color: #ffffff; font-family: monospace; font-size: 16px"><b>
                            Vivamus commodo placerat libero, eget pulvinar felis lobortis in. Curabitur ac enim nibh. Cras in odio nisi. Fusce et augue velit. Nulla convallis, ipsum vitae tristique pretium, sapien odio viverra quam, eget mollis diam risus ut mi. Nullam ultrices ornare nisl, sagittis ullamcorper dolor rutrum vitae. Sed accumsan mauris eget elit dictum vitae dapibus nisl [...]
                        </b></p>

                </div>
                <div id="myRecipySection">
                    <div class="span6">

                        <form class="form">
                            <fieldset>
                                <div class="control-group">
                                    <h4 style="color: #ffffff;"><span>Make your recipe</span></h4> <hr>
                                    <div class="controls">
                                        <input type="text" class="span3 element" id="input01" placeholder="Your Name" >
                                        <select class=" span3 element" placeholder="Your Name">
                                            <option>--select category--</option>
                                            <option>pasta and rice</option>
                                            <option>cake</option>
                                            <option>pizza</option>
                                            <option>drinks</option>

                                        </select>

                                    </div>
                                </div>
                                <div class="control-group">



                                    <div class="controls">
                                        <input type="text" class="span3 element" id="input01" placeholder="quntity" >
                                        <input type="datetime-local" class="span3 element" id="input01" placeholder="date" >


                                    </div>
                                </div>



                                <div class="controls">
                                    <textarea class="input-xxlarge element" id="textarea" rows="3" placeholder="Address"></textarea>

                                </div>

                                <div class="control-group">

                                    <div class="controls">
                                        <textarea class="input-xxlarge element"  id="textarea" rows="10" placeholder="Your note" style="height : 120px" ></textarea>
                                    </div>

                                    <div class=" alert element" style="width: 495px">
                                        <div class="controls">
                                            <input type="file" class="span6 element" id="input01" placeholder="choose file" >
                                        </div>  

                                    </div>


                                    <div class="span6 offset10" style="margin-left: 380px;">
                                        <button type="submit" class="btn btn-info input-small  ">Conform</button>
                                        <button class="btn btn-inverse ">Cancel</button>
                                    </div>
                            </fieldset>
                        </form>
                    </div> 
                    <div class="span6">	
                        <h4 style="color: #ffffff;"><span  style="margin-left: 410px">Check your recipe</span></h4> <hr>
                    </div>
                    <div class="span6">
                        <div class="alert alert-info element">
                            <h4 class="">Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;xxxxxxxxxxxxx</h4><br>
                            <h4 class="">Category&nbsp;:xxxxxxxxxxxxx</h4><br>
                            <h4 class="">Quntity&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;xxxxxxxxxxxxx</h4><br>
                            <h4 class="">Date&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:xxxxxxxxxxxxxxxxxx</h4><br>
                            <h5 class="">Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:xxxxx xxxxxxxxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxxxx</h5>
                            <h6 class=" cntr"> Check again your recipy</h6>
                            <p class="cntr">xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>


                        </div>



                    </div> 
                </div> 
            </div> 





        </div>

        <!---------------------Start Thumnail------------------------------------>          
    <marquee direction="right" >
        <div id="beforeFooter" class="cntr">
            <div class="container-fluid" style="margin-left: 40px; margin-top: 100px;">

                <div class="span4"><img src="themes/images/beforeFooter/bfr1.png" style=" width: 370px;height: 150px;"></div>
                <div class="span4"><img src="themes/images/beforeFooter/bfr2.png" style=" width: 370px;height: 150px;"></div>
                <div class="span4"><img src="themes/images/beforeFooter/bfr3.png" style=" width: 370px;height: 150px;"></div>
            </div> 

        </div>
    </marquee>
    <!---------------------End Thumnail------------------------------------>       


    <%@include  file="Import/footer.jsp" %>

</body>
</html>
