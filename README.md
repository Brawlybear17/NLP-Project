# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String class** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put an image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get displayed on this README.

![alt text](image-1.png)

## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

![alt text](image.png)[(youtube-URL-here)](https://youtu.be/tl8xNZfJ1PM)

## Project Description

Write a description of the goal and/or problem that your application. Include descriptions of what text is being analyzed, either if its text files you are using to interpret text and how the user interacts with your project.

The goal of this application is to check how strong a user’s password is and identify possible weaknesses. The program reads a text file that contains a list of common passwords and compares the user’s input against it. The user interacts with the program by entering a password, and the program analyzes it to determine if it is secure or weak based on certain rules.

## NLP Techniques

Write a description of what natural language technique (NLP) you implemented in your project. State which methods in your project are associated with this, and a brief explanation of how those methods work and how they are necessary in the NLP technique.

This project uses a simple NLP technique called text matching and normalization. The loadPasswords() method reads and stores common passwords, while checkStrength() compares the user’s password (converted to lowercase) to detect matches. This technique is important because it allows the program to analyze text input and identify patterns, such as commonly used or weak passwords.