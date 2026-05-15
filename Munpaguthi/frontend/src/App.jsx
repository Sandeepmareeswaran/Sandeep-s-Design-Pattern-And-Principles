import {Routes,Route} from 'react-router-dom';
import Home from './pages/Home.jsx';
import Newfront from './pages/NewFront.jsx';
import Student from './pages/StudentDashboard.jsx';
function App(){
  return (
    <Routes>
      <Route path='/' element={<Home/>}/>
      <Route path='/nf' element={<Newfront/>}/>
      <Route path='/student' element={<Student/>}/>
    </Routes>

  )
}
export default App;
