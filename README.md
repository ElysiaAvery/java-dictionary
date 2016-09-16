# Dictionary
![project screenshot](/screenshot.png)

Version 0.0.0: September 16, 2016

by [Elysia Avery Nason](https://github.com/elysiaavery)

## Description
A program that allows the user to add a word, as well as multiple definitions. [here.](https://elysiaavery.github.io/java-dictionary/)

### Specifications
| Behaviour                                                    | Input                              | Output                                                                                                                                                                                                             |
|--------------------------------------------------------------|------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Initiates Word & Definition Objects.                         | n/a                                | n/a                                                                                                                                                                                                                |
| Word object returns property values.                         | String "word"                      | "word"                                                                                                                                                                                                             |
| Definition object returns property values.                   | String "definition goes here"      | "definition goes here"                                                                                                                                                                                             |
| Word & Definition return all instances of Word & Definition. | word1, word2, word3...             | "comic","bike","dog"                                                                                                                                                                                               |
| Instantiates instances of Word & Definition with ID's.       | localhost:4567/word/2              | Word: dog                                                                                                                                                                                                          |
| Add Definition(s) to Word.                                   | localhost:4567/word/2/definition/1 | Word: dog Defintion:a domesticated carnivorous mammal that typically has a long snout, an acute sense of smell, and a barking, howling, or whining voice. It is widely kept as a pet or for work or field sports.  |

## Setup/Installation
* Clone directory
* Run gradle run
* navigate to localhost:4567 in your choice of browser(Chrome is preferred).

## Support & Contact
For questions, concerns, or suggestions please email elysia.avery@gmail.com

## Known Issues
* This program runs only from the command line.

## Technologies Used
Java, Gradle, junit, Spark, Velocity Template Engine

## Legal
*Licensed under MIT open source*

Copyright (c) 2016 Copyright _Elysia Avery Nason_ All Rights Reserved.
