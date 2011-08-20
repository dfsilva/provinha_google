package br.com.diegosilva.provinhagoogle

def textoA = this.getClass().getClassLoader().getResourceAsStream("textoA").getText();
def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();

//questao 5
def alphabeto = "lcwxqtpsvmknjrfdzbgh"

//calcula o valor de uma palavra em goglon.
def calculaValor(String palavra){
	Long retorno = 0;
	String al = "lcwxqtpsvmknjrfdzbgh"
	for(int i=0; i< palavra.length(); i++){
		def letra = palavra[i]
		def pos = al.indexOf(letra)
		println pos
	}
}

textoA.split(" ").each { it-> calculaValor(it) }