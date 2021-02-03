`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    22:01:56 12/17/2020 
// Design Name: 
// Module Name:    Circuit 
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
module Circuit(
	input reset, clock, A, B,
	output y, z, t
    );
	
	wire R, S, orA_S, Q1_bar, Q2_bar, Q2;
	
	assign #10 S = B & Q2_bar;
	assign #10 orA_S = A | S;
	
	D_FlipFlop dff_1(
		.reset(reset),
		.clock(clock),
		.D(orA_S),
		.Q(y),
		.Q_bar(Q1_bar)
	);
	
	assign #10 D2 = ~(orA_S | Q1_bar);
	
	D_FlipFlop dff_2(
	   .reset(reset),
		.clock(clock),
		.D(D2),
		.Q(t),
		.Q_bar(Q2_bar)
	);
	
	assign #10 R = B & Q2_bar;	
	assign #10 z = R | Q1_bar;

endmodule
