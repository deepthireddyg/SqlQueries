public class RightJoin {
    //select e.emp_name,d.dept_name from employee e Right Join department d on e.dept_id=d.dept_id;

    //fetch details of all emp,their manager,their department.
    //select e.emp_name,d.dept_name,m.manager_name from employee e left join department d on e.dept_id=d.dept_id
    //inner join manager m on m.manager_id=e.manager_id;
   // fetch details of all emp,eheir manager,their department,project name;
    // select e.emp_name,d.dept_name ,manager_name,project_name from employee e
    // Left Join department d on e.dept_id=d.dept_id Inner
    // Join managers m on m.manager_id=e.manager_id Left join projects p on p.team_member_id=e.emp_id;
}
