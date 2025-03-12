 // Array of image URLs
 const images = [
    "https://media.istockphoto.com/id/1258071109/photo/modern-style-wooden-kitchen-with-nature-view-3d-render.jpg?s=612x612&w=0&k=20&c=U5qQuPG8ojD7T-frW8e8669IUEuSBDpCvcrftMUJQ4g=",
    "https://media.istockphoto.com/id/1498243668/photo/tasty-cheeseburger-with-lettuce-cheddar-cheese-tomato-and-pickles-burger-bun-with-sesame.jpg?s=612x612&w=0&k=20&c=m2fYc-3o7yjL2qUVxxKlGkniKYIw5qh7gaSdagUNSbU=",
    "https://media.istockphoto.com/id/1075099420/photo/homemade-pulled-pork-sliders.jpg?s=612x612&w=0&k=20&c=THqwsD3fg0uvjeyVuY9aGjZfcBZsPmb_5nBpSJvjSpQ=",
    "https://media.istockphoto.com/id/1070730232/photo/homemade-cheeseburger-sliders-with-tomato.jpg?s=612x612&w=0&k=20&c=qq2PY83lb8KqomJPYJ97zcni7j44Phh30mY5Vx9cnXw="
];

let currentIndex = 0;

// Function to update the image
function updateImage() {
    document.getElementById("slider-image").src = images[currentIndex];

    // Disable buttons if at first or last image
    document.getElementById("prevBtn").disabled = (currentIndex === 0);
    document.getElementById("nextBtn").disabled = (currentIndex === images.length - 1);
}

// Function to go to the next image
function nextImage() {
    if (currentIndex < images.length - 1) {
        currentIndex++;
        updateImage();
    }
}

// Function to go to the previous image
function prevImage() {
    if (currentIndex > 0) {
        currentIndex--;
        updateImage();
    }
}

// Initialize slider with the first image
updateImage();