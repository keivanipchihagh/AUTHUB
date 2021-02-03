`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    12:52:50 11/26/2020 
// Design Name: 
// Module Name:    Adder_Subtractor 
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
module Adder_Subtractor(
	input A, B, Cin, Sel,
	output S, Cout
    );
	 
	 wire selector;
	 
	 xor #10 (selector, Sel, B);
	 
	 FA FA1 (.S(S), .Cout(Cout), .A(A), .B(selector), .Cin(Cin));
	 
endmodule
