import java.awt.*;
import javax.swing.*;

//��panel���ͼƬ

public class HomePanel extends JPanel {
	ImageIcon icon;
	Image img;
	public HomePanel() {}
	public HomePanel(String str) {
		//  /img/HomeImg.jpg �Ǵ���������ڱ�д����Ŀ��bin�ļ����µ�img�ļ����µ�һ��ͼƬ
		icon=new ImageIcon(str);
		img=icon.getImage();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//����������Ϊ�˱���ͼƬ���Ը��洰�����е�����С�������Լ����óɹ̶���С
		g.drawImage(img, 0, 0,this.getWidth(), this.getHeight(), this);
	}
 
}
