import express from 'express';
let router = express.Router();
import studentsObj from './../../data/students.json';

router.get('/students', (req, res) => {
  res.send(studentsObj);
});

router.get('/:n', (req, res) => {
  res.send(studentsObj['students'][req.params.n]);
});

export default router;