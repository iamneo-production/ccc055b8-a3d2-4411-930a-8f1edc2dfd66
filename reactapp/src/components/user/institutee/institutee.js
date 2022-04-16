<<<<<<< HEAD
import React , {useState} from 'react';
=======
import React , {useState,useEffect} from 'react';
import { Link , useNavigate} from 'react-router-dom';
import { FaEdit , FaTrash } from 'react-icons/fa';
>>>>>>> 2383a9fb937c39b2ecd5b1dcd817a4e408cc1d18
import '../institutee/institutee.css';
import Rating from '@mui/material/Rating';
import Button from "../../web components/buttons/Button";
import data from './data';
import Navbar from '../../navbar/Navbar'
<<<<<<< HEAD
const InstitutePagee=()=>{
=======
import InstituteService from '../../admin/services/InstituteService';
const InstitutePagee=()=>{
    const[institutes,setinstitutes]=useState([]);
    // const institutes={};
>>>>>>> 2383a9fb937c39b2ecd5b1dcd817a4e408cc1d18
    const[filter,setfilter]=useState("");
    const searchfilter=(event)=>{
        setfilter(event.target.value);
    }
<<<<<<< HEAD
    //const displaysearch=filter.length>0;
    const dataSearch=data.instituteData.filter((val)=>{
        return(val.name.includes(filter))
    })
    // console.log(dataSearch);
    return(
        <div>
        <div className='Navbar'>
            hello
        </div>
        <div className='instpage'>
        <div className='search'>
=======
    useEffect(()=>{
        InstituteService.getInstitute().then((res)=>{
        setinstitutes(res.data);
        
            // institutes.add(res.data);
        });
    },[]);
    //const displaysearch=filter.length>0;

    const dataSearch=institutes.filter((val)=>{
        return(val.academyName.includes(filter))
    })

    // console.log(dataSearch);
    
    return(
        <div>
        <div className='Navbar2'>
            <Link to='/user/institutepage' className='instnav'>Institutes</Link>
            <Link to='/user/enrolledcourse' className='instnav'>Enrolled Courses</Link>
        </div>
        <div className='instpage'>
        <div className='search'>
                {/* <input className='searchtext' type="text" placeholder='Search Here' value={filter} onChange={searchfilter}></input> */}
>>>>>>> 2383a9fb937c39b2ecd5b1dcd817a4e408cc1d18
                <input className='searchtext' type="text" placeholder='Search Here' value={filter} onChange={searchfilter}></input>
                <Button className='button' BtnName='Search' value='Search' />
            </div>
        <section className='container'>
            {dataSearch.map((item)=>{
                return(
                    <div>
                    <div className='card' key={item}>
<<<<<<< HEAD
                    <img className='img instimg' src={item.img} alt="Institute"/>
                    <center><a href='#0'>{item.name}</a></center>
                    <div className='rating'>
                        <p>Place:{item.place}</p>
                        <Rating name="size-small" defaultValue={2} size="small" />
                    </div>
                    
                </div>
                
=======
                    <img className='img instimg' src={item.imageUrl} alt="Institute"/>
                    <center><a href='/user/availablecourse'>{item.academyName}</a></center>
                    <div className='rating'>
                        <p>Place:{item.academyLocation}</p>
                        <Rating name="size-small" defaultValue={item.rating} size="small" />
                    </div>
                    
                </div>
>>>>>>> 2383a9fb937c39b2ecd5b1dcd817a4e408cc1d18
                </div>
                )
            })}
            
        </section>
        </div>
        </div>
    )
}
export default InstitutePagee;