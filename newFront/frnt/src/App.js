import logo from './logo.svg';

import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import './App.css';
import Regis from './components/Register';
import Login from './components/login';
import UserDashboard from './components/userDashboard';
import AddBeneficiary from './components/addBeneficiary';
import TransferMoney from './components/transferMoney';
import Transactions from './components/transactions';
import AllBeneficiary from './components/allBeneficiaries';
import UpdateProfile from './components/UpdateProfile';
import ApplyLoan from './components/applyLoan';
import LoanApplications from './components/loanApplications';
import UpdateNominee from './components/updateNominee';
import AdminLogin from './components/adminLogin';
import AdminDashboard from './components/adminDashboard';
import ApproveBeneficiaries from './components/approveBeneficiaries';
function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route exact path="/" element={<Login/>}></Route>
          <Route exact path="/register" element={<Regis/>}></Route>
          <Route exact path="/userdashboard" element={<UserDashboard/>}></Route>
          <Route exact path="/transactions" element={<Transactions/>}></Route>
          <Route exact path="/transfermoney" element={<TransferMoney/>}></Route>
          <Route exact path="/addbeneficiary" element={<AddBeneficiary/>}></Route>
          <Route exact path="/allbeneficiary" element={<AllBeneficiary/>}></Route>
          <Route exact path="/editprofile" element={<UpdateProfile/>}></Route>
          <Route exact path="/applyloan" element={<ApplyLoan/>}></Route>
          <Route exact path="/loanapplications" element={<LoanApplications/>}></Route>
          <Route exact path="/updatenominee" element={<UpdateNominee/>}></Route>
          <Route exact path="/adminlogin" element={<AdminLogin/>}></Route>
          <Route exact path="/admindashboard" element={<AdminDashboard/>}></Route>
          <Route exact path="/approvebeneficiaries" element={<ApproveBeneficiaries/>}></Route>
          
        </Routes>
      </Router>
      
    </div>
  );
}

export default App;
