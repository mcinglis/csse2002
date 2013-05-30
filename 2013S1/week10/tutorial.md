# Week 10 Tutorial

--

$ java MostDivisors 4786123
The smallest number with the most divisors is 376248.

--

Example of divisors of numbers:

Divisors of 1: 1
Divisors of 2: 2, 1
Divisors of 6: 6, 3, 2, 1
Divisors of 12: 12, 6, 4, 3, 2, 1

public static void main(String[] args) {
}

Integer.parseInt(str) -> int

## Lectures: interfaces, polymorphism, generics

These are **super important concepts** in programming.

An "interface" is important to understand and wield to your advantage whether your language has a syntactic construct for it or not.

You can't write great code (of any language) and design maintainable systems without understanding these concepts well.

## Assignment 3

GUI programming in Swing: I'm so sorry.

Questions?

## Model View Controller

**Don't take this to necessarily relate to assignment 3.**

A very important concept in software engineering.

MVC is one of those things that you'll learn in school that will be useful for the rest of your career. It's used everywhere. MVC is usually a great idea for any software that's based on data and logic.

The basic idea:

MVC is an architecture that seperates information representation from information interaction.

It's a way to cleanly provide multiple interfaces to the same data and logic:

* a game of scrabble that can be played on the console, in a graphical application, or over a network
* GitHub serves Git requests, HTML to browsers, JSON and XML through its API (which also power its client-side apps) -- all representing the same stuff

But, even if you don't necessarily need multiple interfaces, MVC is usually great way to break up concerns in your application. "That part is the data and logic, this part is how it's represented".

### Definitions

There's a lot of variation on MVC (it's not as clear-cut as it would seem), but in my opinion:

* Models are data and logic. They provide querying, filtering, and validating. Models only know about other models.

* A View is a functional representation of a Model: lines printed to the console, a widget in a graphical application, or a record returned by a web service API --- all communicating a Model. Views know about Models, but (ideally) not about Controllers.

* A Controller receives input from the User, delegates that input to the Model (e.g. "create this", "update that", "search for this"), and sets up the View with the results.

The "Controller" of MVC is where you see the most variation, depending on the context:

* sometimes, Views might "subscribe" to Models for changes, and Models "notify" all their subscribers when they change. Then, the Controllers only talk with the Model. This usually makes sense for real-time applications (e.g. games) but not for request-response web services.
* ideally, a single View should only know about a single Model, but this isn't always so important.

### General maxims in MVC

* If the Model doesn't work without its View, you don't have MVC
* Controllers should be as thin as possible
* Models handle everything related to logic and data
  * want to sort a list of entries? ask the model
  * want to search for something? ask the model
  * want to check a password? ask the model
* Models usually have to deal with the most complications, but this doesn't mean you have license to make a big fat class.
  * use helper objects liberally: SongSearcher, FruitSorter, AccountValidator
