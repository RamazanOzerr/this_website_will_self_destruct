let countdownTime = 86383; // Initial countdown time in seconds
let timerElement = document.getElementById('timer');
let interval;

readMessage();
function startTimer() {
    clearInterval(interval);
    interval = setInterval(() => {
        if (countdownTime <= 0) {
            clearInterval(interval);
            alert('The website has self-destructed.');
            return;
        }
        countdownTime--;
        timerElement.textContent = countdownTime;
    }, 1000);
}

document.getElementById('readMessageButton').addEventListener('click', () => {
    readMessage();
});

document.getElementById('sendMessageButton').addEventListener('click', () => {
    sendMessage()
});

function readMessage(){
    fetch('/api/messages/random')
        .then(response => response.json())
        .then(data => {
            document.getElementById('messageContent').innerText = data.content;
        });
}

function sendMessage(){
    const messageContent = document.getElementById('messageInput').value;
    fetch('/api/messages', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ content: messageContent })
    }).then(response => response.json())
        .then(data => {
            alert('Message sent!');
            document.getElementById('messageInput').value = '';
            countdownTime = 86383; // Reset the timer
            startTimer();
        });
}

// Start the timer initially
startTimer();
