package emp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateEmpServ")
public class UpdateEmpServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateEmpServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId = request.getParameter("empId");
		String salary = request.getParameter("salary");
		String Email = request.getParameter("Email");
		
		Employee emp = new Employee();
		emp.setEmployeeId(Integer.parseInt(empId));
		emp.setSalary(Integer.parseInt(salary));
		emp.setEmail(Email);
		
		EmpDAO dao = new EmpDAO();
		dao.updateEmp(emp);	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
