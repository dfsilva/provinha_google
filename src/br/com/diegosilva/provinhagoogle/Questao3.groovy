package br.com.diegosilva.provinhagoogle

def textoA = this.getClass().getClassLoader().getResourceAsStream("textoA").getText();
def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();

def preposicoesTexto1pessoa = [];
def matcher4 = textoB =~ /[lpkdz][a-z]{6}[lpkdz]/
matcher4.each {preposicoesTexto1pessoa+=it }
println 'Destas preposicoes '+preposicoesTexto1pessoa.size()+' estão em 1 pessoa'