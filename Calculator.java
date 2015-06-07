class Calculator{
	 double total_Attack;
	 double Leader_times;
	 double ViceLeader_times;
	 double combo;
	 double normal;
	 double strong;
	 double eli_times;
	 
	 double damage = 0;
	 
	 //set and get total Attack
	 void setTotal_Attack(double ntotal_Attack){
		total_Attack = ntotal_Attack;
	 }
	 double getTotal_Attack(){
		return total_Attack;
	 }
	 
	 //set and get Leader_times
	 void setLeader_times(double nLeader_times){
		 Leader_times = nLeader_times;
	 }
	 double getLeader_times(){
		 return Leader_times;
	 }
	 
	 //set and get ViceLeader_times
	 void setViceLeader_times(double nViceLeader_times){
		 ViceLeader_times = nViceLeader_times;
	 }
	 double getViceLeader_times(){
		 return ViceLeader_times;
	 }
	 
	 //set and get combo
	 void setCombo(double ncombo){
		 combo = ncombo;
	 }
	 double getCombo(){
		 return combo;
	 }

	 //set and get normal
	 void setNormal(double nnormal){
		 normal = nnormal;
	 }
	 double getNormal(){
		 return normal;
	 }
	 
	 //set and get strong
	 void setStrong(double nstrong){
		 strong = nstrong;
	 }
	 double getStrong(){
		 return strong;
	 }
	 
	 //
	 void setEli_times(double neli_times){
		eli_times = neli_times;
	 }
	 double getEli_times(){
		 return eli_times;
	 }
	 
	 public double getDamage(){
		 
		 final double percent = 0.25;
		 final double strongPer = 0.4;
		 double rune = 0;
		 
		 rune = (normal * percent) + (strong * percent) + (eli_times * percent);
		 damage = total_Attack * Leader_times * ViceLeader_times * (1+(combo-1)* percent) * rune;
		 
		 return damage;
	 }
	 
}
