`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   10:15:13 11/30/2020
// Design Name:   Adder_Subtractor
// Module Name:   E:/ISE/Projects/LC_Lab_7/tb_Adder_Subtractor.v
// Project Name:  LC_Lab_7
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: Adder_Subtractor
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module tb_Adder_Subtractor;

	// Inputs
	reg A;
	reg B;
	reg Cin;
	reg Sel;

	// Outputs
	wire S;
	wire Cout;

	// Instantiate the Unit Under Test (UUT)
	Adder_Subtractor uut (
		.A(A), 
		.B(B), 
		.Cin(Cin), 
		.Sel(Sel), 
		.S(S), 
		.Cout(Cout)
	);

	initial begin
		// Initialize Inputs
		A = 0;
		B = 0;
		Cin = 0;
		Sel = 0;

		// Wait 100 ns for global reset to finish
		A= 1'b0; B = 1'b0; Cin = 1'b0; Sel = 1'b0;
		#100;
		
		A= 1'b1; B = 1'b0; Cin = 1'b0; Sel = 1'b0;
		#100;
		
		A= 1'b1; B = 1'b1; Cin = 1'b0; Sel = 1'b0;
		#100;
		
		A= 1'b1; B = 1'b0; Cin = 1'b1; Sel = 1'b0;
		#100;
		
		A= 1'b0; B = 1'b0; Cin = 1'b0; Sel = 1'b1;
		#100;
		
		A= 1'b1; B = 1'b0; Cin = 1'b0; Sel = 1'b1;
		#100;
        
		// Add stimulus here

	end
      
endmodule

