package mail;

public class Email {
    protected String destinatario;
    private String corpo;

    public Email(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getMensagemCompleta() {
        return getSaudação() + "\n" + corpo;
    }

    public String getSaudação() {
		return null;
	}

    public void enviarEmail() {
        System.out.println("Enviando email para: " + destinatario);
        System.out.println(getMensagemCompleta());
    }
}

class EmailProfessor extends Email {
    public EmailProfessor(String destinatario) {
        super(destinatario);
    }

    @Override
    public String getSaudação() {
        return "Olá Prof. " + destinatario + "!";
    }
}

 class EmailAluno extends Email {
    public EmailAluno(String destinatario) {
        super(destinatario);
    }

    @Override
    public String getSaudação() {
        return "Olá Aluno " + destinatario + "!";
    }
}

 