<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en" >

<head>
<meta charset="UTF-8">
<link rel="apple-touch-icon" type="image/png" href="https://cpwebassets.codepen.io/assets/favicon/apple-touch-icon-5ae1a0698dcc2402e9712f7d01ed509a57814f994c660df9f7a952f3060705ee.png" />
<meta name="apple-mobile-web-app-title" content="CodePen">
<link rel="shortcut icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />
<link rel="mask-icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg" color="#111" />
<link rel="stylesheet" type="text/css" href="../css/cadColaborador.css">

  <title>Cadastro Colaborador</title>
  <script>
  window.console = window.console || function(t) {};
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
	</style>
</head>
<body translate="no" >
  <div class="container" >
    <a class="links" id="paracadastro"></a>
    <a class="links" id="paralogin"></a>
    <div class="content">      
    <div id="cadastro">
        <form method="post" action="/DesafioWeb/cadColaborador"> 
          <h1>Cadastro</h1> 
          <p> 
            <label for="nome_cad">Seu nome</label>
            <input id="nome_cad" name="nome_cad" required oninvalid="this.setCustomValidity('Campo requerido')" onchange="try{setCustomValidity('')}catch(e){}" type="text" placeholder="Luiz Augusto"  />
          </p>
          <p> 
            <input type="submit" value="Cadastrar" onfocus="this.value='';"/> 
           <a class='voltar' href= "http://localhost:8080/DesafioWeb/" role="button">Voltar</a>
            
          </p>
        </form>
      </div>
    </div>
  </div>
</body>
</html>
 
