package web;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateCode extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
//		创建看空白图片
		BufferedImage image=new BufferedImage(100,30, BufferedImage.TYPE_INT_RGB);
//		获取图片画笔
		Graphics g=image.getGraphics();
		Random r=new Random();
//		设置画笔颜色
		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		g.fillRect(0, 0, 100, 30);
//		获取字符传 设置颜色和字体
		String number=getNumber(5);
		
		HttpSession session=request.getSession();
		session.setAttribute("code", number);
		
		g.setColor(new Color(0,0,0));
		g.setFont(new Font(null,Font.BOLD,24));
		
//		绘制支付穿
		g.drawString(number, 5, 25);
		for(int i=0;i<8;i++){
			g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.drawLine(r.nextInt(100), r.nextInt(30), r.nextInt(100), r.nextInt(30));
		}
		response.setContentType("image/jpeg");
		OutputStream ops=response.getOutputStream();
		ImageIO.write(image, "jpeg", ops);
		ops.close();
		
	}

	public String getNumber(int i){
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String number="";
		Random r=new Random();
		for(int i1=0;i1<i;i1++){
			number+=str.charAt(r.nextInt(str.length()));
		}
		return number;
	}
}
