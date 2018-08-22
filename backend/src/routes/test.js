import express from 'express';
let router = express.Router();
import subjectsObj from './../../data/tests.json';

router.get('/', (req, res) => {
  res.send({message: "Tests route"});
});

router.get('/subjects', (req, res) => {
  res.send(subjectsObj);
});
export default router;