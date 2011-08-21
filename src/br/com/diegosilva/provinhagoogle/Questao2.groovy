package br.com.diegosilva.provinhagoogle

def textoA = this.getClass().getClassLoader().getResourceAsStream("textoA").getText();
def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();


def preposicoesTextoC = [];
def matcher3 = textoB =~ /[a-z]{7}[lpkdz]/
matcher3.each {preposicoesTextoC+=it }
println 'O texto B possui '+ preposicoesTextoC.size()+' verbos'