const transactionsUL = document.querySelector('#transactions');
const inputTransactionName = document.querySelector('#text');
const inputTransactionAmount = document.querySelector('#amount')

const handleFormSubmit = event => {
    if(inputTransactionName.value.trim() === '' ||
        inputTransactionAmount.value.trim() === ''){
            alert('Informe a descrição e o valor da transação')
        }
}
form.addEventListener('submit', handleFormSubmit);