package mail;


		class Main {
		    public static void main(String[] args) {
		        EmailProfessor emailProfessor = new EmailProfessor("Alan Turing");
		        emailProfessor.setCorpo("Esta é uma mensagem para o professor.");
		        emailProfessor.enviarEmail();

		        EmailAluno emailAluno = new EmailAluno("Joseph");
		        emailAluno.setCorpo("Esta é uma mensagem para o aluno.");
		        emailAluno.enviarEmail();
		    }
		
	}


