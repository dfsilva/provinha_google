package br.com.diegosilva.provinhagoogle

def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();
def matcher3 = textoB =~ /[a-z]{7}[lpkdz]/
println 'O texto B possui '+ matcher3.size()+' verbos'