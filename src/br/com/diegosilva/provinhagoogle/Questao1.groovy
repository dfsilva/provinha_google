package br.com.diegosilva.provinhagoogle

def textoA = this.getClass().getClassLoader().getResourceAsStream("textoA").getText();
def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();

def matcherA = textoA =~ /\b[ac-z]{2}[ace-jm-oq-y]\b/
def matcherB = textoB =~ /\b[ac-z]{2}[ace-jm-oq-y]\b/

println 'Texto A possui: '+matcherA.size()+' preposicoes'
println 'Texto B possui: '+matcherB.size()+' preposicoes'
