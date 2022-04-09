
import React from 'react';
import {
  Nav,
  NavLink1,
  Bars1,
  NavMenu1,
} from './NavbarElements';

  
const Navbar = () => {
    const divStyle1 = {
        width: '10%',
        height:'53px',
        float: 'left',
      };
      
  return (
    <>
      <Nav>
      <img className='nav-logo' src={require('../navbar/admissionlogo.jpg')} alt="" style={divStyle1} />
        <Bars1 />
        <NavMenu1>
          <NavLink1 to='/' activeStyle>
            Home
          </NavLink1>
          <NavLink1 to='/user/signup' activeStyle>
            Sign Up
          </NavLink1>
          <NavLink1 to='/login' activeStyle>
            Log In
          </NavLink1>
          {/* Second Nav */}
          {/* <NavBtnLink to='/sign-in'>Sign In</NavBtnLink> */}
        </NavMenu17>
      </Nav>
    </>
  );
};
  
export default Navbar;
