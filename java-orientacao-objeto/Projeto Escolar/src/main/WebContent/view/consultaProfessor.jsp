<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
    import="java.util.ArrayList" import="java.util.List" import="dao.ProfessorDAO" import=" model.Professor" %>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Consulta Professor</title>
        <!-- base:css -->
        <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/vendors/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/vendors/feather/feather.css">
        <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/vendors/base/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- inject:css -->
        <link rel="stylesheet" href="/Projeto_Escolar/resources/bootstrap/css/style.css">
        <!-- endinject -->
        <link rel="shortcut icon" href="/Projeto_Escolar/resources/bootstrap/images/favicon.png" />
    </head>

    <body>
        <% ProfessorDAO professorDAO=new ProfessorDAO(); List<Professor>listaPesquisada= professorDAO.consultarTodos();

            %>
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

                    </nav>
                    <!-- partial -->
                    <div class="main-panel">
                        <div class="content-wrapper">
                            <div class="row">
                                <div class="col-lg-12 grid-margin stretch-card">
                                    <div class="card">
                                        <div class="card-body">
                                            <h4 class="card-title">Professores Cadastrados</h4>
                                                <div class="table-responsive pt-3">
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th>Identificador</th>
                                                            <th>Nome</th>
                                                            <th>Ativo?</th>

                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <% for(int i=0; i<listaPesquisada.size();i++){ %>
                                                            <tr>
                                                                <td><%out.print(listaPesquisada.get(i).getCodProfessor());%></td>
                                                                <td><%out.print(listaPesquisada.get(i).getNomeProfessor());%></td>
                                                                <td><% 
                                                                	if(listaPesquisada.get(i).isAtivo()){
                                                                        out.print("Sim"); 
                                                                    }
                                                                	else{ 
                                                                		out.print("Não"); 
                                                                	} %></td>
                                                            </tr>
                                                            <%} %>
                                                    </tbody>
                                                </table>
                                                
                                            </div>
                                            <a class="btn btn-light" href="http://localhost:8080/Projeto_Escolar/" role="button">Voltar</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- partial -->
                    </div>
                    <!-- main-panel ends -->
                </div>
                <!-- page-body-wrapper ends -->
            </div>
            
            <script src="/Projeto_Escolar/resources/bootstrap/vendors/base/vendor.bundle.base.js"></script>
            <script src="/Projeto_Escolar/resources/bootstrap/js/off-canvas.js"></script>
            <script src="/Projeto_Escolar/resources/bootstrap/js/hoverable-collapse.js"></script>
            <script src="/Projeto_Escolar/resources/bootstrap/js/template.js"></script>
            
    </body>

</html>