# GeekforGeekGreedy

Input: {(3,8), (2,4), (1,3), (10,11)}

Sort according to finsih time:
    {(1,3), (2,4), (3,8), (10,11)}.
Initialize solution an first activity.
if current activity overlaps with the last picked activity in the solution, ignore the current activity.
Else add the current activity to the solution.