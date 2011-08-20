package br.com.diegosilva.provinhagoogle

def textoA = this.getClass().getClassLoader().getResourceAsStream("textoA").getText();
def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();

def matcher = textoA =~ /\b[ac-z]{2}[ace-jm-oq-y]\b/
def matcher2 = textoB =~ /\b[ac-z]{2}[ace-jm-oq-y]\b/

def preposicoesTextoA = [];
def preposicoesTextoB = [];

matcher.each {preposicoesTextoA+=it }
println 'Texto A possui: '+preposicoesTextoA.size+' preposicoes'

matcher2.each {preposicoesTextoB+=it }
println 'Texto B possui: '+preposicoesTextoB.size+' preposicoes'
