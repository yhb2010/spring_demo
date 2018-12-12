1、如何用Spring将Service注入到Servlet中
在applicationContext.xml中定义数据层访问Bean：
<bean id="userDao" class="test.UserDaoImpl"></bean>
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UserDao userDao;
    ....
}
注入方法：：在Servlet的init方法中增加以下代码：
public void init(ServletConfig config) throws ServletException {
   SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
         config.getServletContext());
}
并且在变量userDao上一行增加@Autowired：