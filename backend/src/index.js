import express from 'express';
import config from './config';
import bodyParser from 'body-parser';

let app = express();

app.use(bodyParser.urlencoded({
  extended: false
}));
app.use(bodyParser.json());

app.listen(config.port, () => {
  console.log('Application is running on port ' + config.port);
});