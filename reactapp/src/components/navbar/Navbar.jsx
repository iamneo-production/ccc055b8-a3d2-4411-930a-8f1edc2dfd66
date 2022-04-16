
import React from 'react';
import {
  Nav,
  NavLink,
  Bars,
  NavMenu,
} from './NavbarElements';

  
const Navbar = () => {
    const divStyle = {
        width: '8%',
        height:'50px',
        float: 'left',
      };
      
  return (
    <>
      <Nav>
      <img className='nav-logo' src={require('../navbar/admissionlogo.jpg')} alt="" style={divStyle} />
        {/* <Bars /> */}
        <NavMenu>
          <NavLink to='/' activeStyle>
            Home
          </NavLink>
          <NavLink to='/user/signup' activeStyle>
            Sign Up
          </NavLink>
<<<<<<< HEAD
          <NavLink to='/login' activeStyle>
=======
          <NavLink to='/user/login' activeStyle>
>>>>>>> 2383a9fb937c39b2ecd5b1dcd817a4e408cc1d18
            Log In
          </NavLink>
          {/* Second Nav */}
          {/* <NavBtnLink to='/sign-in'>Sign In</NavBtnLink> */}
        </NavMenu>
      </Nav>
    </>
  );
};
  
export default Navbar;
