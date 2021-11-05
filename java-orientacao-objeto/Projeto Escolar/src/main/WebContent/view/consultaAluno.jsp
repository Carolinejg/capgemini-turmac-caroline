<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
    import="java.util.ArrayList" import="java.util.List" import="dao.AlunoDAO" import=" model.Aluno" %>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Regal Admin</title>
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
        <% AlunoDAO alunoDAO=new AlunoDAO(); List<Aluno>listaPesquisada= alunoDAO.consultarTodos();

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
                                            <h4 class="card-title">Alunos Cadastrados</h4>
                                                <div class="table-responsive pt-3">
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th>Identificador</th>
                                                            <th>Nome</th>
                                                            <th>Cpf</th>
                                                            <th>Data nascimento</th>
                                                            <th>Data matrícula</th>
                                                            <th>Nome pai</th>
                                                            <th>Nome mãe</th>
                                                            <th>Responsável</th>
                                                            <th>Telefone</th>
                                                            <th>Matriculado?</th>

                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <% for(int i=0; i<listaPesquisada.size();i++){ %>
                                                            <tr>
                                                                <td><%out.print(listaPesquisada.get(i).getCodAluno());%></td>
                                                                <td><%out.print(listaPesquisada.get(i).getNomeAluno());%></td>
                                                                <td><%out.print(listaPesquisada.get(i).getCpfAluno());%></td>
                                                                <td><%out.print(listaPesquisada.get(i).getDataNascimento());%></td>
                                                                <td><%out.print(listaPesquisada.get(i).getDataMatricula());%></td>
                                                                <td><% out.print(listaPesquisada.get(i).getNomePai());%></td>
                                                                <td><% out.print(listaPesquisada.get(i).getNomeMae());%></td>
                                                                <td><%out.print(listaPesquisada.get(i).getResponsavel());%></td>
                                                                <td><%out.print(listaPesquisada.get(i).getFoneResponsavel());%></td>
                                                                <td><% 
                                                                	if(listaPesquisada.get(i).isMatriculado()){
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