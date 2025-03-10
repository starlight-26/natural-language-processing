# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

![UML Diagram for my project](UMLdiagram.png)

## Video

[![Thumbnail for my projet](thumbnail.png)](https://youtu.be/YRiEMBlS3Cw)

## Project Description

My application was created to check for spelling errors in text. The user inputs the text to be analyzed. The program will then output the words that are misspelled into the console. If there are no misspelled words, it will just print out "No misspelled words".

## NLP Techniques

In this project, I implemented natural language processing techniques to parse the text. This means that the text was broken up into individual words which allowed me to analyze it for spelling errors. I used the textToWords() method to break up the text and the removePunctuation() method to only store the letters. These methods let me check each word in the text with the words in the text file.