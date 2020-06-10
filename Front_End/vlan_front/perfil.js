var templateFoto = '<img src="{{FOTO}}" width="100px">';
var templateBio = '<h3> {{NOME}} </h3>' +
                  '<p> ' +
                  '<strong>RACF : </strong> {{RACF}} <br>'+
                  '<strong>EMAIL: </strong> {{EMAIL}} <br>'+
                  '<strong>DEPTO: </strong> {{DEPARTAMENTO}}'+
                  '</p>'+
                  '<strong> Computador </strong> <br>'+
                  'Num Serie : {{NUMSERIE}} <br>'+
                  'Conector  : {{CONECTOR}} <br>'+
                  'Descricao : {{DESCRICAO}} </p>';

function mostrarPerfil(){
    var userTxt = localStorage.getItem("userVlan");

    if(!userTxt){
        windows.location = "login.html" //não tenho o "token", voltar pro index
    }

    var user = JSON.parse(userTxt); //converti o texto para um objeto javascript

    // a ideia aqui é preencher as coisas

    //foto
    var strFoto = templateFoto.replace("{{FOTO}}",user.linkFoto);
    document.getElementById("fotoUser").innerHTML = strFoto;

    var strBio = templateBio.replace("{{NOME}}",user.nome)
                            .replace("{{RACF}}",user.racf)
                            .replace("{{EMAIL}}",user.email)
                            .replace("{{DEPARTAMENTO}}",user.departamento.nome)
                            .replace("{{NUMSERIE}}",user.computador.numSerie)
                            .replace("{{CONECTOR}}",user.computador.conectorRede)
                            .replace("{{DESCRICAO}}",user.computador.descricao)
    document.getElementById("bioUser").innerHTML = strBio;

}

function logout(){
    localStorage.removeItem("userVlan");
    window.location = "login.html";
}