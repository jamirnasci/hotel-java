const modal = document.getElementById('modal');
const closeModalBtn = document.getElementById('close-modal');
const btnReservar = document.querySelectorAll('[class=reservar-btn]')
const modalTitle = document.getElementById('modal-title');
const modalContent = document.getElementById('modal-content');

btnReservar.forEach((tag)=>{
	tag.addEventListener('click', function (){
		modal.style.display = 'block';
		modalTitle.innerHTML = tag.getAttribute('model')
	})
})

closeModalBtn.addEventListener('click', function() {
  modal.style.display = 'none';
});