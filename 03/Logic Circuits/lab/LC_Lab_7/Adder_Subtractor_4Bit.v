`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    13:08:18 11/26/2020 
// Design Name: 
// Module Name:    Adder_Subtractor_4Bit 
// Project Name: 
// Target Devices: 
// Tool versions: 
// Description: 
//
// Dependencies: 
//
// Revision: 
// Revision 0.01 - File Created
// Additional Comments: 
//
//////////////////////////////////////////////////////////////////////////////////
module Adder_Subtractor_4Bit(

	input [3:0] A,
	input [3:0] B,
	input Sel,
	output [3:0] S,
	output Cout
	);
	 
	wire [3:1] C;
	
	Adder_Subtractor
		AS0 (.S(S[0]), .Cout(C[1]), .A(A[0]), .B(B[0]), .Cin(Sel), .Sel(Sel)),
		AS1 (.S(S[1]), .Cout(C[2]), .A(A[1]), .B(B[1]), .Cin(C[1]), .Sel(Sel)),
		AS2 (.S(S[2]), .Cout(C[3]), .A(A[2]), .B(B[2]), .Cin(C[2]), .Sel(Sel)),
		AS3 (.S(S[3]), .Cout(Cout), .A(A[3]), .B(B[3]), .Cin(C[3]), .Sel(Sel));

endmodule
