package br.com.diegosilva.provinhagoogle

def textoA = this.getClass().getClassLoader().getResourceAsStream("textoA").getText();
def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();

def listaA = textoA.tokenize()

def alphabeto = "lcwxqtpsvmknjrfdzbgh"

listaA.sort{x,y->
	def tamanho = x.length() > y.length() ? y.length(): x.length()
	def comparator = 0;
	for(int i=0; i< tamanho; i++){
		comparator = alphabeto.indexOf(x[i]) <=> alphabeto.indexOf(y[i])
		if(comparator != 0){
			break
		}
	}
	comparator
}

println 'Lista vocabulário texto A: '+ listaA.unique().join(' ')

def listaB = textoB.tokenize()

listaB.sort{x,y->
	def tamanho = x.length() > y.length() ? y.length(): x.length()
	def comparator = 0;
	for(int i=0; i< tamanho; i++){
		comparator = alphabeto.indexOf(x[i]) <=> alphabeto.indexOf(y[i])
		if(comparator != 0){
			break
		}
	}
	comparator
}

println 'Lista vocabulário texto B: '+listaB.unique().join(' ')

