var contador=1;

function mudaTexto(){
    document.getElementById("titulo2").innerHTML = "Cliquei " +contador+ " vez(es)";
    contador++;
}

function buscarUsuarios(){
    //GET
    fetch("http://localhost:8080/usuarios")
        .then(resultado => resultado.json())
        .then(resultado => preencheLinhas(resultado));
}

function preencheLinhas(lista){
    var texto = "";
    var usuario;

    for(i=0; i<lista.length; i++){
        usuario = lista[i];
        texto = texto + "Nome: "+usuario.nome+"("+usuario.email+")"+"<br>";
    }

    document.getElementById("resultado").innerHTML = texto
}