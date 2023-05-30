import DeleteIcon from './MyAssets/Image/delete.svg';
import DraftIcon from './MyAssets/Image/draft.svg';
import ArchiveIcon from './MyAssets/Image/Archive.svg';
import './App.css';
import Email from './Pages/DashBoard/Components/emails';
function App() {
  return (
    <div className="App">
      <Email/>
      <img className='draft' src={DraftIcon} alt="Draft Icon" />
      <img className='archive' src={ArchiveIcon} alt="Archive Icon" />
      <img className='delete' src={DeleteIcon} alt="Delete Icon" />

    </div>
  );
}

export default App;
