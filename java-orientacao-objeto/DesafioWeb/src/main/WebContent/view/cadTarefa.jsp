<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.ArrayList" import="java.util.List" import="dao.ColaboradorDAO" 
import=" entity.Colaborador"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <link rel="apple-touch-icon" type="image/png" href="https://cpwebassets.codepen.io/assets/favicon/apple-touch-icon-5ae1a0698dcc2402e9712f7d01ed509a57814f994c660df9f7a952f3060705ee.png" />
        <meta name="apple-mobile-web-app-title" content="CodePen" />
        <link rel="shortcut icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />
        <link rel="mask-icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg" color="#111" />
        <link rel="stylesheet" type="text/css" href="../css/cadColaborador.css" />

        <title>Cadastro Tarefa</title>
        <script>
            window.console = window.console || function (t) {};
        </script>
        <script>
            if (document.location.search.match(/type=embed/gi)) {
                window.parent.postMessage("resize", "*");
            }
        </script>
        <style>
			.voltar {
			  width: 50%!important;
			    cursor: pointer;
			    background: #3d9db3;
			    padding: 8px 194px;
			    color: #fff;
			    font-size: 20px;
			    border: 1px solid #fff;
			    margin-bottom: 10px;
			    text-shadow: 0 1px 1px #333;
			    -webkit-border-radius: 5px;
			    border-radius: 5px;
			    transition: all 0.2s linear;
			}
			.colaborador{
				width: 100%;
			    margin-top: 4px;
			    padding: 10px;
			    border: 1px solid #b2b2b2;
			    -webkit-border-radius: 3px;
			    border-radius: 3px;
			    -webkit-box-shadow: 0px 1px 4px 0px rgb(168 168 168 / 60%) inset;
			    box-shadow: 0px 1px 4px 0px rgb(168 168 168 / 60%) inset;
			    -webkit-transition: all 0.2s linear;
			    transition: all 0.2s linear;
			}
	</style>
    </head>
    <body translate="no">
        <div class="container">
            <a class="links" id="paracadastro"></a>
            <a class="links" id="paralogin"></a>
            <div class="content">
                <div id="cadastro">
                    <form method="post" action="http://localhost:8080/DesafioWeb/cadTarefa">
                        <h1>Cadastro</h1>
                        <p></p>
						<%
							ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
							List<Colaborador>listaPesquisada= colaboradorDAO.consultarTodos(); 
							int id=0;
						%>
                        <div class="container">
                            <div class="row">
                                <div class="col">
                                    <label  for="nome_cad">Colaborador</label>
                                </div>
                                
                                <div class="col">
                                    <select id="colaborador_select" name = "colaborador_select" class="colaborador">
                                    <%for(int i =0; i<listaPesquisada.size();i++){ 
                                    	id = listaPesquisada.get(i).getIdColaborador();%>
                                        <option value="<%= id %>" >
                                        <%
	                                        out.print(listaPesquisada.get(i).getNomeColaborador());
                                                                  
                                        %></option>
                                      
                                       
                                   <%} %>
                                   
                                    </select>
                                    
                                    
                                </div>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <label  for="nome_cad">Status da tarefa</label>
                                </div>
                                <div class="col">
                                    <select id="status_selected" name = "status_selected" class="colaborador">
                                        <option value="Pendente" selected>Pendente</option>
                                        <option value="Em andamento">Em andamento</option>
                                        <option value="Concluída">Concluída</option>
                                    </select>
                                </div>
                            </div>
                            
                            <div class="row">
                                <div class="col">
                                    <label  for="nome_cad">Prioridade da tarefa</label>
                                </div>
                                <div class="col">
                                    <select id="prioridade_select" name ="prioridade_select"class="colaborador">
                                        <option value="Baixa" selected>Baixa</option>
                                        <option value="Média">Média</option>
                                        <option value="Alta">Alta</option>
                                    </select>
                                </div>
                            </div>
                            
                        </div>
						 <label for="nome_cad">Descrição</label>
                        <input id="nome_desc" name="nome_desc" required oninvalid="this.setCustomValidity('Campo requerido')" onchange="try{setCustomValidity('')}catch(e){}" type="text" />
                        <label class="col-md-2 control-label" for="dtInicio">Data início</label>
                        <input id="dataInicio" name="dataInicio" class="form-control input-md" required oninvalid="this.setCustomValidity('Campo requerido')" type="date" onChange="verificaData()"/>
                        <label class="col-md-2 control-label" for="dataFinal">Data Final (Não inclusa)</label>
                        <input id="dataFinal" name="dataFinal" class="form-control input-md" required oninvalid="this.setCustomValidity('Campo requerido')" type="date" onChange="verificaData()" />
                        
						
                        <p>
                        	
                            <input type="submit" value="Cadastrar" onfocus="this.value='';" id="Cadastrar" name="Cadastrar" />
                            <a class='voltar'href="http://localhost:8080/DesafioWeb/" role="button">Voltar</a>
                        </p>
                    </form>
                    <script>
                        function verificaData() {
                            var dti = document.getElementById("dataInicio");
                            var dtf = document.getElementById("dataFinal");
                            if (dti.value == "" || dtf.value == "") {
                                document.getElementById("Cadastrar").disabled = true;
                            } else {
                                if (Date.parse(dtf.value) > Date.parse(dti.value)) {
                                    document.getElementById("Cadastrar").disabled = false;
                                } else {
                                    if (Date.parse(dtf.value) > 0) {
                                        document.getElementById("Cadastrar").disabled = true;
                                        alert("Data final  precisa ser após a data inicial");
                                    }
                                }
                            }
                        }
                    </script>
                    
                </div>
            </div>
        </div>
    </body>
</html>
