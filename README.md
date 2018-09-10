# End-to-end-delay-with-ack

**Group details:**
Pooja Sreedhara Murthy-1KS16CS061
Sameeksha M Gupta-1KS16CS081
Priyanka Pandit-1KS16CS070

**Question:**
**Computing end to end delay with an ack.**

Consider a network connecting Host A to Host B via a router R using store and forward switching. The transmission speeds of two links are given as t1 and t2 in Mbps. The distance of each link is given as d1 and d2 in kilometers. The speed of communication S*10^8 m/s. Ignore the processing delay in router. Suppose host A wants to send 2 packets each of size M megabits. A will send next packet after receiving acknowledgement from B. The size of acknowledgement packet is A Mbits. Compute the end to end transmission delay. Output should display the time (in ms) for each packet when it reached R and host B.

**Instruction on how to execute the program:**
We need to find the total end-to-end delay with an acknowledgement for two packets.

                             Transmission delay= data size/bandwidth.
                             
                             Propogation delay= distance/transmission speed. 
**Description:**
**First Packet:**
The first packet is transmitted from host A to router R which includes transmission and propogation.
The first packet is then transmitted from router R to host B which includes transmission and propogation.
Now host B should send an acknowledgement to host A.The second packet cannot be transmitted till the acknowledgement is sent from B.

**Second Packet:**
The second packet is transmitted from host A to router R which includes transmission and propogation.
The second packet is then transmitted from router R to host B which includes transmission and propogation.
Now host B should send an acknowledgement to host A.The second packet cannot be transmitted till the acknowledgement is sent from B.

*After host A recieves the acknowledgement from host B,the total end-to-end delay is noted.

**Challenges/Issues faced while writing the program:**
We thought we had to use ns2 which was the wrong approch.
The result wasn't in appropriate format required which was caused due to wrong conversion of data.


