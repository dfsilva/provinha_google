package br.com.diegosilva.provinhagoogle

def textoB = this.getClass().getClassLoader().getResourceAsStream("textoB").getText();
def matcher = textoB =~ /[lpkdz][a-z]{6}[lpkdz]/
println 'Destes verbos '+matcher.size()+' estão em 1a pessoa'