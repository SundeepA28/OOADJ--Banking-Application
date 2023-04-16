import React,{useState} from 'react';
import axios from 'axios';
import { toast, ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

const AdminLogin = () => {
    const [data,setdata] = useState({});
    const submitHandler = () =>{
        console.log(data);
        if(data.Username==="admin"){
            if(data.Password==="admin"){
                toast.success("Login Successfull !");
                window.localStorage.setItem("username",data.Username);
                setTimeout(() => {window.location.href = "/admindashboard";},3000);
            }else{
                toast.error("Wrong Password !");
            }
        }else{
            toast.error("You haven't Registered yet !");
        }
{/* 
        var formdata = new FormData();
        
        formdata.append("Username", data.Username);
        formdata.append("Password", data.Password);

        axios.post("http://localhost:8080/customer/login",formdata,{headers:{"Access-Control-Allow-Origin":"*"}}).then((res)=>{
            console.log(res);
            var dd = res.data.split(",")[0];
            if(dd==="correctPassword"){
                window.localStorage.setItem("username",data.Username);
                console.log(res.data.split(",")[1]);
                window.localStorage.setItem("customerId",res.data.split(",")[1]);
                toast.success("Login Successfull !");
                setTimeout(() => {window.location.href = "/userdashboard";},3000);
                
            }else if(dd === "userNotRegistered"){
                toast.error("You haven't Registered yet !");
            }else if(dd === "wrongPassword"){
                toast.error("Wrong Password !");
            }

        });
*/}
    };
    const changeHandler = (event) => {
        console.log(event.target.value);
        if(event.target.id === 'username'){
            setdata((olddata)=>({...olddata,Username:event.target.value}));
        }else if(event.target.id === 'password'){
            setdata((olddata)=>({...olddata,Password:event.target.value}));
        }
    };

    return (
        <>
        <ToastContainer/>
           <div class="flex items-center justify-center h-screen">
                <div class="w-5/12 justify-center rounded-xl bg-gray-200 shadow-lg px-20 py-5">
                    <h1 class="font-semibold text-4xl text-center px-4 py-4 mb-5">Login to Your Admin Account</h1>
                    
                        <input type="text" onChange={(event)=>changeHandler(event)} id="username" placeholder="Enter Your Username" class="h-10 px-8 rounded-lg" required></input><br />
                        <input type="text" onChange={(event)=>changeHandler(event)} id="password" placeholder="Enter Your Password" class="h-10 px-8 rounded-lg mt-4" required></input><br />
                        <input type="submit"  class="bg-black rounded-xl py-2 px-24 my-4 text-white hover:cursor-pointer hover:text-white hover:bg-gray-500" onClick={submitHandler}></input><br />
                    
                </div>
            </div>

        </>
    );
};


export default AdminLogin;