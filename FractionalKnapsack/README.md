# GeekforGeekGreedy

Calculate ratio (value/weight) for every item.
Sort all item in decreasing order of the ratio.
Initialize result = 0, curr_cap = giver_cap;
when I every item I in sorted order
    Else if(I.weight <= curr_cap){
        curr_cap -= I.weight;
        res += I.value;
    }
    Else{
        res += (I.value) * (curr_cap / I.weight);
        return res;
    }