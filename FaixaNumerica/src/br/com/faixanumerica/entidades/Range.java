package br.com.faixanumerica.entidades;

import java.util.Objects;

public class Range {
	
	private int cn;
	private int prefixo;
	private int mcduInicial;
	private int mcduFinal;
	
	public int getCn() {
		return cn;
	}

	public void setCn(int cn) {
		this.cn = cn;
	}
	public int getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(int prefixo) {
		this.prefixo = prefixo;
	}
	public int getMcduInicial() {
		return mcduInicial;
	}
	public void setMcduInicial(int mcduInicial) {
		this.mcduInicial = mcduInicial;
	}
	public int getMcduFinal() {
		return mcduFinal;
	}
	public void setMcduFinal(int mcduFinal) {
		this.mcduFinal = mcduFinal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cn, mcduFinal, mcduInicial, prefixo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Range other = (Range) obj;
		return cn == other.cn && mcduFinal == other.mcduFinal && mcduInicial == other.mcduInicial
				&& prefixo == other.prefixo;
	}
	@Override
	public String toString() {
		return "Range [cn=" + cn + ", prefixo=" + prefixo + ", mcduInicial=" + mcduInicial + ", mcduFinal=" + mcduFinal
				+ "]";
	}	

}
