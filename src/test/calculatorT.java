package test;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class calculatorT extends Application {
	
	private int btdott=0;

	public void start(Stage stage)
	{
		GridPane pane=new GridPane();
		
		TextField monitor=new TextField();
		monitor.setAlignment(Pos.CENTER_RIGHT);
		monitor.setMinHeight(30);
		monitor.setMinWidth(100);
		monitor.setMaxHeight(60);
		monitor.setMaxWidth(265);
		monitor.setMinSize(100, 30);
		monitor.setMaxSize(265, 60);
		monitor.setPrefSize(265, 60);
		monitor.setFont(Font.font(24));
		monitor.setEditable(false);
		pane.add(monitor,0,0);
		
		GridPane panebt=new GridPane();
		panebt.setHgap(5);
		panebt.setVgap(5);
		
		Button bt7=new Button("7");
		bt7.setMinHeight(40);
		bt7.setMinWidth(40);
		bt7.setMaxHeight(40);
		bt7.setMaxWidth(40);
		bt7.setPrefSize(40, 40);
		panebt.add(bt7, 0, 1);
		bt7.setOnAction(e->{
			String num1=bt7.getText();
			String num2=monitor.getText();
			String display=num2+num1;
			
			monitor.setText(display);
		});
		
		Button bt8=new Button("8");
		bt8.setMinHeight(40);
		bt8.setMinWidth(40);
		bt8.setMaxHeight(40);
		bt8.setMaxWidth(40);
		bt8.setPrefSize(40, 40);
		panebt.add(bt8, 1, 1);
		bt8.setOnAction(e->{
			String num1=bt8.getText();
			String num2=monitor.getText();
			String display=num2+num1;
			monitor.setText(display);
		});
		
		Button bt9=new Button("9");
		bt9.setMinHeight(40);
		bt9.setMinWidth(40);
		bt9.setMaxHeight(40);
		bt9.setMaxWidth(40);
		bt9.setPrefSize(40, 40);
		panebt.add(bt9, 2, 1);
		bt9.setOnAction(e->{
			String num1=bt9.getText();
			String num2=monitor.getText();
			String display=num2+num1;
			monitor.setText(display);
		});
		
		Button btdiv=new Button("/");
		btdiv.setMinHeight(40);
		btdiv.setMinWidth(40);
		btdiv.setMaxHeight(40);
		btdiv.setMaxWidth(40);
		btdiv.setPrefSize(40, 40);
		panebt.add(btdiv, 3, 1);
		
		Button btce=new Button("←");
		btce.setMinHeight(40);
		btce.setMinWidth(40);
		btce.setMaxHeight(40);
		btce.setMaxWidth(40);
		btce.setPrefSize(40, 40);
		panebt.add(btce, 4, 1);
		btce.setOnAction(e->{
		String m=monitor.getText();
		StringBuffer buf=new StringBuffer(m.length()-1);
		buf.append(m.substring(0, m.length()-1)).append(m.substring(m.length()-1+1));
		
		
		monitor.setText( buf.toString());
		
		
		
		});
		
		
		Button btc=new Button("⌂");
		btc.setMinHeight(40);
		btc.setMinWidth(40);
		btc.setMaxHeight(40);
		btc.setMaxWidth(40);
		btc.setPrefSize(40, 40);
		panebt.add(btc, 5, 1);
		btc.setOnAction(e->{
			monitor.clear();
			btdott=0;
		});
		
		Button bt4=new Button("4");
		bt4.setMinHeight(40);
		bt4.setMinWidth(40);
		bt4.setMaxHeight(40);
		bt4.setMaxWidth(40);
		bt4.setPrefSize(40, 40);
		panebt.add(bt4, 0, 2);
		bt4.setOnAction(e->{
			String num1=bt4.getText();
			String num2=monitor.getText();
			String display=num2+num1;
			monitor.setText(display);
		});
		
		
		Button bt5=new Button("5");
		bt5.setMinHeight(40);
		bt5.setMinWidth(40);
		bt5.setMaxHeight(40);
		bt5.setMaxWidth(40);
		bt5.setPrefSize(40, 40);
		panebt.add(bt5, 1, 2);
		bt5.setOnAction(e->{
			String num1=bt5.getText();
			String num2=monitor.getText();
			String display=num2+num1;
			monitor.setText(display);
		});
		
		
		Button bt6=new Button("6");
		bt6.setMinHeight(40);
		bt6.setMinWidth(40);
		bt6.setMaxHeight(40);
		bt6.setMaxWidth(40);
		bt6.setPrefSize(40, 40);
		panebt.add(bt6, 2, 2);
		bt6.setOnAction(e->{
			String num1=bt6.getText();
			String num2=monitor.getText();
			String display=num2+num1;
			monitor.setText(display);
		});
		
		
		Button btmul=new Button("*");
		btmul.setMinHeight(40);
		btmul.setMinWidth(40);
		btmul.setMaxHeight(40);
		btmul.setMaxWidth(40);
		btmul.setPrefSize(40, 40);
		panebt.add(btmul, 3, 2);
		
		Button btl=new Button("(");
		btl.setMinHeight(40);
		btl.setMinWidth(40);
		btl.setMaxHeight(40);
		btl.setMaxWidth(40);
		btl.setPrefSize(40, 40);
		panebt.add(btl, 4, 2);
		
		Button btr=new Button(")");
		btr.setMinHeight(40);
		btr.setMinWidth(40);
		btr.setMaxHeight(40);
		btr.setMaxWidth(40);
		btr.setPrefSize(40, 40);
		panebt.add(btr, 5, 2);
		
		Button bt1=new Button("1");
		bt1.setMinHeight(40);
		bt1.setMinWidth(40);
		bt1.setMaxHeight(40);
		bt1.setMaxWidth(40);
		bt1.setPrefSize(40, 40);
		panebt.add(bt1, 0, 3);
		bt1.setOnAction(e->{
			String num1=bt1.getText();
			String num2=monitor.getText();
			String display=num2+num1;
			monitor.setText(display);
		});
		
		
		Button bt2=new Button("2");
		bt2.setMinHeight(40);
		bt2.setMinWidth(40);
		bt2.setMaxHeight(40);
		bt2.setMaxWidth(40);
		bt2.setPrefSize(40, 40);
		panebt.add(bt2, 1, 3);
		bt2.setOnAction(e->{
			String num1=bt2.getText();
			String num2=monitor.getText();
			String display=num2+num1;
			monitor.setText(display);
		});
		
		
		Button bt3=new Button("3");
		bt3.setMinHeight(40);
		bt3.setMinWidth(40);
		bt3.setMaxHeight(40);
		bt3.setMaxWidth(40);
		bt3.setPrefSize(40, 40);
		panebt.add(bt3, 2, 3);
		bt3.setOnAction(e->{
			String num1=bt3.getText();
			String num2=monitor.getText();
			
			String display=num2+num1;
			monitor.setText(display);
		});
		
		
		Button btmin=new Button("-");
		btmin.setMinHeight(40);
		btmin.setMinWidth(40);
		btmin.setMaxHeight(40);
		btmin.setMaxWidth(40);
		btmin.setPrefSize(40, 40);
		panebt.add(btmin, 3, 3);
		
		Button btsquar=new Button("X²");
		btsquar.setMinHeight(40);
		btsquar.setMinWidth(40);
		btsquar.setMaxHeight(40);
		btsquar.setMaxWidth(40);
		btsquar.setPrefSize(40, 40);
		panebt.add(btsquar, 4, 3);
		btsquar.setOnAction(e->{
			double num=Double.parseDouble(monitor.getText());
			num=(double)Math.pow(num, 2);
			String display=""+num;
			monitor.setText(display);
		});
		
		Button btsqrt=new Button("√");
		btsqrt.setMinHeight(40);
		btsqrt.setMinWidth(40);
		btsqrt.setMaxHeight(40);
		btsqrt.setMaxWidth(40);
		btsqrt.setPrefSize(40, 40);
		panebt.add(btsqrt, 5, 3);
		btsqrt.setOnAction(e->{
			double num=Double.parseDouble(monitor.getText());
			num=(double)Math.sqrt(num);
			String display=""+num;
			monitor.setText(display);
		});
		
		Button bt0=new Button("0");
		bt0.setMinHeight(40);
		bt0.setMinWidth(40);
		bt0.setMaxHeight(40);
		bt0.setMaxWidth(40);
		bt0.setPrefSize(40, 40);
		panebt.add(bt0, 0, 4);
		bt0.setOnAction(e->{
			String num1=bt0.getText();
			String num2=monitor.getText();
			String display=num2+num1;
			monitor.setText(display);
		});
		
		
		Button btdot=new Button(".");
		btdot.setMinHeight(40);
		btdot.setMinWidth(40);
		btdot.setMaxHeight(40);
		btdot.setMaxWidth(40);
		btdot.setPrefSize(40, 40);
		panebt.add(btdot, 1, 4);
		btdot.setOnAction(e->{
			String bb=monitor.getText();
			
			for(int i=0;i<bb.length();i++)
			{
				if(bb.charAt(i)=='.')
				{
					btdott=1;
					break;
				}
				else
				{
					btdott=0;
					
				}
				
			}
			if(btdott==0)
			{
				String num1=btdot.getText();
				String num2=monitor.getText();
				String display=num2+num1;
				monitor.setText(display);
				btdott=1;
			}
		});
		
		
		
		Button btmod=new Button("%");
		btmod.setMinHeight(40);
		btmod.setMinWidth(40);
		btmod.setMaxHeight(40);
		btmod.setMaxWidth(40);
		btmod.setPrefSize(40, 40);
		panebt.add(btmod, 2, 4);
		btmod.setOnAction(e->{
			double num=Double.parseDouble(monitor.getText());
			num/=100;
			String display=""+num;
			monitor.setText(display);
		});
		
		Button btplus=new Button("+");
		btplus.setMinHeight(40);
		btplus.setMinWidth(40);
		btplus.setMaxHeight(40);
		btplus.setMaxWidth(40);
		btplus.setPrefSize(40, 40);
		panebt.add(btplus, 3, 4);
		btplus.setOnAction(e->{
			
			
			
		});
		
		Button bteq=new Button("=");
		bteq.setMinHeight(40);
		bteq.setMinWidth(40);
		bteq.setMaxHeight(40);
		bteq.setMaxWidth(40);
		bteq.setPrefSize(40, 40);
		panebt.add(bteq, 4, 4);
		bteq.setOnAction(e->{
			
			
		});
		
		Button btfact=new Button("X!");
		btfact.setMinHeight(40);
		btfact.setMinWidth(40);
		btfact.setMaxHeight(40);
		btfact.setMaxWidth(40);
		btfact.setPrefSize(40, 40);
		panebt.add(btfact, 5, 4);
		btfact.setOnAction(e->{
			int f=1;
			int num=Integer.parseInt(monitor.getText());
			for(int i=num;i>0;i--)
				f*=i;
			String display=""+f;
			f=Integer.parseInt(display);
			monitor.setText(display);
		});
		
		
		VBox Vbox=new VBox(pane,panebt);
		Scene scene=new Scene(Vbox,265,230);
		stage.setTitle("Casio");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}


