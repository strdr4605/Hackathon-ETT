import express from 'express';
import config from './config';
import bodyParser from 'body-parser';
import testRoutes from './routes/test';
import studentRoutes from './routes/student';

let app = express();

app.use(bodyParser.urlencoded({
  extended: false
}));
app.use(bodyParser.json());

app.use('/api/v1/test', testRoutes);
app.use('/api/v1/student', studentRoutes);

app.listen(config.port, () => {
  console.log('Application is running on port ' + config.port);
});