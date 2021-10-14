import javax.swing.*;
import  javax.swing.event.*;
import java.awt.event.*;


public class calculadora extends JFrame implements ActionListener{
	private JButton boton_num1, boton_num2, boton_num3, boton_num4, boton_num5, boton_num6, boton_num7, boton_num8, boton_num9, boton_num0, boton_suma, boton_resta, boton_multiplicacion, boton_division, boton_resultado;
	private JLabel resultado_varoperative;
	Integer var_calcu_1 = 0, var_calcu_2 = 0, resultado = 0;
	String var_ver1 = "", var_ver2 = "", var_ver3 = "", var_ver4 = "", var_ver5 = "", var_ver6 = "", var_ver7 = "", var_ver8 ="" , var_ver9 = "", var_ver0 = "", var_resultado = "", var_versuma = "", var_veresta = "", var_vermulti = "", var_vardivision = "";
	// aqui declare variables de guardado de botones, botones, junto con un label

public calculadora(){
	setLayout(null);
	boton_num1 = new JButton("1");
	boton_num1.setBounds(10,20,50,30);
	boton_num1.addActionListener(this);
	add(boton_num1);
//aqui cree el boton del numero uno

	boton_num2 = new JButton("2");
	boton_num2.setBounds(70,20,50,30);
	boton_num2.addActionListener(this);
	add(boton_num2);
//aqui cree el boton del numero dos

	boton_num3 = new JButton("3");
	boton_num3.setBounds(140,20,50,30);
	boton_num3.addActionListener(this);
	add(boton_num3);
//aqui cree el boton del numero tres

	boton_num4 = new JButton("4");
	boton_num4.setBounds(210,20,50,30);
	boton_num4.addActionListener(this);
	add(boton_num4);
//aqui cree el boton del numero cuatro

	 boton_num5 = new JButton("5");
	 boton_num5.setBounds(10,60,50,30);
	 boton_num5.addActionListener(this);
	 add(boton_num5);
//aqui cree el boton del numero cinco

	 boton_num6 = new JButton("6");
	 boton_num6.setBounds(70,60,50,30);
	 boton_num6.addActionListener(this);
	 add(boton_num6);
//aqui cree el boton del numero seis0

	 boton_num7 = new JButton("7");
	 boton_num7.setBounds(140,60,50,30);
	 boton_num7.addActionListener(this);
	 add(boton_num7);
//aqui cree el boton del numero siete

	 boton_num8 = new JButton("8");
	 boton_num8.setBounds(210,60,50,30);
	 boton_num8.addActionListener(this);
	 add(boton_num8);
//aqui cree el boton del numero ocho

	 boton_num9 = new JButton("9");
	 boton_num9.setBounds(10,100,50,30);
	 boton_num9.addActionListener(this);
	 add(boton_num9);
//aqui cree el boton del numero nueve

	 boton_num0 = new JButton("0");
	 boton_num0.setBounds(70,100,50,30);
	 boton_num0.addActionListener(this);
	 add(boton_num0);
//aqui cree el boton del numero cero

	 boton_suma = new JButton("+");
	 boton_suma.setBounds(10,140,50,30);
	 boton_suma.addActionListener(this);
	 add(boton_suma);
//aqui cree el boton de suma

	 boton_resta = new JButton("-");
	 boton_resta.setBounds(70,140,50,30);
	 boton_resta.addActionListener(this);
	 add(boton_resta);
//aqui cree el boton de resta

	 boton_multiplicacion = new JButton("*");
	 boton_multiplicacion.setBounds(140,140,50,30);
	 boton_multiplicacion.addActionListener(this);
	 add(boton_multiplicacion);
//aqui cree el boton de multiplicacion

	 boton_division = new JButton("/");
	 boton_division.setBounds(210,140,50,30);
	 boton_division.addActionListener(this);
	 add(boton_division);
//aqui cree el boton de division

	 boton_resultado = new JButton("=");
	 boton_resultado.setBounds(10,180,50,30);
	 boton_resultado.addActionListener(this);
	 add(boton_resultado);
//aqui cree el boton de resultado

	 resultado_varoperative = new JLabel("");
	 resultado_varoperative.setBounds(0,95,250,250);
	 add(resultado_varoperative);
	 //aqui cree el label para mostrar en pantalla la calculadora
	}
		@Override
		public void actionPerformed(ActionEvent evento){
			int num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
//declare las variables para poder concatenar las otras variables
	//for(i = 0, i >= 3, i++){
		//if(i == 2 ){
		if (evento.getSource() == boton_num1) {
      num1 = 1;
	  var_ver1 = Integer.toString(num1);
      var_resultado = resultado_varoperative.getText() + var_ver1;
      	// aqui le estoy dando una funcion al boton_num1
	}//aqui finaliza el boton_num1

	 	if (evento.getSource() == boton_num2){
        num2 = 2;
		var_ver2 = Integer.toString(num2);
        var_resultado = resultado_varoperative.getText() + var_ver2;
		// aqui le estoy dando una funcion al boton_num2
	}//aqui finaliza el boton_num2

	 	if (evento.getSource() == boton_num3) {
        num3 = 3;
		var_ver3 = Integer.toString(num3);
        var_resultado = resultado_varoperative.getText() + var_ver3;
	 	}//aqui finaliza el boton_num3

	 	if (evento.getSource() == boton_num4) {
	 		num4 = 4;
			var_ver4 = Integer.toString(num4);
	 		var_resultado = resultado_varoperative.getText() + var_ver4;
	 	}//aqui finaliza el boton_num4

	 	if (evento.getSource() == boton_num5) {
	 		num5 = 5;
			var_ver5 = Integer.toString(num5); 
	 		var_resultado = resultado_varoperative.getText() + var_ver5;
	 	}//aqui finaliza el boton_num5

	 	if (evento.getSource() == boton_num6) {
	 		num6 = 6;
			var_ver6 = Integer.toString(num6);
	 		var_resultado = resultado_varoperative.getText() + var_ver6;
	 	}//aqui finaliza el boton_num6

	 	if (evento.getSource() == boton_num7) {
	 		num7 = 7;
			var_ver7 = Integer.toString(num7);
	 		var_resultado = resultado_varoperative.getText() + var_ver7;
	 	}//aqui finaliza el boton_num7

	 	if (evento.getSource() == boton_num8) {
	 		num8 = 8;
			var_ver8 = Integer.toString(num8);
	 		var_resultado = resultado_varoperative.getText() + var_ver8;
	 	}//aqui finaliza el boton_num8
		 
	 	if (evento.getSource() == boton_num9) {
			 num9 = 9;
			 var_ver9 = Integer.toString(num9);
			 var_resultado = resultado_varoperative.getText() + var_ver9;
			}//aqui finaliza el boton_num9
			
			if (evento.getSource() == boton_num0) {
				num0 = 0;
				var_ver0 = Integer.toString(num0);
				var_resultado = resultado_varoperative.getText() + var_ver0;
			}//aqui finaliza el boton_num0
			resultado_varoperative.setText(var_resultado);

			if(evento.getSource() == boton_suma){
		 	var_calcu_1 = Integer.parseInt(var_resultado);
			 var_calcu_2 = Integer.parseInt(var_resultado);
			 resultado = var_calcu_1 + var_calcu_2;
			 var_resultado = Integer.toString(resultado);
			 resultado_varoperative.setText(var_resultado);
			if(evento.getSource() == boton_resta){
			}//aqui finaliza el boton_suma								
			var_calcu_1 = Integer.parseInt(var_resultado);
			var_calcu_2 = Integer.parseInt(var_resultado);
			resultado = var_calcu_1 + var_calcu_2;
			var_resultado = Integer.toString(resultado);
			resultado_varoperative.setText(var_resultado);
			}//aqui finaliza el boton_resta
			if(evento.getSource() == boton_multiplicacion){
			var_calcu_1 = Integer.parseInt(var_resultado);
			var_calcu_2 = Integer.parseInt(var_resultado);
			resultado = var_calcu_1 + var_calcu_2;
			var_resultado = Integer.toString(resultado);
			resultado_varoperative.setText(var_resultado);
			}//aqui finaliza el boton_multiplicacion
			if(evento.getSource() == boton_division){
			var_calcu_1 = Integer.parseInt(var_resultado);
			var_calcu_2 = Integer.parseInt(var_resultado);
			resultado = var_calcu_1 + var_calcu_2;
			var_resultado = Integer.toString(resultado);
			resultado_varoperative.setText(var_resultado);
			}//aqui finaliza el boton_division 
			resultado_varoperative.setText(var_resultado);
			if(evento.getSource() == boton_resultado){
			 
			}
	}
		
		
//aqui asigno la funcion de cada boton

	 public static void main(String[] args){
	 	calculadora calculadora1 = new calculadora();
	 	calculadora1.setBounds(0,0,300,300);
	 	calculadora1.setResizable(true);
	 	calculadora1.setLocationRelativeTo(null);
	 	calculadora1.setVisible(true);
	 }
}
	


