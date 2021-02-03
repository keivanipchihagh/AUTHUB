`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    22:00:28 12/17/2020 
// Design Name: 
// Module Name:    D_FlipFlop 
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
module D_FlipFlop(
	input reset, clock, D,
	output reg Q, Q_bar
    );
	
	always @(negedge clock or posedge reset) 
	begin
		#5
		if(reset)
			begin
				Q <= 1'b0;
			end
		else
			begin
				Q <= D;
				Q_bar <= ~D;
			end
	end

endmodule
