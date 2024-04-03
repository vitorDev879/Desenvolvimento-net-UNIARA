<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	class Pessoa { 
    		private String name; 
    		private String rg;
    		private String cpf; 
    		private String dataNascimento; 
    		private String estadoCivil;
    		
    		public Pessoa(String name, String rg, String cpf, String dataNascimento, String estadoCivil) {
    		
    			this.name = name; 
    			this.rg = rg;
    			this.cpf = cpf; 
    			this.dataNascimento = dataNascimento; 
    			this.estadoCivil = estadoCivil;
    		}		
    		
    		public String getName(){
    			return name; 
    		}
    		
    		public String getRG(){
    			return rg; 
    		}
    		
    		public String getCPF(){
    			return cpf; 
    		}
    		
    		public String getDataNascimento(){
    			return dataNascimento; 
    		}
    		
    		public String getEstadoCivil(){
    			return estadoCivil; 
    		}
    }
    
    		String username = request.getParameter("username"); 
    		String password = request.getParameter("password");
    		
    		
    		
    		if("vitor".equals(username) && "1234".equals(password)) {
    			Pessoa pessoa = new Pessoa("Vitor", "1234", "123.456.789-10","18/06/2003","solteiro");
   
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h2>User</h2>
	<p>Name: <%= pessoa.getName() %></p>
	<p>RG: <%=pessoa.getRG() %></p>
	<p>CPF: <%=pessoa.getCPF() %></p>
	<p>Data de nascimento: <%=pessoa.getDataNascimento() %></p>
	<p>Estado civil: <%=pessoa.getEstadoCivil() %></p>
</body>
</html>
	<%
	} else { 
		out.print("<h2>Usuário ou senha incorretos, tente novamente</h2>");
		}
    %>	