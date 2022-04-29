import java.sql.*;
import java.sql.Date;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.color.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class test extends JFrame {
	JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p_1,p_2,p_3;
	JButton b1,b2,b3,b4,b5,b6,b_1,b_2,b_3,b_4,b_5;
	Icon one,two,three,four;
	JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,mm,l_1,l_2,l_3,l_4,l_5,l_6,l_7,l_8,l_9,l_10;
	JTextField w1,w2,w3,w4,w5,w6,t_1,t_2,t_3,t_4,t_5,t_6,t_7,t_8,t_9;
	JTextArea d1,a1;
	
	public  test(){
		init();
		
	}
	public void init(){                                              //主界面
		setTitle("员工管理系统");
		setSize(800,700);
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		p8=new JPanel();
		setLayout(new BorderLayout());
		add(p1,BorderLayout.NORTH);
		p1.setBackground(Color.BLUE);
		add(p2,BorderLayout.SOUTH);
		p2.setBackground(Color.BLUE);
		add(p3,BorderLayout.WEST);
		add(p4,BorderLayout.CENTER);
		p3.setLayout(new GridLayout(4,1));
		p3.add(p5);
		p3.add(p6);
		p3.add(p7);
		p3.add(p8);
		p5.setBackground(Color.BLUE);
		p6.setBackground(Color.BLUE);
		p7.setBackground(Color.BLUE);
		p8.setBackground(Color.BLUE);
		b1=new JButton("员工管理");
		b2=new JButton("工资管理");
		p5.add(b1);
		p6.add(b2);
		one=new ImageIcon("1.png"); 
		two=new ImageIcon("2.png");
		three=new ImageIcon("3.png");
		four=new  ImageIcon("6.png");
		m1=new JLabel(one);
		m2=new JLabel(two);
		m3=new JLabel(three);
		mm=new JLabel(four);
		p4.add(mm);
		p1.add(m1);
		p1.add(m2);		
		p2.add(m3);
		b1.addActionListener(new action1());
		b2.addActionListener(new action2());
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new windowexit());
		setVisible(true);
	}
	
	class action1 implements ActionListener{                               //员工信息管理界面
		 public void actionPerformed(ActionEvent e){
			 try{
			p9=new JPanel();
			p10=new JPanel();
		    p11=new JPanel();
		    p_1=new JPanel();
		    p_2=new JPanel();
		    p_3=new JPanel();
		    l_1=new JLabel("编    号：");
		    l_2=new JLabel("姓    名：");
		    l_3=new JLabel("出生日期:");
		    l_4=new JLabel("性   别：");
		    l_5=new JLabel("住    址：");
		    l_6=new JLabel("邮    编：");
		    l_7=new JLabel("电话号码:");
		    l_8=new JLabel(" 部门号:");
		    l_9=new JLabel("照    片：");
		    l_10=new JLabel("系统消息：");
		    t_1=new JTextField(25);
		    t_2=new JTextField(25);
		    t_3=new JTextField(25);
		    t_4=new JTextField(25);
		    t_5=new JTextField(25);
		    t_6=new JTextField(25);
		    t_7=new JTextField(25);
		    t_8=new JTextField(25);
		    t_9=new JTextField(25);
		    a1=new JTextArea(8,52);
		    JScrollPane s = new JScrollPane(a1);
			s.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			p9.setLayout(new BorderLayout());
			p9.add(p10,BorderLayout.CENTER);
			p9.add(p11,BorderLayout.SOUTH);
			p10.setLayout(new GridLayout(3,1));
			p10.add(p_1);
			p10.add(p_2);
			p10.add(p_3);
			p_1.add(l_1);
			p_1.add(t_1);
			p_1.add(l_2);
			p_1.add(t_2);
			p_1.add(l_3);
			p_1.add(t_3);
			p_1.add(l_4);
			p_1.add(t_4);
			p_1.add(l_5);
			p_1.add(t_5);
			p_1.add(l_6);
			p_1.add(t_6);
			p_1.add(l_7);
			p_1.add(t_7);
			p_1.add(l_8);
			p_1.add(t_8);
			p_2.add(l_9);
			p_2.add(t_9);
			p_3.add(l_10);
			p_3.add(s);
			b_1=new JButton("录入");
			b_2=new JButton("删除");
			b_3=new JButton("更新");
			b_4=new JButton("查询");
			b_5=new JButton("显示所有员工信息");
			p11.add(b_1);
			p11.add(b_2);
			p11.add(b_3);
			p11.add(b_4);
			p11.add(b_5);
			b_4.addActionListener(new action3());
			remove(p4);
			add(p9);
			b1.setEnabled(false);
			b2.setEnabled(true);
			b_5.addActionListener(new showAll());
			b_1.addActionListener(new insert());
			b_2.addActionListener(new delete());
			b_3.addActionListener(new update());
			validate();
			p12.setVisible(false);
			 }catch(Exception ee){}
		}
	}
		
		class action2 implements ActionListener{                       //工资管理界面
			 public void actionPerformed(ActionEvent e){
				 try{
					 p12=new JPanel();
						p13=new JPanel();
						p14=new JPanel();
						p15=new JPanel();
						p16=new JPanel();
						p17=new JPanel();
						p18=new JPanel();
						p19=new JPanel();
						p20=new JPanel();
						p21=new JPanel();
						p22=new JPanel();
						p23=new JPanel();
						p13.setLayout(new GridLayout(1,2));
						p13.add(p19);
						p13.add(p20);
						//p14.setBackground(Color.GREEN);
						p12.setLayout(new BorderLayout());
						p12.add(p13,BorderLayout.NORTH);
						p12.add(p14,BorderLayout.CENTER);
						p12.add(p15,BorderLayout.SOUTH);
						p19.setLayout(new GridLayout(3,1));
						p19.add(p16);
						p19.add(p17);
						p19.add(p18);
						p20.setLayout(new GridLayout(3,1));
						p20.add(p21);
						p20.add(p22);
						p20.add(p23);
						m4=new JLabel("部门名称：");
						m5=new JLabel("姓名：");
						m6=new JLabel("工资：");
						m7=new JLabel("系统消息提示区：");
						m8=new JLabel("收入");
						m9=new JLabel("支出");
						m10=new JLabel("编号");
						p16.add(m4);
						p17.add(m5);
						p18.add(m6);
						p14.add(m7);
						p22.add(m8);
						p21.add(m10);
						w1=new JTextField(20);
						w2=new JTextField(20);
						w3=new JTextField(20);
						w4=new JTextField(10);
						w5=new JTextField(10);
						w6=new JTextField(10);
						p16.add(w1);
						p17.add(w2);
						p18.add(w3);
						p22.add(w4);
						p22.add(m9);
						p22.add(w5);
						p21.add(w6);
						d1=new JTextArea(8,45);
						JScrollPane s = new JScrollPane(d1);
						s.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
						p14.add(s);
						b3=new JButton("查询");
						b4=new JButton("录入");
						b5=new JButton("删除");
						b6=new JButton("显示所有员工工资情况");
						p21.add(b3);
						p23.add(b4);
						p23.add(b5);
						p14.add(b6);
						b3.addActionListener(new a3());
						b5.addActionListener(new a4());
						b6.addActionListener(new a5());
						b4.addActionListener(new a6());
						remove(p9);
						add(p12);
						b2.setEnabled(false);
						b1.setEnabled(true);
						validate();
						p9.setVisible(false);
				 }catch(Exception ee){}
			}
		}
		
		class windowexit extends WindowAdapter{                                          //关闭窗口
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
class action3 implements ActionListener{                                                                         //员工信息    显示全部信息
			public void actionPerformed(ActionEvent e){
				try{
					Class.forName("oracle.jdbc.OracleDriver");
					Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
					Statement stat=conn.createStatement();
					
					if(!t_1.getText().equals("")&&t_2.getText().equals("")&&t_8.getText().equals("")){
						
						String s=t_1.getText();
						ResultSet rs= stat.executeQuery("select * from employees where 编号='"+s+"'");
						if(rs.next()){
							a1.append("编号\t姓名\t出生日期\t性别\t住址\t邮编\t电话号码\t部门号\r\n");
							String v1=rs.getString("编号");
							String v2=rs.getString("姓名");
							Date v3=rs.getDate("出生日期");
							String v4=rs.getString("性别");
							String v5=rs.getString("住址");
							String v6=rs.getString("邮编");
							String v7=rs.getString("电话号码");
							String v8=rs.getString("部门号");
							a1.append(v1+"\t"+v2+"\t"+v3+"\t"+v4+"\t"+v5+"\t"+v6+"\t"+v7+"\t"+v8+"\r\n");
							t_2.setText(v2);
							t_3.setText(v3.toString());
							t_4.setText(v4);
							t_5.setText(v5);
							t_6.setText(v6);
							t_7.setText(v7);
							t_8.setText(v8);
							a1.append("查询成功！\r\n");
						}	
						else a1.append("该员工不存在!\r\n");
				}
					if(t_1.getText().equals("")&&!t_2.getText().equals("")&&t_8.getText().equals("")){
						String a=t_2.getText();
						ResultSet bs= stat.executeQuery("select * from employees where 姓名='"+a+"'");
						if(bs.next()){
							a1.append("编号\t姓名\t出生日期\t性别\t住址\t邮编\t电话号码\t部门号\r\n");
							String v1=bs.getString("编号");
							String v2=bs.getString("姓名");
							Date v3=bs.getDate("出生日期");
							String v4=bs.getString("性别");
							String v5=bs.getString("住址");
							String v6=bs.getString("邮编");
							String v7=bs.getString("电话号码");
							String v8=bs.getString("部门号");
							a1.append(v1+"\t"+v2+"\t"+v3+"\t"+v4+"\t"+v5+"\t"+v6+"\t"+v7+"\t"+v8+"\r\n");
							t_1.setText(v1);
							t_2.setText(v2);
							t_3.setText(v3.toString());
							t_4.setText(v4);
							t_5.setText(v5);
							t_6.setText(v6);
							t_7.setText(v7);
							t_8.setText(v8);
							a1.append("查询成功！\r\n");
						}
						else a1.append("该员工不存在!\r\n");
					}
					
					if(t_1.getText().equals("")&&t_2.getText().equals("")&&!t_8.getText().equals("")){
						String c=t_8.getText();
						ResultSet fs= stat.executeQuery("select * from employees,departments where employees.部门号=departments.部门号 and employees.部门号='"+c+"'");
						boolean exist=false;
						int a=1;
						while(fs.next()){
							exist=true;
							while(a==1){
								a1.append("编号\t姓名\t性别\t住址\t电话号码\t部门号\t部门名\r\n");
								a++;
							}
							String v1=fs.getString("编号");
							String v2=fs.getString("姓名");
							String v4=fs.getString("性别");
							String v5=fs.getString("住址");
							String v7=fs.getString("电话号码");
							String v8=fs.getString("部门号");
							String v9=fs.getString("部门名称"); 
							a1.append(v1+"\t"+v2+"\t"+v4+"\t"+v5+"\t"+v7+"\t"+v8+"\t"+v9+"\r\n");
						}
						if(exist)a1.append("查询成功!\r\n");
						if(!exist)a1.append("部门号输入有误！\r\n");
					}
				conn.close();
				}catch (Exception e4){}
			}
		}
	class insert implements ActionListener{                                                          //员工信息管理    录入信息
		public void actionPerformed(ActionEvent e){
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
				Statement stat=conn.createStatement();
				String s=t_1.getText();
				ResultSet rs = stat.executeQuery("select * from employees where 编号='"+s+"'");
				if(rs.next()){
					a1.append("该员工编号已存在，无法插入！\r\n");
					t_1.setText("");
					t_2.setText("");
					t_3.setText("");
					t_4.setText("");
					t_5.setText("");
					t_6.setText("");
					t_7.setText("");
					t_8.setText("");
				}
				else{
					String sql="insert into employees values(?,?,to_date("+t_3.getText()+",'yyyymmdd'),?,?,?,?,?)";
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setString(1,t_1.getText());
					ps.setString(2,t_2.getText());
					ps.setString(3,t_4.getText());
					ps.setString(4,t_5.getText());
					ps.setString(5,t_6.getText());
					ps.setString(6,t_7.getText());
					ps.setString(7,t_8.getText());
					ps.execute();
					a1.append("插入成功！\r\n");
					t_1.setText("");
					t_2.setText("");
					t_3.setText("");
					t_4.setText("");
					t_5.setText("");
					t_6.setText("");
					t_7.setText("");
					t_8.setText("");
				}	
				conn.close();
			}catch(Exception ee){}
		}
	}
	class delete implements ActionListener{                                                     //员工信息管理   查询信息
		public void actionPerformed(ActionEvent e){
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
				Statement stat=conn.createStatement();
				String s=t_1.getText();
				ResultSet rs = stat.executeQuery("select * from employees where 编号='"+s+"'");
				if(rs.next()){
					PreparedStatement ps = conn.prepareStatement("delete from employees where 编号='"+s+"'");
					ps.execute();
					t_1.setText("");
					t_2.setText("");
					t_3.setText("");
					t_4.setText("");
					t_5.setText("");
					t_6.setText("");
					t_7.setText("");
					t_8.setText("");
					a1.append("成功删除！\r\n");
				}
				else{
					t_1.setText("");
					t_2.setText("");
					t_3.setText("");
					t_4.setText("");
					t_5.setText("");
					t_6.setText("");
					t_7.setText("");
					t_8.setText("");
					a1.append("原表中没有该员工编号，无法删除!\r\n");
					
				}
				conn.close();
			}catch(Exception ee){}
		}
	}
	
	
	
	class a3 implements ActionListener{                      //工资管理查询操作
		public void actionPerformed(ActionEvent e){
			try{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
		Statement stat=conn.createStatement();
			String in=w2.getText();
			ResultSet rs = stat.executeQuery("select *  from Salary,Departments,Employees where Employees.编号=Salary.编号  and Employees.部门号=Departments.部门号  and Employees.姓名='"+in+"'");
			d1.append("编号\t姓名\t收入\t支出\t工资\r\n");
			d1.append("**************************************************************************\r\n");
			boolean A=false;
			while(rs.next()){
			A=true;
			
			String v0 = rs.getString("部门名称");
			w1.setText(v0);
			String v1 = rs.getString("姓名");
			w2.setText(v1);
			String v2 = rs.getString("收入");
			w4.setText(v2);
			String v3 = rs.getString("支出");
			w5.setText(v3);
			String v4=rs.getString("编号");
			w6.setText(v4);
			 double i = Double.valueOf(v2)-Double.valueOf(v3);
			w3.setText(String.valueOf(i));
			d1.append(v4+"\t"+v1+"\t"+v2+"\t"+v3+"\t"+i+"\r\n");
			
			}
			if(A){
				
				d1.append("查询成功！！！");
				}
			
			if(!A){
				d1.append(null);
				d1.append("查询失败！数据不存在！！！");
			}
			
			conn.close();
			}catch (Exception e4){}
			
			
		}
	}
	
	class a4 implements ActionListener{                      //公资管理删除操作
		public void actionPerformed(ActionEvent e){
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
				Statement stat=conn.createStatement();
				String in=w6.getText();
				ResultSet rs = stat.executeQuery("delete from Salary where 编号='"+in+"'");
				w1.setText(null);
				w2.setText(null);
				w3.setText(null);
				w4.setText(null);
				w5.setText(null);
				w6.setText(null);
				d1.setText(null);
				d1.append("删除或成功！！！");
				
			} catch (Exception e6){}
				
		}
	}
	
	class a5 implements ActionListener{                       //工资管理显示全部信息
		public void actionPerformed(ActionEvent e){
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
				Statement stat=conn.createStatement();
				ResultSet rs = stat.executeQuery("select * from Salary,Employees where Salary.编号=Employees.编号 ");
				d1.setText(null);
				d1.append("导出成功!所有员工工资情况如下：\r\n");
				d1.append("编号\t姓名\t收入\t支出\t工资\r\n");
				d1.append("**************************************************************************\r\n");
				while(rs.next()){
					String v1=rs.getString("编号");
					String v2=rs.getString("姓名");
					String v3=rs.getString("收入");
					String v4=rs.getString("支出");
					double i = Double.valueOf(v3)-Double.valueOf(v4);
					String v5=String.valueOf(i);
					d1.append(v1+"\t"+v2+"\t"+v3+"\t"+v4+"\t"+v5+"\r\n");
				}
				conn.close();
			}catch(Exception ee){}
		}
	}
	
	
	class a6 implements ActionListener{              //录入数据         
		public void actionPerformed(ActionEvent e){
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
				Statement stat=conn.createStatement();
				String q1=w6.getText();
				ResultSet rs = stat.executeQuery("select * from Salary where 编号='"+q1+"'");
				PreparedStatement psmt=null;
				String sql="update Salary  set 收入=?,支出=? where 编号='"+q1+"'";
				psmt=conn.prepareStatement(sql);
				psmt.setString(1,w4.getText());
				psmt.setString(2,w5.getText());
				psmt.execute();
				d1.setText(null);
				d1.append("数据更新成功！！！");
			}catch (Exception e7){}
		}
	}
	
	
	
	
	
	
	
	
	
	
	class update implements ActionListener{                                                //员工信息管理    修改信息
		public void actionPerformed(ActionEvent e){
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
				Statement stat=conn.createStatement();
				String s=t_1.getText();
				ResultSet rs = stat.executeQuery("select * from employees where 编号='"+s+"'");
				if(rs.next()){
				String sql="update employees set 姓名=?,出生日期=to_date("+t_3.getText()+",'yyyymmdd'),性别=?,住址=?,邮编=?,电话号码=?,部门号=? where 编号='"+s+"'";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1,t_2.getText());
				ps.setString(2,t_4.getText());
				ps.setString(3,t_5.getText());
				ps.setString(4,t_6.getText());
				ps.setString(5,t_7.getText());
				ps.setString(6,t_8.getText());
				ps.execute();
				t_1.setText("");
				t_2.setText("");
				t_3.setText("");
				t_4.setText("");
				t_5.setText("");
				t_6.setText("");
				t_7.setText("");
				t_8.setText("");
				a1.append("员工信息修改成功！\r\n");
				}
				else{
					a1.append("没有该员工编号！\r\n");
					t_1.setText("");
					t_2.setText("");
					t_3.setText("");
					t_4.setText("");
					t_5.setText("");
					t_6.setText("");
					t_7.setText("");
					t_8.setText("");
				}
				conn.close();
			}catch(Exception ee){}
		}
	}
	class showAll implements ActionListener{                                                       //    员工信息管理    显示全部信息
		public void actionPerformed(ActionEvent e){
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
				Statement stat=conn.createStatement();
				ResultSet rs = stat.executeQuery("select * from employees ");
				a1.append("编号\t姓名\t出生日期\t性别\t住址\t邮编\t电话号码\t部门号\r\n");
				while(rs.next()){
					String v1=rs.getString("编号");
					String v2=rs.getString("姓名");
					Date v3=rs.getDate("出生日期");
					String v4=rs.getString("性别");
					String v5=rs.getString("住址");
					String v6=rs.getString("邮编");
					String v7=rs.getString("电话号码");
					String v8=rs.getString("部门号");
					a1.append(v1+"\t"+v2+"\t"+v3+"\t"+v4+"\t"+v5+"\t"+v6+"\t"+v7+"\t"+v8+"\r\n");
				}
				a1.append("导出成功！\r\n");
				conn.close();
			}catch(Exception ee){}
		}
	}
	
	public static void main(String [] args){
		try{
			final JFrame jf=new JFrame("登录");                                  //登录界面
			jf.setSize(600,430);
			//jf.setLocation(500,400);
			
			JPanel pp1;
			JLabel lab1,lab2;
			pp1=new HomePanel("4.png");
			jf.add(pp1);
			lab1=new JLabel("       用   户：       ");
			lab2=new JLabel("       密   码：       ");
		
			final JTextField te1=new JTextField(25);
			final JTextField te2=new JTextField(25);
			JButton bu1=new JButton("登录");
			JButton bu2=new JButton("取消");
			pp1.setLayout(null);
			lab1.setBounds(60,50,110,110);
			te1.setBounds(150,80,280,35);
			lab2.setBounds(60,150,110,110);
			te2.setBounds(150,180,280,35);
			bu1.setBounds(150,250,60,40);
			bu2.setBounds(330,250,60,40);
			
			
			
			pp1.add(lab1);
			pp1.add(te1);
			pp1.add(lab2);
			pp1.add(te2);
			pp1.add(bu1);
			pp1.add(bu2);
			bu1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int a=0;
					try{
						Class.forName("oracle.jdbc.OracleDriver");
						Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","tiger");
						Statement stat=conn.createStatement();
						ResultSet rs = stat.executeQuery("select * from users");
						
						while(rs.next()){
							String name = rs.getString("姓名");
							String password = rs.getString("密码");
							if(te1.getText().equals(name)&&te2.getText().equals(String.valueOf(password))) a=1;
							}
							if(a==1){
								new test();
								jf.dispose();
							}
							else
							{JOptionPane.showMessageDialog(null, "用户名或密码错误！",
						"错误", JOptionPane.ERROR_MESSAGE);}
					}catch(Exception ee){}
				}
			});
			bu2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try{
						System.exit(0);
					}catch(Exception ee){}
				}
			});
			jf.setVisible(true);
		}catch(Exception ee){}
	}
}
