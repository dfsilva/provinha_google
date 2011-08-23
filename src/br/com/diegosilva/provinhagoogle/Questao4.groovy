package br.com.diegosilva.provinhagoogle

def textoA = this.getClass().getClassLoader().getResourceAsStream("textoA").getText();
def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();

def listaA = textoA.tokenize()
listaA.sort(new GooglonLexicalComparator())

println 'Lista vocabulário texto A: '+ listaA.unique().join(' ')

def listaB = textoB.tokenize()
listaB.sort(new GooglonLexicalComparator())

println 'Lista vocabulário texto B: '+listaB.unique().join(' ')


class GooglonLexicalComparator implements Comparator<String>{
	private static final String ALFABETO = "lcwxqtpsvmknjrfdzbgh"
	int compare(x,y){
		def tamanho = x.length() > y.length() ? y.length(): x.length()
		int comparator = 0;
		for(int i=0; i< tamanho; i++){
			comparator = ALFABETO.indexOf(x[i]) <=> ALFABETO.indexOf(y[i])
			if(comparator != 0){
				break
			}
		}
		return comparator;
	}
}

