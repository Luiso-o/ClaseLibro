package Libros;

public class Libro {
	
	//Atributos
	private int ibsn;
	private String titulo;
	private String autor;
	private int paginas;
	
	//constructor con todos los parametros
	public Libro(int ibsn, String titulo, String autor, int paginas) {
		
		this.ibsn = ibsn;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		
	}

	//metodos publicos
	public int getIbsn() {
		return ibsn;
	}	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	@Override
	public String toString() {
		return "El libro "+ibsn+ " creado por el autor "+autor+" tiene "+paginas+" paginas.\n";
	}
		
}
