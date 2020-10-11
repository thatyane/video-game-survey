# video-game-survey
A video game survey application
https://video-game-survey.netlify.app/

## Features
### Mobile
* Choose your favorite game
* Create game (pending)

### Web
* Listing of chosen games
* Top 8 rated games 
* Dashboard by platforms 
* Dashboard by genre 

## API'S
* Create a record: `POST/records`
* Get records in a period of time (sorted and paginated): `GET/records?minDate=2020-10-01&maxDate=2020-10-09&page=2&size=5&orderBy=moment&sort=DESC`
* Get a list of games: `GET/games`

### Technologies used

* **Java 11**
* **Spring Boot 2**
* **Maven**
* **Junit 5**
* **Mockito**
* **Hamcrest**
* **PostgreSQL 12**
* **Flyway 6**
* **Heroku**
* **Netlify**
