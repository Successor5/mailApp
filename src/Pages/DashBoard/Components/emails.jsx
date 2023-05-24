import React from 'react';
import '../Styles/Email.css';
function Email(){
    return(
        <div className='main'>
             <div className='me'>
                {/* <button className='circle1'>
                </button>
                <div className='circle2'>
                </div>
                <div className='circle3'>
                </div> */}
            </div> 
            <div className='firstBox'>
                <button className='buy'>Gmail</button> 
            </div>
            <div className='secoundBox'>
                <h1 className='inbox'>Inbox</h1>
            </div>
            <div className='thirdBox'>
                3
            </div>
        </div>
    )
}
export default Email;