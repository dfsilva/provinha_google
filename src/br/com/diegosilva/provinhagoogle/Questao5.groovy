package br.com.diegosilva.provinhagoogle

def textoA = this.getClass().getClassLoader().getResourceAsStream("textoA").getText();
def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();

//questao 5
def alphabeto = "lcwxqtpsvmknjrfdzbgh"

//calcula o valor de uma palavra em goglon.
def calculaValor(String palavra){
	Long retorno = 0;
	String al = "lcwxqtpsvmknjrfdzbgh"
	Long base = 1;
	for(int i=0; i< palavra.length(); i++){
		def letra = palavra[i]
		def pos = al.indexOf(letra)
		retorno +=(base*pos)
		base = base*20;
	}
	return retorno;
}

assert calculaValor("vfb") == 7088;

def numerosBonitos = new HashSet()
//verifica os numeros bonitos do texto A
textoA.split(" ").each { it->
	Long res = calculaValor(it)
	if(res >= 876389 && (res % 3 == 0)){
		numerosBonitos+=res;
	}
}

assert numerosBonitos.size() == 115

numerosBonitos = new HashSet()
//verifica os numeros bonitos do texto B
textoB.split(" ").each { it->
	Long res = calculaValor(it)
	if(res >= 876389 && (res % 3 == 0)){
		numerosBonitos+=res;
	}
}

println 'O texto B possui '+ numerosBonitos.size()+' números bonitos distintos'