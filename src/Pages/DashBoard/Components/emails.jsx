import React from 'react';
import '../Styles/Email.css';
import { useState } from 'react';
function Email(){
    const [isOpen, setIsOpen] = useState(false);

    const toggleDropdown = () => {
      setIsOpen(!isOpen);
    };
    return(
        <div className='main'>
            <div className='firstBox'>
            <div className='me'>
                 <button className='circle1'>
                </button>
                <div className='circle2'>
                </div>
                <div className='circle3'>
                </div> 
                </div> 
            <div className='none'>
            <div>
            <button className='buy'onClick={toggleDropdown }>Gmail</button> 
      {isOpen && (
        <div>
                <div className='inb'>
                    <h4 className='test'>Inbox</h4>
                </div>    
                <div className='sent1' placeholder='hhh'>
                    <h4 className='test'>Sent</h4>
                </div>          
                <div className='Starred'>
                    <h5 className='test'>Starred</h5>
                </div>
                <div className='Archive'>
                    <h5 className='test'>Archive</h5>
                </div>
                <div className='Delete'>
                    <h5 className='test'>🚮Delete</h5>
                </div>
                <div className='Draft'>
                    <h5 className='test'>Draft</h5>
            </div>        
            </div>
      )}
    </div>
    </div>
            <div className='down'>
                <h3 className='j'>Folder</h3>
                <h3 className='j2'> 📂Finance</h3>
                </div>
            </div>
            <div className='secoundBox'>
                <h1 className='inbox'>Inbox</h1>
            <input className='dot' type="text" placeholder="🔍Search..." />
      <button className='dot2'>Search▯</button>
      <div className='down2'>
      </div>
      </div>
            <div className='thirdBox'>
                <div className='down3'>
                </div>
            </div>
        </div>
  )
}
export default Email;