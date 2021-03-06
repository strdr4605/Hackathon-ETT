# Babel Node.js Express Setup

A starter pack for server side JavaScript applications using standards from ES2015, ES2016, ES2017. It uses Babel to compile from this standard to ES5. This project used [express](https://expressjs.com/) framework

## Usage

### Installation

Install the dependencies

```sh
$ npm install
```

### Start server using development build

This will use [babel-register](https://babeljs.io/docs/usage/babel-register/) package tot compile our code to ES5 without outputing any additional folder that has the compiled code, and will start the server using [nodemon](https://nodemon.io/) package

```sh
$ npm start
```

### Clean

Deletes the dist folder

```sh
$ npm run clean
```

### Build

Clean project, then compile the contents of server folder using babel, places the output into dist folder created by babel, besides this also gives the [source maps](http://www.mattzeunert.com/2016/02/14/how-do-source-maps-work.html) that are used for debugging purposes

```sh
$ npm run build
```

### Start server using production build

This will call the **build** command will start the server using production build

```sh
$ npm run production
```