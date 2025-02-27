<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList" import="java.util.List" import="dao.ColaboradorDAO" 
import=" entity.Colaborador" %>
    

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Colaboradores Cadastrados</title>

    <!-- Custom fonts for this template -->
    <link href="../resources/bootstrap/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../resources/bootstrap/css/sb-admin-2.min.css" rel="stylesheet">

    <!-- Custom styles for this page -->
    <link href="resources/bootstrap/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">
	<%
		ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
		List<Colaborador>listaPesquisada= colaboradorDAO.consultarTodosColaboradoresSemTarefa();
		 
	%>

    <!-- Page Wrapper -->
    <div id="wrapper" class="card o-hidden border-0 shadow-lg my-5">
    
        <!-- Content Wrapper -->
        <div id="content-wrapper" class="card-body">

            <!-- Main Content -->
            <div id="content">

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Colaboradores Cadastrados</h1>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>Identificador</th>
                                            <th>Nome do Colaborador</th>
                                            <th>Excluir</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
	                                     <%
	                                     	
	                                     
	                                     for(int i =0; i<listaPesquisada.size();i++){ %>
	    								<tr>
	    									<% int id = listaPesquisada.get(i).getIdColaborador();
	    									%>
		    								<td><%out.print(listaPesquisada.get(i).getIdColaborador()); %></td>
		    								<td><% out.print(listaPesquisada.get(i).getNomeColaborador());%></td>
		    								<td ><a class="btn btn-primary" href="/DesafioWeb/excluirColaborador?idColaborador=<%= id %>"
		    								
		    								role="excluirColaborador">Excluir</a>
	    								</tr>
	    								<%} %>
	    								
	    								
    								
                                    </tbody>
                                    
                                </table>
                            </div>
                        </div>
                    </div>

<a class= "btn btn-primary" align="center" href= "http://localhost:8080/DesafioWeb/" role="button">Voltar</a>



                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->


        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">�</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="resources/bootstrap/vendor/jquery/jquery.min.js"></script>
    <script src="resources/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="resources/bootstrap/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="resources/bootstrap/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="resources/bootstrap/vendor/datatables/jquery.dataTables.min.js"></script>
    <script src="resources/bootstrap/vendor/datatables/dataTables.bootstrap4.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="resources/bootstrap/js/demo/datatables-demo.js"></script>

</body>

</html>