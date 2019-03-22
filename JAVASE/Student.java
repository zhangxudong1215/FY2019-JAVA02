import java.util.Scanner;

    public class Student{
		
		public static void main(String[] arry){
			
			welcome();
			
			
			Admin[] admins = new Admin[5];//局部变量 作用定义在局部变量的方法内部使用
			
		    initDate(admins);//数据初始化
			
			
			operation(admins);
					
		}
		
		public static void initDate(Admin[] admins){
			
			Admin admin = new Admin("admin","admin");
			
			admins[0]=admin;
		}
		
		public static void welcome(){
			System.out.println("-----------欢迎登录学生信息管理系统----------");
			System.out.println("1.登录 2.退出");
			System.out.println("-----------------------");
		}
		
		public static void operation(Admin[] admins){
			
			Scanner s = new Scanner(System.in);//接受键盘输入
			
			System.out.println("请选择");
			
			int operation = s.nextInt();//读键盘里的整数数字
			
			if(operation==1){
				//登录
				login(admins);
			}else if(operation==2){ 
			      System.exit(0);//强制退出
				//退出
			}else{
				System.out.println("输入有误 请重新输入");
				operation(admins);//递归调用
			}
			
		}
		
		public static void login(Admin[] admins){
			
			System.out.println("欢迎登录");
			
			Scanner s = new Scanner(System.in);//接受键盘输入
			
			System.out.print("清输入用户名");
			
			String username=s.nextLine();//读取键盘的字符串
			
			System.out.print("清输入密码");
			
			String password=s.nextLine();//读取键盘的字符串
			
			//判断用户名密码是否正确
			for(int i=0;i<admins.length;i++){
				
				Admin admin = admins[i];//.equals:字符串中的相等不能用= 调用equals
				
				if(admin == null){
					
					continue;
				}
				
				if(username.equals(admin.username) && password.equals(admin.password)){
					
					System.out.print("欢迎您"+username);
					break;
				}
			}
		}
	}
	
	
	class Admin{
		
		public String username;
		public String password;
		//构造方法
		public Admin(String username, String password){
			this.username=username;
			this.password=password;
			
		}
		
		public String getUsername(){
			return username;
			
			}
		public void setusername(String username){
			this.username=username;
			
		}
		
		public String getPassword(){
			return password;
		}
		public void setpassword(String password){
			this.password=password;
			
		}
		
		
	}
	
	
	class Studentr{
		
		public int id;
		public String name;
		public String sex;
		
	}