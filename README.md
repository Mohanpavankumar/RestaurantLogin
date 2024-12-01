# Restaurant Management System

This is a simple web application for handling payment operations in a KFC restaurant, included only frontntend. The application allows users to input payment details such as the amount, cardholder name, card number, expiry date, and security code. Upon successful submission, it redirects users to a success page indicating that the payment was successful. 

---

## Project Structure

The project consists of the following files:

- **index.html**: The landing page where users are redirected to interact with the application.
- **kfcrestaurant.java**: The servlet for handling user interactions on the restaurant page.
- **paymentservlet.java**: The servlet responsible for displaying the payment form.
- **successservlet.java**: The servlet for handling the payment success page.
- **web.xml**: The deployment descriptor that maps servlets and defines URL patterns.

---

## Features

1. **Payment Form**:
   - Inputs for amount, cardholder name, card number, expiry date, and security code.
   - Styled with inline CSS for a simple user interface.

2. **Success Page**:
   - Displays a confirmation message after payment submission.
   - Styled with a black background and centered blue text.

3. **Servlets**:
   - `paymentservlet`: Generates and serves the payment form dynamically.
   - `successservlet`: Displays the payment success page.

---

## Requirements

- **Java Development Kit (JDK)**: Ensure you have JDK installed (preferably JDK 8 or later).
- **Apache Tomcat**: Required to deploy and run the web application.
- **Browser**: Any modern browser to access the application.

---