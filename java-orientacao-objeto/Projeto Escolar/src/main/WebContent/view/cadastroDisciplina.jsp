<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" import="dao.DisciplinaDAO" import="model.Disciplina" import="java.util.ArrayList" import="java.util.List"
   import="dao.ProfessorDAO" import="model.Professor"%>
   
<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- Required meta tags -->
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <title>Cadastro Disciplina</title>
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
                              <h4 class="card-title">Cadastro Disciplina</h4>
                              <form id="myForm" class="forms-sample" method="post" action="/Projeto_Escolar/cadAluno">
                                 <div class="form-group">
                                 <%
									DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
									List<Disciplina>listaPesquisada= disciplinaDAO.consultarTodos(); 
									int id=0;
								%>
                                    <label for="exampleInputName1">Professor</label>
	                                    <select id="disciplina_select" name = "disciplina_select">
	                                    <%for(int i =0; i<listaPesquisada.size();i++){ 
	                                    	id = listaPesquisada.get(i).getCodProfessor();%>
	                                        <option value="<%= id %>" >
	                                        <%
	                                        	ProfessorDAO professorDAO = new ProfessorDAO();
	                                        	Professor professor = professorDAO.Consultar(id);
		                                        out.print(professor.getNomeProfessor());
	                                                                  
	                                        %></option>
	                                      
	                                       
	                                   <%} %>
	                                   
	                                    </select>
                                 </div>
                                 <div class="form-group">
                                    <label for="exampleInputEmail3">Código</label>
                                    <input id="cpf" name="cpf" placeholder="Apenas números" class="form-control input-md" required oninvalid="this.setCustomValidity('Campo requerido')"type="text" maxlength="14" pattern="[0-9]{3}\.[0-9]{3}\.[0-9]{3}\-[0-9]{2}" onKeyPress="MascaraCPF(form.cpf);" >
                                 </div>
                                 <div class="form-group">
                                    <label for="exampleInputPassword4">Descrição</label>
                                    <input id=""descricao"" name="descricao" class="form-control input-md" required oninvalid="this.setCustomValidity('Campo requerido')" type="date" onChange="verificaData()" placeholder="MM//dd/YYY" />
                                 </div>
                                 <div class="form-group">
                                    <label for="exampleInputPassword4">Data de matrícula</label>
                                    <input id="dataMat" name="dataMat" class="form-control input-md" required oninvalid="this.setCustomValidity('Campo requerido')" type="date" onChange="verificaData()" placeholder="MM//dd/YYY" />
                                 </div>
                                 <div class="form-group">
                                    <label for="exampleInputName1">Nome do pai</label>
                                    <input type="text" class="form-control" id="nome_pai" name="nome_pai" required oninvalid="this.setCustomValidity('Campo requerido')" placeholder="Nome">
                                 </div>
                                 <div class="form-group">
                                    <label for="exampleInputName1">Nome da mãe</label>
                                    <input type="text" class="form-control" id="nome_mae" name="nome_mae" required oninvalid="this.setCustomValidity('Campo requerido')" placeholder="Nome">
                                 </div>
                                 <div class="form-group">
                                    <label for="exampleInputName1">Responsável legal</label>
                                    <input type="text" class="form-control" id="nome_resp" name="nome_resp" required oninvalid="this.setCustomValidity('Campo requerido')" placeholder="Nome">
                                 </div>
                                 <div class="form-group">
                                    <label for="exampleInputName1">Telefone</label>
                                    <input id="prependedtext" name="celular" class="form-control" placeholder="XX XXXXX-XXXX" required oninvalid="this.setCustomValidity('Campo requerido')" type="text" maxlength="15" onKeyPress="MascaraTelefone(form.celular);">
                                 </div>
                                 <label class="form-check-label" >Matriculado</label>
                                 <div class="form-check">
                                    <input value="1"class="form-check-input" type="checkbox" id="matriculaddo" name="matriculaddo">
                                    
                                 </div>
                                 <button type="submit" class="btn btn-primary mr-2" id="Cadastrar" name="Cadastrar" >Cadastrar</button>
                                 <button type="submit" class="btn btn-inverse-warning btn-fw mr-2" id="Reset" name="Reset" onclick="myFunction()">Limpar</button>
                                 <a class="btn btn-light" href="http://localhost:8080/Projeto_Escolar/" role="button">Voltar</a>
                                 
                                 <script>
                                 	function myFunction() {
                                	  document.getElementById("myForm").reset();
                                	}
                                    function MascaraCPF(cpf){
                                    if(mascaraInteiro(cpf)==false){
                                          event.returnValue = false;
                                    }       
                                    return formataCampo(cpf, '000.000.000-00', event);
                                    }
                                    
                                    function mascaraInteiro(){
                                    if (event.keyCode < 48 || event.keyCode > 57){
                                          event.returnValue = false;
                                          return false;
                                    }
                                    return true;
                                    }
                                    
                                    function formataCampo(campo, Mascara, evento) { 
                                    var boleanoMascara; 
                                    
                                    var Digitato = evento.keyCode;
                                    exp = /\-|\.|\/|\(|\)| /g
                                    campoSoNumeros = campo.value.toString().replace( exp, "" ); 
                                    
                                    var posicaoCampo = 0;    
                                    var NovoValorCampo="";
                                    var TamanhoMascara = campoSoNumeros.length;; 
                                    
                                    if (Digitato != 8) { // backspace 
                                          for(i=0; i<= TamanhoMascara; i++) { 
                                                  boleanoMascara  = ((Mascara.charAt(i) == "-") || (Mascara.charAt(i) == ".")
                                                                                          || (Mascara.charAt(i) == "/")) 
                                                  boleanoMascara  = boleanoMascara || ((Mascara.charAt(i) == "(") 
                                                                                          || (Mascara.charAt(i) == ")") || (Mascara.charAt(i) == " ")) 
                                                  if (boleanoMascara) { 
                                                          NovoValorCampo += Mascara.charAt(i); 
                                                            TamanhoMascara++;
                                                  }else { 
                                                          NovoValorCampo += campoSoNumeros.charAt(posicaoCampo); 
                                                          posicaoCampo++; 
                                                    }              
                                            }      
                                          campo.value = NovoValorCampo;
                                            return true; 
                                    }else { 
                                          return true; 
                                    }
                                    }
                                    
                                    function MascaraTelefone(tel){  
                                    if(mascaraInteiro(tel)==false){
                                          event.returnValue = false;
                                    }       
                                    return formataCampo(tel, '(00) 00000-0000', event);
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