# Spell Checker

## Objectives

* Demostrate ability to understand and use Sets
* Import and compute external data
* Unit Test

## Summary

In this lab you will create an application to import two different text documents.

1. A text file containing a list of english words to be used as the correct spelling reference
2. A text file containing a letter that needs to be spell checked
 Using one as a reference to verify the spelling of another

## Part 1

A text file of english words is provided to you in the root of the repository. Import and parse these values into a `HashSet` to be used as the spelling reference. You may want to convert these values to lowercase to normalize the different casings if present.

## Part 2

Import the second text document, also located in the root of the repository. Check each word for correct spelling, and if the spelling is incorrect then return a `TreeSet` of suggested words. As the program checks for misspellings it should not return a previously misspelled word. This means that you will need to keep track of all mispelled words also. If there are no suggestions for the misspelled words then return "no suggestions".

### Possible variations of a misspelled word to suggest

* Delete any one of the letters from the misspelled word
* Change any letter in the misspelled word to any other letter
* Insert any letter at any point in the misspelled word
* Swap any two neighboring characters in the misspelled word

**Example suggestions:**

html: (no suggestions)

cpsc: (no suggestions)

cvs: cs, vs

href: ref

txt: tat, text, tit, tot, tut

pre: are, ere, ire, ore, pare, per, pie, poe, pore, prep, pres, prey, pro, pry, pure, pyre, re
       
getinputfilenamefromuser: (no suggestions)

jfilechooser: (no suggestions)

setdialogtitle: (no suggestions)

int: ant, dint, hint, in, inc, ind, ink, inn, ins, into, it, lint, mint, nit, pint, tint

## Part 3

Finally, use `main()` to create a console interface to allow a user to select a local text file to be spell checked and display the incorrect spellings and their suggested possiblilities.
