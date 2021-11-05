<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- Required meta tags -->
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <title>Cadastro Professor</title>
      <!-- base:css -->
      <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/vendors/mdi/css/materialdesignicons.min.css">
      <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/vendors/feather/feather.css">
      <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/vendors/base/vendor.bundle.base.css">
      <!-- endinject -->
      <!-- plugin css for this page -->
      <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/vendors/select2/select2.min.css">
      <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/vendors/select2-bootstrap-theme/select2-bootstrap.min.css">
      <!-- End plugin css for this page -->
      <!-- inject:css -->
      <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/css/style.css">
      <!-- endinject -->
      <link rel="shortcut icon" href="/Projeto_Escolar/resources/bootstrap/images/favicon.png" />
      <style>
         .form-check-input {
         margin-top: 0.3rem;
         margin-left: 0;
         position: relative;
         }
      </style>
   </head>
   <body>
      <div class="container-scroller">
         <!-- partial:../../partials/_navbar.html -->
         <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
            <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
            </div>
         </nav>
         <!-- partial -->
         <div class="container-fluid page-body-wrapper">
            <!-- partial:../../partials/_sidebar.html -->
            <nav class="sidebar sidebar-offcanvas" id="sidebar">
               <div class="user-profile">
               </div>
               <ul class="nav">
               </ul>
            </nav>
            <!-- partial -->
            <div class="main-panel">
               <div class="content-wrapper">
                  <div class="row">
                     <div class="col-12 grid-margin stretch-card">
                        <div class="card">
                           <div class="card-body">
                              <h4 class="card-title">Cadastro de Professor</h4>
                              <form id="myForm" class="forms-sample" method="post" action="/Projeto_Escolar/cadProfessor">
                                 <div class="form-group">
                                    <label for="exampleInputName1">Nome</label>
                                    <input type="text" class="form-control" id="nome_prof" name="nome_prof" required oninvalid="this.setCustomValidity('Campo requerido')" placeholder="Nome" onchange="try{setCustomValidity('')}catch(e){}"onfocus="this.value='';">
                                 </div>
                                 <label class="form-check-label" >Ativo</label>
                                 <div class="form-check">
                                    <input value="1"class="form-check-input" type="checkbox" id="ativo" name="ativo">
                                    
                                 </div>
                                 <button type="submit" class="btn btn-primary mr-2" id="Cadastrar" name="Cadastrar" >Cadastrar</button>
                                 <button type="submit" class="btn btn-inverse-warning btn-fw mr-2" id="Reset" name="Reset" onclick="myFunction()">Limpar</button>
                                 <a class="btn btn-light" href="http://localhost:8080/Projeto_Escolar/" role="button">Voltar</a>
                                 <script>
	                                 function myFunction() {
	                               	  document.getElementById("myForm").reset();
	                               	}
	                             </script>                               
                              </form>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
               <!-- content-wrapper ends -->
               <!-- partial:../../partials/_footer.html -->
               <!-- partial -->
            </div>
            <!-- main-panel ends -->
         </div>
         <!-- page-body-wrapper ends -->
      </div>
      <!-- container-scroller -->
      <!-- base:js -->
      <script src="/Projeto_Escolar/resources/bootstrap/vendors/base/vendor.bundle.base.js"></script>
      <!-- endinject -->
      <!-- inject:js -->
      <script src="/Projeto_Escolar/resources/bootstrap/js/off-canvas.js"></script>
      <script src="/Projeto_Escolar/resources/bootstrap/js/hoverable-collapse.js"></script>
      <script src="/Projeto_Escolar/resources/bootstrap/js/template.js"></script>
      <!-- endinject -->
      <!-- plugin js for this page -->
      <script src="/Projeto_Escolar/resources/bootstrap/vendors/typeahead.js/typeahead.bundle.min.js"></script>
      <script src="/Projeto_Escolar/resources/bootstrap/vendors/select2/select2.min.js"></script>
      <!-- End plugin js for this page -->
      <!-- Custom js for this page-->
      <script src="/Projeto_Escolar/resources/bootstrap/js/file-upload.js"></script>
      <script src="/Projeto_Escolar/resources/bootstrap/js/typeahead.js"></script>
      <script src="/Projeto_Escolar/resources/bootstrap/js/select2.js"></script>
      <!-- End custom js for this page-->
   </body>
</html>