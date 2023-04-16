import React,{useState} from 'react';
import axios from 'axios';

const Regis = () => {
    const [data,setdata] = useState({});

    const submitHandler = () =>{
        console.log(data);

        var formdata = new FormData();
        formdata.append("Name", data.Name);
        formdata.append("PhoneNumber", data.PhoneNumber);
        formdata.append("Email", data.Email);
        formdata.append("Address", data.Address);
        formdata.append("Username", data.Username);
        formdata.append("Password", data.Password);

        axios.post("http://localhost:8080/customer/register",formdata,{headers:{"Access-Control-Allow-Origin":"*"}}).then((res)=>{console.log(res);});
    };
    const changeHandler = (event) => {
        console.log(event.target.value);
        if(event.target.id === 'name'){
            setdata((olddata)=>({...olddata,Name:event.target.value}));
        }else if(event.target.id === 'phn'){
            setdata((olddata)=>({...olddata,PhoneNumber:event.target.value}));
        }else if(event.target.id === 'Email'){
            setdata((olddata)=>({...olddata,Email:event.target.value}));
        }else if(event.target.id === 'Address'){
            setdata((olddata)=>({...olddata,Address:event.target.value}));
        }else if(event.target.id === 'username'){
            setdata((olddata)=>({...olddata,Username:event.target.value}));
        }else if(event.target.id === 'password'){
            setdata((olddata)=>({...olddata,Password:event.target.value}));
        }
    };

    return (
        <>

            <div class="flex items-center justify-center h-screen">
                <div class="w-5/12 justify-center rounded-xl bg-gray-200 shadow-lg px-20 py-5">
                    <h1 class="font-semibold text-4xl text-center px-4 py-4 mb-5">Regiter Your Account</h1>
                    
                        <input type="text" onChange={(event)=>changeHandler(event)} id="name" placeholder="Enter Your Name" class="h-10 px-4 rounded-lg" required></input><br />
                        <input type="text" onChange={(event)=>changeHandler(event)} id="phn" placeholder="Enter Your Phone Number" class="h-10 px-4 rounded-lg" required></input><br />
                        <input type="text" onChange={(event)=>changeHandler(event)} id="Email" placeholder="Enter Your Email" class="h-10 px-4 rounded-lg" required></input><br />
                        <input type="text" onChange={(event)=>changeHandler(event)} id="Address" placeholder="Enter Your Adress" class="h-10 px-4 rounded-lg" required></input><br />
                        <input type="text" onChange={(event)=>changeHandler(event)} id="username" placeholder="Enter Your Username" class="h-10 px-4 rounded-lg" required></input><br />
                        <input type="text" onChange={(event)=>changeHandler(event)} id="password" placeholder="Enter Your Password" class="h-10 px-4 rounded-lg" required></input><br />
                        <input type="submit"  class="bg-black rounded-xl py-2 text-white hover:cursor-pointer hover:text-white hover:bg-gray-500" onClick={submitHandler}></input><br />
                        <button class="bg-black rounded-xl py-2 px-8 text-white hover:cursor-pointer hover:text-white hover:bg-gray-500" onClick={()=>{window.location.href="/"}}>Go to Login</button>
                    
                </div>
            </div>

            </>
    );

};
export default Regis;