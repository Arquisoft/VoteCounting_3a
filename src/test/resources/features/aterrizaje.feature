#language: es
Característica: página de aterrizaje 
  Escenario: El cliente llama a /
    Cuando el cliente llama usa el verbo "POST" para llamar a "/"
    Entonces el cliente recibe 200
    Y el resultado contiene la cadena "Voting"
    
  Escenario: El cliente llama a /
    Cuando el cliente llama usa el verbo "GET" para llamar a "/pepepe"
    Entonces el cliente recibe 200
    Y el resultado contiene la cadena "Voting"
    