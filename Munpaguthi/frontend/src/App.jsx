import {Routes,Route} from 'react-router-dom';
import Home from './pages/Home.jsx';
import Newfront from './pages/NewFront.jsx';
function App(){
  return (
    <Routes>
      <Route path='/' element={<Home/>}/>
      <Route path='/nf' element={<Newfront/>}/>
    </Routes>

  )
}
export default App;
