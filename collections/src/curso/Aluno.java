package curso;

public class Aluno {

    private String nome;
    private int Matricula;

    public Aluno(String nome, int Matricula) {
    	if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.Matricula = Matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return Matricula;
    }
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (Matricula != other.Matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
    
    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.Matricula + "]";
    }
}
