import java.util.Scanner;

    public class Student{
		
		public static void main(String[] arry){
			
			welcome();
			
			
			Admin[] admins = new Admin[5];//�ֲ����� ���ö����ھֲ������ķ����ڲ�ʹ��
			
		    initDate(admins);//���ݳ�ʼ��
			
			
			operation(admins);
					
		}
		
		public static void initDate(Admin[] admins){
			
			Admin admin = new Admin("admin","admin");
			
			admins[0]=admin;
		}
		
		public static void welcome(){
			System.out.println("-----------��ӭ��¼ѧ����Ϣ����ϵͳ----------");
			System.out.println("1.��¼ 2.�˳�");
			System.out.println("-----------------------");
		}
		
		public static void operation(Admin[] admins){
			
			Scanner s = new Scanner(System.in);//���ܼ�������
			
			System.out.println("��ѡ��");
			
			int operation = s.nextInt();//�����������������
			
			if(operation==1){
				//��¼
				login(admins);
			}else if(operation==2){ 
			      System.exit(0);//ǿ���˳�
				//�˳�
			}else{
				System.out.println("�������� ����������");
				operation(admins);//�ݹ����
			}
			
		}
		
		public static void login(Admin[] admins){
			
			System.out.println("��ӭ��¼");
			
			Scanner s = new Scanner(System.in);//���ܼ�������
			
			System.out.print("�������û���");
			
			String username=s.nextLine();//��ȡ���̵��ַ���
			
			System.out.print("����������");
			
			String password=s.nextLine();//��ȡ���̵��ַ���
			
			//�ж��û��������Ƿ���ȷ
			for(int i=0;i<admins.length;i++){
				
				Admin admin = admins[i];//.equals:�ַ����е���Ȳ�����= ����equals
				
				if(admin == null){
					
					continue;
				}
				
				if(username.equals(admin.username) && password.equals(admin.password)){
					
					System.out.print("��ӭ��"+username);
					break;
				}
			}
		}
	}
	
	
	class Admin{
		
		public String username;
		public String password;
		//���췽��
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