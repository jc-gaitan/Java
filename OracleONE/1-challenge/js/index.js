
var text = "";

function encriptar() {
    //obtener valor del textArea
    text = document.getElementById("textArea").value;
    //console.log(text);

    text = text.replaceAll("e", "enter");
    text = text.replaceAll("i", "imes");
    text = text.replaceAll("a", "ai");
    text = text.replaceAll("o", "ober");
    text = text.replaceAll("u", "ufat");

    view();
}

function desencriptar() {
    text = document.getElementById("textArea").value;

    text = text.replaceAll("enter", "e");
    text = text.replaceAll("imes", "i");
    text = text.replaceAll("ai", "a");
    text = text.replaceAll("ober", "o");
    text = text.replaceAll("ufat", "u");

    //alert(text);
    view();

}

function copiar() {
    var copyTextarea = document.createElement("textarea");
    copyTextarea.style.position = "fixed";
    copyTextarea.style.opacity = "0";
    copyTextarea.textContent = document.getElementById("textEncriptado").value;

    document.body.appendChild(copyTextarea);
    copyTextarea.select();
    document.execCommand("copy");
    document.body.removeChild(copyTextarea);
    alert("Texto copiado.");
}

function view() {
    //obtener el tama�o de un elemento html 
    /*var panelIzquierda = document.getElementById("logo"); 
    console.log(panelIzquierda.clientWidth + 'Height' + panelIzquierda.clientHeight);*/

    if (text.trim() === "") {
        alert('El mensaje no puede estar vacio. ');
    } else {
        //se envia a la siguiente vista.
        //window.location.href = "html/encrip.html";
        document.getElementById("imgPerson").style.display = "none";
        document.getElementById("textVacio").style.display = "none";
        document.getElementById("textVacio2").style.display = "none";

        document.getElementById("textEncriptado").style.visibility = "visible";
        document.getElementById("textEncriptado").style.width = "100%";
        document.getElementById("textEncriptado").value = text;

        document.getElementById("buttonCopiar").style.visibility = "visible";
        document.getElementById("buttonCopiar").style.width = "100%";

        if (screen.width < 849) {
            document.getElementById("buttonCopiar").style.height = "50px";
        } else {
            document.getElementById("textEncriptado").style.height = "75vh";

            document.getElementById("buttonCopiar").style.height = "10%";
        }

        //console.log(screen.width);
        //console.log(text);
    }

    //ver el tama�o de la pantalla
    //alert( 'Your screen resolution is ' + screen.width + 'x' + screen.height );

}