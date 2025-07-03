@startuml
interface ReprodutorMusical {
    +tocar()
    +pausar()
    +selecionarMusica()
}

interface AparelhoTelefonico {
    +ligar()
    +atender()
    +desligar()
}

interface NavegadorInternet {
    +exibirPagina()
    +adicionarNovaAba()
    +atualizarPagina()
}

class iPhone {
    -modelo: String
    -numero: String
    +tocar()
    +pausar()
    +selecionarMusica()
    +ligar()
    +atender()
    +desligar()
    +exibirPagina()
    +adicionarNovaAba()
    +atualizarPagina()
}

iPhone ..|> ReprodutorMusical
iPhone ..|> AparelhoTelefonico
iPhone ..|> NavegadorInternet
@enduml
