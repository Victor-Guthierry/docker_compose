//Função que irá adicionar a classe 'active' no elemento de id= 'modal'
const openModal = () => document.getElementById("modal").classList.add("active")
//Evento no botão cadastrar. Chama a função 'openModal' ao ser clicado
document.getElementById("botaoCadastrar").addEventListener("click", openModal)

//Função que irá remover a classe 'active' no elemento de id= 'modal'
const closeModal = () => document.getElementById("modal").classList.remove("active")
//Evento na span de fechar. Chama a função 'closeModal' ao ser clicado
document.getElementById("modalClose").addEventListener("click", closeModal)

